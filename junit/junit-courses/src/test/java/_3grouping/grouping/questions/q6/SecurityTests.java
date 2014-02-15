package _3grouping.grouping.questions.q6;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import _3grouping.grouping.questions.q3.RoleManagerTest;
import _3grouping.grouping.questions.q3.RoleTests;
import _3grouping.grouping.questions.q3.UserManagerTest;
import _3grouping.grouping.questions.q3.UserTests;

@IncludeCategory(UserTests.class)
@ExcludeCategory(RoleTests.class)
@SuiteClasses( {
	UserManagerTest.class,
	RoleManagerTest.class
})
public class SecurityTests {
}
