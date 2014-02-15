package _2maincomps.questions.q3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class QuestionTest {
	@Test
	public void testSum1() {
		Assert.assertEquals(1+1, 2);
	}
	
	@Test
	@Ignore
	public void testSum2() {
	}
	
	@Test
	public void testSum3() {
		Assert.assertEquals(1, 2);
	}
	
	@Test
	public void testSum4() {
		Assert.assertEquals(1, ((Integer) null).intValue());
	}
}
