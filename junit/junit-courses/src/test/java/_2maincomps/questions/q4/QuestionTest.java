package _2maincomps.questions.q4;

import org.junit.Assert;
import org.junit.Test;

public class QuestionTest {
	private Counter counter = new Counter();

	@Test
	public void testIncrement1() {
		Assert.assertEquals(1, counter.increment());
	}
	
	@Test
	public void testIncrement2() {
		Assert.assertEquals(1, counter.increment());
	}
}

class Counter {
	private int i = 0;
	
	int increment() {
		return ++i;
	}
	
	void reset() {
		i = 0;
	}
}