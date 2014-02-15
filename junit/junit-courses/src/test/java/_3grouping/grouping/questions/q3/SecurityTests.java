package _3grouping.grouping.questions.q3;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@IncludeCategory(UserTests.class)
@SuiteClasses( {
	UserManagerTest.class,
	RoleManagerTest.class
})
public class SecurityTests {
}
