package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import automation_core.Base;
import pages.EditManagePage;
import pages.LoginPage;
import pages.Manage_pages;

public class EditmanagePageTest extends Base {
@Test
	public void editmanagePageTest()
	
	{
		
	String usernamevalue="admin";
	String passwordvalue="admin";

	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue);
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	EditManagePage editmanagepage=new EditManagePage(driver);
	editmanagepage.clickmanagepage();
	editmanagepage.editClick();
	editmanagepage.enterTitle("Stationary Items");
	editmanagepage.enterDescription("Here You Can Add All Stationary Items");
	editmanagepage.enterPageName("Books"); 
	editmanagepage.clickOnSaveButton();
	 
	
boolean ismanageisavailable = editmanagepage.isHeaderLoaded();
assertTrue(ismanageisavailable,"Manage page is not Load");
	
	}

}


