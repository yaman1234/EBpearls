package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.UtilBase;
import utilities.WebElementLib;
import variables.Var;

public class LoginTest extends UtilBase {

	@Test
	public void loginWithSuccess() {
		try {
//			logging in with the registered username
			pObjHome.input_username().sendKeys(Var.username);
			pObjHome.input_password().sendKeys(Var.password);
			pObjHome.btn_login().click();

//			check the pass / fail condition
//			check the pass / fail condition
			Assert.assertEquals(WebElementLib.doesElementExist(pObjLogin.link_logout()), true,
					"Your account was created successfully. You are now logged in.");

		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false, "Login FAILED");
		}
	}

}
