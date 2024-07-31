package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import automation_core.Base;
import pages.AddAdminNewUser;
import pages.AddSubCategory;
import pages.LoginPage;

public class AddSubCategoryTest extends Base {
	@Test
	public void Login()
	{
	String usernamevalue="admin";
	String passwordvalue="admin";

	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue);
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	AddSubCategory addsubcategory=new AddSubCategory(driver);
	addsubcategory.clickNewSubcategory();
	addsubcategory.newButtonClick();
	addsubcategory.selectCategoryFromDropdown();
	addsubcategory.enterSubCategory("Car");
	addsubcategory.fileUpload();
	addsubcategory.clickOnSaveButton();
	

	 
boolean ismanageisavailable = addsubcategory.isHeaderLoaded();
assertTrue(ismanageisavailable,"Manage page is not Load");	
} }
	



