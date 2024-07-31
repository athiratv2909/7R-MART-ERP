package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import automation_core.Base;
import pages.LoginPage;
import pages.Manage_pages;

public class Manage_PagesTest extends Base {
@Test
	public void Login()
	{
	String usernamevalue="admin";
	String passwordvalue="admin";

	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue);
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	Manage_pages managePage=new Manage_pages(driver);
	managePage.clickmanagepage();
	
	  managePage.clickOnNewButton(); managePage.enterTitle("Stationary Items");
	  managePage.enterDescription("Here You Can Add All Stationary Items");
	  managePage.enterPageName("Books"); managePage.clickOnSaveButton();
	 
	
boolean ismanageisavailable = managePage.isHeaderLoaded();
assertTrue(ismanageisavailable,"Manage page is not Load");
	
	}

}
