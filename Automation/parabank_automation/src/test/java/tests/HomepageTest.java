package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.UtilBase;
import variables.Var;

public class HomepageTest extends UtilBase {

	

	@Test
	public void verifyHomepageLoadedSuccessfully() {

		try {

			driver.get(Var.baseurl);

//			check the pass / fail condition
			String actualTitle = driver.getTitle();
			String expectedTitle = "ParaBank | Welcome | Online Banking";
			Assert.assertEquals(actualTitle, expectedTitle, "Page Loaded Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in verifyHomepageLoadedSuccessfully");
			Assert.assertTrue(false, "Failed to load page");
		}

	}
}
