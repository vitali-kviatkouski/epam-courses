package _2maincomps;

import org.junit.Assert;

public class SimpleCalculatorTest extends AbstractTest {
	public SimpleCalculatorTest() {
		calc = new Calculator();
	}
	
	@Override
	public void testSumPositives() {
		Assert.assertEquals(calc.sum(1, 2), 3);
	}
}
