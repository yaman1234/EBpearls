package pages;

import org.openqa.selenium.WebElement;

import utilities.UtilBase;
import utilities.WebElementLib;

public class LoginPage extends UtilBase{

	/***************************** ACCOUNT SERVICES ***************************/
	public WebElement link_logout() {
		return WebElementLib.findMyElement("linktext", "Log Out");
	}
}
