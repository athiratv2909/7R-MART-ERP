package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import automation_core.Base;
import pages.EditCategorypage;
import pages.LoginPage;

public class EditCategoryTest extends Base{
	
	@Test
	public void Login()
{
String usernamevalue="admin";
String passwordvalue="admin";

LoginPage loginpage = new LoginPage(driver);
loginpage.enterUserNameOnUserNameField(usernamevalue);
loginpage.enterPasswordOnPasswordField(passwordvalue);
loginpage.clickOnSignInButton();

EditCategorypage editcategory=new EditCategorypage(driver);
editcategory.clickNewCategory();
editcategory.clickoneditCategory();
editcategory.enterValueInCategory("Cars");
editcategory.ClickOnUpdate();

boolean ismanageisavailable = editcategory.isHeaderLoaded();
assertTrue(ismanageisavailable,"Manage page is not Load");	
} }






