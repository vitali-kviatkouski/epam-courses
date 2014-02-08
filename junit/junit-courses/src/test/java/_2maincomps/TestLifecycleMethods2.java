package _2maincomps;

import org.junit.*;

public class TestLifecycleMethods2 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Перед выполнением всех тестовых методов");
	}
	
	@Before
	public void before() {
		System.out.println("Перед выполнением тестового метода");
	}
	
	@After
	public void after() {
		System.out.println("После выполнения тестового метода");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("После выполнения всех тестовых методов");
	}
	
	@Test
	public void testMethod() {
		System.out.println("Тестовый метод выполняется");
	}
}
