package _2maincomps;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorManyTestMethodsTest {
	private Calculator calc = new Calculator();

	@Test
	public void testSumPositives() {
		Assert.assertEquals(calc.sum(1, 2), 3);
	}
	
	@Test
	public void testSumPositiveAndNegative() {
		Assert.assertEquals(calc.sum(-1, 2), 1);
	}

	@Test
	public void testSumPositiveAndZero() {
		Assert.assertEquals(calc.sum(2, 0), 2);
	}
}

