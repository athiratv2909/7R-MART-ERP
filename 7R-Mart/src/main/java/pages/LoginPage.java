package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WebElementUtility;

public class LoginPage {

WebDriver driver;
WebElementUtility webelementsutility=new WebElementUtility();

public LoginPage(WebDriver driver)	
{
this.driver=driver;
PageFactory.initElements(driver,this);


}

@FindBy(xpath="//input[@name='username']")private WebElement username;
@FindBy(xpath="//input[@name='password']")private WebElement password;
@FindBy(xpath="//button[@class='btn btn-dark btn-block']")private WebElement signin;
@FindBy(xpath="//p[text()='Dashboard']")private WebElement dashboardvalue;
@FindBy(xpath="//h5[text()=\" Alert!\"]")private WebElement alerticon;

public void enterUserNameOnUserNameField(String usernamevalue)
{
username.sendKeys(usernamevalue);	

}

public void enterPasswordOnPasswordField(String passwordvalue)

{
	
password.sendKeys(passwordvalue);

}

public void clickOnSignInButton()

{
	signin.click();

}

public boolean isHomePageLoaded()

{
	return dashboardvalue.isDisplayed();


}

public boolean isAlertboxVisible()
{
	boolean alertavailable=webelementsutility.isElementDisplayed(alerticon);
	return alertavailable;
}

}






