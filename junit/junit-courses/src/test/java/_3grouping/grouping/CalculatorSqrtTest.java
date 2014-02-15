package _3grouping.grouping;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import _3grouping.grouping.categories.BasicCases;
import _3grouping.grouping.categories.ExceptionalCases;

@Category({BasicCases.class})
public class CalculatorSqrtTest {
	private Calculator calc = new Calculator();
		
	@Test
	public void testSqrtPositive() {
		Assert.assertEquals(calc.sqrt(9), 3);
	}

	@Test
	public void testSqrtZero() {
		Assert.assertEquals(calc.sqrt(0), 0);
	}

	@Category({ExceptionalCases.class})
	@Test(expected = IllegalArgumentException.class)
	public void testSqrtNegative() {
		calc.sqrt(-2);
	}
}
