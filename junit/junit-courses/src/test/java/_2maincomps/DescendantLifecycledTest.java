package _2maincomps;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DescendantLifecycledTest extends ParentLifecycledTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Наследник: Перед выполнением всех тестовых методов");
	}
	
	@Before
	public void before() {
		System.out.println("Наследник: Перед выполнением тестового метода");
	}
	
	@After
	public void after() {
		System.out.println("Наследник: После выполнения тестового метода");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Наследник: После выполнения всех тестовых методов");
	}
	
	@Test
	public void testMethodDescendant() {
		System.out.println("Наследник: Тестовый метод выполняется");
	}
}
