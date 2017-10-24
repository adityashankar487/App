package org.com.emids.services;



import org.junit.Assert;
import org.junit.Test;

public class UserTest {

	@Test
	public void userEnterWrongUsernameorPassword() {
		Assert.assertFalse(User.logInValidation("lsdjfh","sahgashdgf"));
	}
	
	@Test
	public void userEnterRightUsernameorPassword() {
		Assert.assertTrue(User.logInValidation("aditya","Change123"));
	}
	
	
	
}
