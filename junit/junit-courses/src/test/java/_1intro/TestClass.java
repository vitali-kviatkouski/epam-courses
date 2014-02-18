package _1intro;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {
	private Calculator calc = new Calculator();

	@Test
	public void testMethod() {
		Assert.assertEquals((Object) null, (Object) null);
	}
}

class Calculator {
	public int sum(int a, int b) {
		return a + b;
	}
}
