package _2maincomps.questions.q2;

import org.junit.Assert;
import org.junit.Test;

public class QuestionTest {
	private Calculator calc = new Calculator();

	@Test
	public void testSum1() {
		Assert.assertEquals(2, calc.divide(10, 2));
	}
}

class Calculator {
	int divide(int a, int b) {
		return a/b;
	}
}
