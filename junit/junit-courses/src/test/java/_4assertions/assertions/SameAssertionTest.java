package _4assertions.assertions;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SameAssertionTest {
	@Test
	public void testAssertSame() {
		Assert.assertSame("Hello", "Hello");
		Assert.assertSame(new Double(2.14), new Double(2.14));
	}
}
