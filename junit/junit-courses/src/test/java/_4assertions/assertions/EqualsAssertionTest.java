package _4assertions.assertions;

import org.junit.Assert;
import org.junit.Test;

public class EqualsAssertionTest {
	@Test
	public void testEquals() {
		Assert.assertEquals(1.0/3, 0.33, 0.004);
	}
	
	@Test
	public void testNotEquals() {
		Assert.assertNotEquals("111", "111");
	}
}
