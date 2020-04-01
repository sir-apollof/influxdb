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

package io.warp10.script.fwt.wavelets;

import io.warp10.script.fwt.Wavelet;

public class Wavelet_sym20 extends Wavelet {

  private static final int transformWavelength = 2;

  private static final double[] scalingDeComposition = new double[] { 3.695537474835221e-07, -1.9015675890554106e-07, -7.919361411976999e-06, 3.025666062736966e-06, 7.992967835772481e-05, -1.928412300645204e-05, -0.0004947310915672655, 7.215991188074035e-05, 0.002088994708190198, -0.0003052628317957281, -0.006606585799088861, 0.0014230873594621453, 0.01700404902339034, -0.003313857383623359, -0.031629437144957966, 0.008123228356009682, 0.025579349509413946, -0.07899434492839816, -0.02981936888033373, 0.4058314443484506, 0.75116272842273, 0.47199147510148703, -0.0510883429210674, -0.16057829841525254, 0.03625095165393308, 0.08891966802819956, -0.0068437019650692274, -0.035373336756604236, 0.0019385970672402002, 0.012157040948785737, -0.0006111263857992088, -0.0034716478028440734, 0.0001254409172306726, 0.0007476108597820572, -2.6615550335516086e-05, -0.00011739133516291466, 4.525422209151636e-06, 1.22872527779612e-05, -3.2567026420174407e-07, -6.329129044776395e-07,  };
  private static final double[] waveletDeComposition = new double[] { 6.329129044776395e-07, -3.2567026420174407e-07, -1.22872527779612e-05, 4.525422209151636e-06, 0.00011739133516291466, -2.6615550335516086e-05, -0.0007476108597820572, 0.0001254409172306726, 0.0034716478028440734, -0.0006111263857992088, -0.012157040948785737, 0.0019385970672402002, 0.035373336756604236, -0.0068437019650692274, -0.08891966802819956, 0.03625095165393308, 0.16057829841525254, -0.0510883429210674, -0.47199147510148703, 0.75116272842273, -0.4058314443484506, -0.02981936888033373, 0.07899434492839816, 0.025579349509413946, -0.008123228356009682, -0.031629437144957966, 0.003313857383623359, 0.01700404902339034, -0.0014230873594621453, -0.006606585799088861, 0.0003052628317957281, 0.002088994708190198, -7.215991188074035e-05, -0.0004947310915672655, 1.928412300645204e-05, 7.992967835772481e-05, -3.025666062736966e-06, -7.919361411976999e-06, 1.9015675890554106e-07, 3.695537474835221e-07,  };

  private static final double[] scalingReConstruction = new double[] { -6.329129044776395e-07, -3.2567026420174407e-07, 1.22872527779612e-05, 4.525422209151636e-06, -0.00011739133516291466, -2.6615550335516086e-05, 0.0007476108597820572, 0.0001254409172306726, -0.0034716478028440734, -0.0006111263857992088, 0.012157040948785737, 0.0019385970672402002, -0.035373336756604236, -0.0068437019650692274, 0.08891966802819956, 0.03625095165393308, -0.16057829841525254, -0.0510883429210674, 0.47199147510148703, 0.75116272842273, 0.4058314443484506, -0.02981936888033373, -0.07899434492839816, 0.025579349509413946, 0.008123228356009682, -0.031629437144957966, -0.003313857383623359, 0.01700404902339034, 0.0014230873594621453, -0.006606585799088861, -0.0003052628317957281, 0.002088994708190198, 7.215991188074035e-05, -0.0004947310915672655, -1.928412300645204e-05, 7.992967835772481e-05, 3.025666062736966e-06, -7.919361411976999e-06, -1.9015675890554106e-07, 3.695537474835221e-07,  };
  private static final double[] waveletReConstruction = new double[] { 3.695537474835221e-07, 1.9015675890554106e-07, -7.919361411976999e-06, -3.025666062736966e-06, 7.992967835772481e-05, 1.928412300645204e-05, -0.0004947310915672655, -7.215991188074035e-05, 0.002088994708190198, 0.0003052628317957281, -0.006606585799088861, -0.0014230873594621453, 0.01700404902339034, 0.003313857383623359, -0.031629437144957966, -0.008123228356009682, 0.025579349509413946, 0.07899434492839816, -0.02981936888033373, -0.4058314443484506, 0.75116272842273, -0.47199147510148703, -0.0510883429210674, 0.16057829841525254, 0.03625095165393308, -0.08891966802819956, -0.0068437019650692274, 0.035373336756604236, 0.0019385970672402002, -0.012157040948785737, -0.0006111263857992088, 0.0034716478028440734, 0.0001254409172306726, -0.0007476108597820572, -2.6615550335516086e-05, 0.00011739133516291466, 4.525422209151636e-06, -1.22872527779612e-05, -3.2567026420174407e-07, 6.329129044776395e-07,  };

  static {
    //
    // Reverse the arrays as we do convolutions
    //
    reverse(scalingDeComposition);
    reverse(waveletDeComposition);
  }

  private static final void reverse(double[] array) {
    int i = 0;
    int j = array.length - 1;
    
    while (i < j) {
      double tmp = array[i];
      array[i] = array[j];
      array[j] = tmp;
      i++;
      j--;
    }
  }

  public int getTransformWavelength() {
    return transformWavelength;
  }

  public int getMotherWavelength() {
    return waveletReConstruction.length;
  }

  public double[] getScalingDeComposition() {
    return scalingDeComposition;
  }

  public double[] getWaveletDeComposition() {
    return waveletDeComposition;
  }

  public double[] getScalingReConstruction() {
    return scalingReConstruction;
  }

  public double[] getWaveletReConstruction() {
    return waveletReConstruction;
  }
}

