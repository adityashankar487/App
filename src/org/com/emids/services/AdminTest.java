package org.com.emids.services;



import org.junit.Assert;
import org.junit.Test;



public class AdminTest {

	@Test
	public void userEnterWrongUsernameorPassword() {
		Assert.assertFalse(Admin.logInValidation("lsdjfh","sahgashdgf"));
	}
	
	@Test
	public void userEnterRightUsernameorPassword() {
		Assert.assertTrue(Admin.logInValidation("admin","admin"));
	}
}
