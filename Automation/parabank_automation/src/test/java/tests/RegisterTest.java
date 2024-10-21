package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.UtilBase;
import utilities.WebElementLib;
import variables.Var;

public class RegisterTest extends UtilBase {

	@Test
	public void registerWithSuccess() {

		try {

//			click the register link
			pObjHome.link_register().click();

//			enter the values
			pObjReg.input_firstname().sendKeys(Var.firstName);
			pObjReg.input_lastname().sendKeys(Var.lastName);
			pObjReg.input_address().sendKeys(Var.address);
			pObjReg.input_city().sendKeys(Var.city);
			pObjReg.input_state().sendKeys(Var.state);
			pObjReg.input_zipcode().sendKeys(Var.zipCode);
			pObjReg.input_phone().sendKeys(Var.phoneNumber);
			pObjReg.input_ssn().sendKeys(Var.ssn);
			pObjReg.input_username().sendKeys(Var.username);
			pObjReg.input_password().sendKeys(Var.password);
			pObjReg.input_confirm().sendKeys(Var.password);
			Thread.sleep(2000);
			pObjReg.btn_register().click();

//			check the pass / fail condition
			Assert.assertEquals(WebElementLib.doesElementExist(pObjLogin.link_logout()), true,
					"Your account was created successfully. You are now logged in.");
//			logout
			pObjLogin.link_logout().click();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in registerWithSuccess");
			Assert.assertTrue(false, "Registration Failed");
		}

	}

}
