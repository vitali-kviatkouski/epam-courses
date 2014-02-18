package _4assertions.assertions;

import org.junit.Assert;
import org.junit.Test;

public class LogicalAssertionTest {
	@Test
	public void testUser() {
		Assert.assertTrue(userIsValid("testUser"));
		Assert.assertFalse(userIsBlocked("testUser"));
	}

	private boolean userIsBlocked(String string) {
		return false;
	}

	private boolean userIsValid(String string) {
		return true;
	}
}
