package _1intro;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {
	private Calculator calc = new Calculator();

	@Test
	public void testMethod() {
		Assert.assertEquals(calc.sum(1, 2), 3);
	}
}

class Calculator {
	public int sum(int a, int b) {
		return a + b;
	}
}
