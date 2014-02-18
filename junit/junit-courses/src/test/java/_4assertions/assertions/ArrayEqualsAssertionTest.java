package _4assertions.assertions;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class ArrayEqualsAssertionTest {
	@Test
	public void testCompareArrays() {
		Assert.assertArrayEquals(new int[] {2, 3, 5, 7}, new int[]{3, 1, 6, 7});
	}
	
	@Test
	public void testNulls() {
		Assert.assertNotNull("String");
		Assert.assertNotNull((String) null);
	}
	
	@Test
	public void testFailMethod() {
		try {
			int[] array = new int[] {0, 1, 2};
			System.out.println(getElementNumber100(array));
			Assert.fail();
		} catch (IndexOutOfBoundsException e) {
			// nothing to do, test was executed correctly
		}
	}

	private int getElementNumber100(int[] array) {
		return array[100];
	}
	
	@Test
	public void testAssertThat() {
		int var = 9;
		Assert.assertEquals(9, var);
		Assert.assertThat(var, equalTo(9));
		Iterable<String> values = Arrays.asList("One", "Two", "Three");
		Assert.assertThat(values, contains("Two"));
	}
}
