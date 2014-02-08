package _2maincomps;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorAllInOneTest {
	private Calculator calc = new Calculator();

	@Test
	public void testMethod() {
		Assert.assertEquals(calc.sum(1, 2), 3);
		Assert.assertEquals(calc.sum(2, -1), 1);
		Assert.assertEquals(calc.sum(2, 0), 2);
	}
}

