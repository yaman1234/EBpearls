package pages;

import org.openqa.selenium.WebElement;

import utilities.UtilBase;
import utilities.WebElementLib;

public class RegisterPage extends UtilBase {
	/***************************** CUSTOMER LOGIN ***************************/
	public WebElement input_firstname() {
		return WebElementLib.findMyElement("xpath", "//input[@id='customer.firstName']");
	}
	public WebElement input_lastname() {
		return WebElementLib.findMyElement("xpath", "//input[@id='customer.lastName']");
	}
	public WebElement input_address() {
		return WebElementLib.findMyElement("xpath", "//input[@id='customer.address.street']");
	}
	public WebElement input_city() {
		return WebElementLib.findMyElement("xpath", "//input[@id='customer.address.city']");
	}
	public WebElement input_state() {
		return WebElementLib.findMyElement("xpath", "//input[@id='customer.address.state']");
	}
	public WebElement input_zipcode() {
		return WebElementLib.findMyElement("xpath", "//input[@id='customer.address.zipCode']");
	}
	public WebElement input_phone() {
		return WebElementLib.findMyElement("xpath", "//input[@id='customer.phoneNumber']");
	}
	public WebElement input_ssn() {
		return WebElementLib.findMyElement("xpath", "//input[@id='customer.ssn']");
	}
	public WebElement input_username() {
		return WebElementLib.findMyElement("xpath", "//input[@id='customer.username']");
	}
	public WebElement input_password() {
		return WebElementLib.findMyElement("xpath", "//input[@id='customer.password']");
	}
	public WebElement input_confirm() {
		return WebElementLib.findMyElement("xpath", "//input[@id='repeatedPassword']");
	}
	
	public WebElement btn_register() {
		return WebElementLib.findMyElement("xpath", "//input[@value='Register']");
	}
	
	
	
	
	
	
	
	
	
}
