package _3grouping.grouping.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import _3grouping.grouping.CalculatorSqrtTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  CalculatorSqrtTest.class,
  BasicOperationsSuite.class
})
public class AllOperations2Suite {
	@BeforeClass
	public static void beforeAllTests() {
		System.out.println("Перед всеми тестами");
	}
	
	@AfterClass
	public static void afterAllTests() {
		System.out.println("После всех тестами");
	}
}
