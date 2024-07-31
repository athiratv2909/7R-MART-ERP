package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import automation_core.Base;
import pages.AddAdminNewUser;
import pages.AddNewNews;
import pages.LoginPage;

public class AdminUserChangeStatusPageTest extends Base{
	@Test
	public void adminUserChangeStatus()
	{
	String usernamevalue="admin";
	String passwordvalue="admin";

	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue);
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	AddAdminNewUser addadminnewuser=new AddAdminNewUser(driver);
	addadminnewuser.clickNewAdminUser();
	addadminnewuser.newClick();	
	addadminnewuser.enterNewUserName("athira");
	addadminnewuser.enterNewPassword("pass");
	addadminnewuser.dropdownSelect();
	addadminnewuser.clickOnSaveButton();
	
	 
boolean ismanageisavailable = addadminnewuser.isHeaderLoaded();
assertTrue(ismanageisavailable,"Manage page is not Load");	
} }

