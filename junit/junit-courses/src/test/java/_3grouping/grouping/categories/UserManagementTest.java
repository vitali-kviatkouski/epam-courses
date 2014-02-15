package _3grouping.grouping.categories;

import org.junit.experimental.categories.Category;

interface UnitTest {}
interface IntegrationTest {}

public class UserManagementTest {
	@Category({UnitTest.class})
	public void testCreateUser() {
	}
	
	@Category({IntegrationTest.class})
	public void testCreateUserInExternalSystem() {
	}
}


