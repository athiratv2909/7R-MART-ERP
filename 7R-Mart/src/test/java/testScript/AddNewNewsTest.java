package testScript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import automation_core.Base;
import pages.AddNewNews;
import pages.LoginPage;

public class AddNewNewsTest extends Base {
	
	@Test
public void addNewNewsPageTest()
	
	{
		
	String usernamevalue="admin";
	String passwordvalue="admin";

	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(usernamevalue);
	loginpage.enterPasswordOnPasswordField(passwordvalue);
	loginpage.clickOnSignInButton();
	
	AddNewNews addnewnews=new AddNewNews(driver);
	addnewnews.clickNewspage();
	addnewnews.clickNewBtn();
	addnewnews.enterNews("Welcome To New News World");
	addnewnews.clickOnSaveButton();
	 
	
boolean ismanageisavailable = addnewnews.isHeaderLoaded();
assertTrue(ismanageisavailable,"Manage page is not Load");
	
	}

}




