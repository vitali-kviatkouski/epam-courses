package _3grouping.grouping.questions.q2;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses( {
	Test1.class
})
public class BasicTests {
	public BasicTests() {
		System.out.println("In constructor");
	}
	
	public void before() {
		System.out.println("In before method");
	}
}
