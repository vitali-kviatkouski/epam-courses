package _2maincomps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLifecycleMethods {
	@Before
	public void before() {
		System.out.println("Перед выполнением тестового метода");
	}
	
	@After
	public void after() {
		System.out.println("После выполнения тестового метода");
	}
	
	@Test
	public void testMethod() {
		System.out.println("Тестовый метод выполняется");
	}
}
