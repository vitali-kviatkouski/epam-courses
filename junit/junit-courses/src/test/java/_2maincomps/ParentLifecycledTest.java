package _2maincomps;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ParentLifecycledTest {
	@BeforeClass
	public static void beforeClassParent() {
		System.out.println("Родитель: Перед выполнением всех тестовых методов");
	}
	
	@Before
	public void beforeParent() {
		System.out.println("Родитель: Перед выполнением тестового метода");
	}
	
	@After
	public void afterParent() {
		System.out.println("Родитель: После выполнения тестового метода");
	}
	
	@AfterClass
	public static void afterClassParent() {
		System.out.println("Родитель: После выполнения всех тестовых методов");
	}
}
