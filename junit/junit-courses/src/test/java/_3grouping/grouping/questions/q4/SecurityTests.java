package _3grouping.grouping.questions.q4;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import _3grouping.grouping.questions.q3.RoleManagerTest;
import _3grouping.grouping.questions.q3.UserManagerTest;
import _3grouping.grouping.questions.q3.UserTests;

@RunWith(Categories.class)
@IncludeCategory(UserTests.class)
@SuiteClasses( {
	UserManagerTest.class,
	RoleManagerTest.class
})
public class SecurityTests {
}
