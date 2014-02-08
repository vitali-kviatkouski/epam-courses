package _2maincomps;

import org.junit.Before;
import org.junit.Test;

public class LifecycledTest {
	private static String setState(String state) {
		System.out.println(state);
		return state;
	}
	private String state = setState("Инициализация при определении");
	
	public LifecycledTest() {
		state = setState("Инициализация в конструкторе");
	}
	
	{
		state = setState("Инициализация в блоке динамической инициализации");
	}
	
	@Before
	public void before() {
		state = setState("Инициализация в @Before");
	}
	
	@Test
	public void testMethod() {
	}
}
