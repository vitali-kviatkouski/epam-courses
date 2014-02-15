package _3grouping.grouping.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import _3grouping.grouping.CalculatorDivideTest;
import _3grouping.grouping.CalculatorSqrtTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  CalculatorDivideTest.class,
  CalculatorSqrtTest.class
})
public class AllOperationsSuite {
}
