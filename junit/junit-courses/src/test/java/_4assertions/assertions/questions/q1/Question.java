package _4assertions.assertions.questions.q1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Question {
	@Test
	public void testMethod() {
		Assert.assertEquals("Операция сложения работает неверно", 8, new Calculator().sum(3, 5));
	}
	
	class Calculator {
		int sum(int a, int b) {
			return a + b;
		}
	}
}
