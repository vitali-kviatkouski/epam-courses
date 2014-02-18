package _4assertions.assertions;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {
	private static final int PRODUCT_COUNT = 3; 
	@Test
	public void testMethod() {
		Assert.assertEquals("Количество товаров отличается от ожидаемого.",
							PRODUCT_COUNT, getShopProductCount());
	}
	private int getShopProductCount() {
		return 2;
	}
}
