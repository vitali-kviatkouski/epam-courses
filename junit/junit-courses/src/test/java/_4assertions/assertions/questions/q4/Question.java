package _4assertions.assertions.questions.q4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class Question {
	@Test
	public void testMethod() {
		String message = (String) null;
		Assert.assertNotNull(message);
		Assume.assumeNotNull(message);
	}
}
