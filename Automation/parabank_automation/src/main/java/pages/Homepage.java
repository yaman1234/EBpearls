package pages;

import org.openqa.selenium.WebElement;

import utilities.UtilBase;
import utilities.WebElementLib;

public class Homepage extends UtilBase {

	
	/***************************** CUSTOMER LOGIN ***************************/
	public WebElement input_username() {
		return WebElementLib.findMyElement("xpath", "//input[@name='username']");
	}
	public WebElement input_password() {
		return WebElementLib.findMyElement("xpath", "//input[@name='password']");
	}
	public WebElement btn_login() {
		return WebElementLib.findMyElement("xpath", "//input[@value='Log In']");
	}
	
	
	public WebElement link_register() {
		return WebElementLib.findMyElement("linktext", "Register");
	}
	
	
}
