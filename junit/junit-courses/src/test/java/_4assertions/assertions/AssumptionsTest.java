package _4assertions.assertions;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.Test;

public class AssumptionsTest {
	@Test
	public void testAssume() {
		Assume.assumeTrue(System.getProperty("path.separator").equals(":"));
	}
}
