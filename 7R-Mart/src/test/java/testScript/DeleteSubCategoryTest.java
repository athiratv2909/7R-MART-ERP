package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import automation_core.Base;
import pages.AddSubCategory;
import pages.DeleteSubCategory;
import pages.LoginPage;

public class DeleteSubCategoryTest extends Base{
	@Test
	public void Login()
	{
	String usernamevalue="admin";
	String passwordvalue="admin";

	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue);
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	DeleteSubCategory deletesubcategory=new DeleteSubCategory(driver);
	deletesubcategory.clickNewSubcategory();
	deletesubcategory.deleteSubCategory();
	deletesubcategory.alertBox();
	 
boolean ismanageisavailable = deletesubcategory.isHeaderLoaded();
assertTrue(ismanageisavailable,"Manage page is not Load");	
} }
	




