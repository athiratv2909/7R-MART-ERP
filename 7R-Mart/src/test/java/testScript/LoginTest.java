package testScript;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Messages;
import dataProviders.DataProviders;
import pages.LoginPage;
import utility.ExcelUtilities;

public class LoginTest extends Base {
	
		@Test(groups={"smoke","regression"}) //if we using multiple group,add variables inside a {}
		public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException
		{
		
				String usernamevalue=ExcelUtilities.getStringData(1, 0, "Login");
				String passwordvalue=ExcelUtilities.getStringData(1, 1, "Login");
				
				LoginPage loginpage = new LoginPage(driver);
				loginpage.enterUserNameOnUserNameField(usernamevalue);
				loginpage.enterPasswordOnPasswordField(passwordvalue);
				loginpage.clickOnSignInButton();
				boolean ishomepageavailable= loginpage.isHomePageLoaded();
				assertTrue(ishomepageavailable,Messages.LOGIN_WITH_VALID_CREDENTIALS);
		}

	
	@Test(groups="regression",dataProvider="InvalidUserCredentials",dataProviderClass=DataProviders.class)
	public void verifyUserLoginWithInvalidCredentials(String usernamevalue,String passwordvalue)
	{
				LoginPage loginpage=new LoginPage(driver);
				loginpage.enterUserNameOnUserNameField(usernamevalue);
				loginpage.enterPasswordOnPasswordField(passwordvalue);
				loginpage.clickOnSignInButton();
				
				boolean isalertboxavailable=loginpage.isAlertboxVisible();
				Assert.assertTrue(isalertboxavailable,Messages.LOGIN_WITH_INVALID_CREDENTIALS);
	}
	
	
	

}