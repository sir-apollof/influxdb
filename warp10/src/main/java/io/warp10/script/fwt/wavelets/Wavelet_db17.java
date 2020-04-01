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

public class Wavelet_db17 extends Wavelet {

  private static final int transformWavelength = 2;

  private static final double[] scalingDeComposition = new double[] { 7.26749296856637e-09, -8.423948446008154e-08, 2.9577009333187617e-07, 3.0165496099963414e-07, -4.505942477225963e-06, 6.990600985081294e-06, 2.318681379876164e-05, -8.204803202458212e-05, -2.5610109566546042e-05, 0.0004394654277689454, -0.00032813251941022427, -0.001436845304805, 0.0023012052421511474, 0.002967996691518064, -0.008602921520347815, -0.0030429899813869555, 0.022733676583919053, -0.0032709555358783646, -0.04692243838937891, 0.022312336178011833, 0.08110598665408082, -0.05709141963185808, -0.12681569177849797, 0.10113548917744287, 0.19731058956508457, -0.12659975221599248, -0.32832074836418546, 0.027314970403312946, 0.5183157640572823, 0.6109966156850273, 0.3703507241528858, 0.13121490330791097, 0.025985393703623173, 0.00224180700103879,  };
  private static final double[] waveletDeComposition = new double[] { -0.00224180700103879, 0.025985393703623173, -0.13121490330791097, 0.3703507241528858, -0.6109966156850273, 0.5183157640572823, -0.027314970403312946, -0.32832074836418546, 0.12659975221599248, 0.19731058956508457, -0.10113548917744287, -0.12681569177849797, 0.05709141963185808, 0.08110598665408082, -0.022312336178011833, -0.04692243838937891, 0.0032709555358783646, 0.022733676583919053, 0.0030429899813869555, -0.008602921520347815, -0.002967996691518064, 0.0023012052421511474, 0.001436845304805, -0.00032813251941022427, -0.0004394654277689454, -2.5610109566546042e-05, 8.204803202458212e-05, 2.318681379876164e-05, -6.990600985081294e-06, -4.505942477225963e-06, -3.0165496099963414e-07, 2.9577009333187617e-07, 8.423948446008154e-08, 7.26749296856637e-09,  };

  private static final double[] scalingReConstruction = new double[] { 0.00224180700103879, 0.025985393703623173, 0.13121490330791097, 0.3703507241528858, 0.6109966156850273, 0.5183157640572823, 0.027314970403312946, -0.32832074836418546, -0.12659975221599248, 0.19731058956508457, 0.10113548917744287, -0.12681569177849797, -0.05709141963185808, 0.08110598665408082, 0.022312336178011833, -0.04692243838937891, -0.0032709555358783646, 0.022733676583919053, -0.0030429899813869555, -0.008602921520347815, 0.002967996691518064, 0.0023012052421511474, -0.001436845304805, -0.00032813251941022427, 0.0004394654277689454, -2.5610109566546042e-05, -8.204803202458212e-05, 2.318681379876164e-05, 6.990600985081294e-06, -4.505942477225963e-06, 3.0165496099963414e-07, 2.9577009333187617e-07, -8.423948446008154e-08, 7.26749296856637e-09,  };
  private static final double[] waveletReConstruction = new double[] { 7.26749296856637e-09, 8.423948446008154e-08, 2.9577009333187617e-07, -3.0165496099963414e-07, -4.505942477225963e-06, -6.990600985081294e-06, 2.318681379876164e-05, 8.204803202458212e-05, -2.5610109566546042e-05, -0.0004394654277689454, -0.00032813251941022427, 0.001436845304805, 0.0023012052421511474, -0.002967996691518064, -0.008602921520347815, 0.0030429899813869555, 0.022733676583919053, 0.0032709555358783646, -0.04692243838937891, -0.022312336178011833, 0.08110598665408082, 0.05709141963185808, -0.12681569177849797, -0.10113548917744287, 0.19731058956508457, 0.12659975221599248, -0.32832074836418546, -0.027314970403312946, 0.5183157640572823, -0.6109966156850273, 0.3703507241528858, -0.13121490330791097, 0.025985393703623173, -0.00224180700103879,  };

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

