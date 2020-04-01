//
//   Copyright 2018  SenX S.A.S.
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
//

package io.warp10.script.ext.concurrent;

import io.warp10.script.NamedWarpScriptFunction;
import io.warp10.script.WarpScriptException;
import io.warp10.script.WarpScriptStack;
import io.warp10.script.WarpScriptStack.Macro;
import io.warp10.script.WarpScriptStackFunction;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Execute a macro in a synchronized way
 */
public class SYNC extends NamedWarpScriptFunction implements WarpScriptStackFunction {

  public SYNC(String name) {
    super(name);    
  }
  
  @Override
  public Object apply(WarpScriptStack stack) throws WarpScriptException {
    
    Object top = stack.pop();
    
    if (!(top instanceof Macro)) {
      throw new WarpScriptException(getName() + " expects a macro on top of the stack.");
    }

    ReentrantLock lock = (ReentrantLock) stack.getAttribute(CEVAL.CONCURRENT_LOCK_ATTRIBUTE);
    
    try {
      if (null != lock) {
        lock.lockInterruptibly();
      }
      stack.exec((Macro) top);   
    } catch (InterruptedException ie) {
      throw new WarpScriptException(ie);
    } finally {      
      if (null != lock && lock.isHeldByCurrentThread()) {
        lock.unlock();
      }
    }

    return stack;
  }
}
