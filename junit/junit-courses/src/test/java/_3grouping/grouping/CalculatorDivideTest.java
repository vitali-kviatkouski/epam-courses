package _3grouping.grouping;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import _3grouping.grouping.categories.BasicCases;
import _3grouping.grouping.categories.ExceptionalCases;

public class CalculatorDivideTest {
	private Calculator calc = new Calculator();
	
	@Category({BasicCases.class})
	@Test
	public void testDividePositives() {
		Assert.assertEquals(calc.divide(10, 2), 5);
	}
	
	@Test
	public void testDividePositiveAndNegative() {
		Assert.assertEquals(calc.divide(-3, 3), -1);
	}

	@Category({ExceptionalCases.class})
	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() {
		calc.divide(2, 0);
	}
}
