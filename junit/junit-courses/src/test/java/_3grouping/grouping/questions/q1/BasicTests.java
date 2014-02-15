package _3grouping.grouping.questions.q1;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import _3grouping.grouping.CalculatorDivideTest;
import _3grouping.grouping.CalculatorSqrtTest;

@RunWith(Categories.class)
@SuiteClasses( {
	CalculatorDivideTest.class, 
	CalculatorSqrtTest.class 
})
public class BasicTests {
	public BasicTests(String s) {
		System.out.println("Doing one-time work here");
	}
}
