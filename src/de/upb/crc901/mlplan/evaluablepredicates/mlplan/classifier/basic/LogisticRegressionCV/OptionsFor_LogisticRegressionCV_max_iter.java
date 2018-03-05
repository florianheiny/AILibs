
package de.upb.crc901.mlplan.evaluablepredicates.mlplan.classifier.basic.LogisticRegressionCV;
/*
    max_iter : int, optional
    Maximum number of iterations of the optimization algorithm.


*/

import de.upb.crc901.mlplan.evaluablepredicates.mlplan.OptionsPredicate;

import java.util.Arrays;
import java.util.List;

public class OptionsFor_LogisticRegressionCV_max_iter extends OptionsPredicate {

  private static List<Object> validValues = Arrays.asList(new Object[] { 10, 30, 50, 100, 200 });

  @Override
  protected List<? extends Object> getValidValues() {
    return validValues;
  }
}
