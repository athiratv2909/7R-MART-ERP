package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAdminNewUser {

	WebDriver driver;

	public AddAdminNewUser(WebDriver driver)	
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")private WebElement clicknewuser;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement clicknewbtn;
	@FindBy(xpath="//input[@id='username']")private WebElement enternewusername;
	@FindBy(xpath="//input[@id='password']")private WebElement enternewpassword;
	@FindBy(xpath="//select[@id='user_type']")private WebElement dropdownfield;
	@FindBy(xpath="//[ @class='btn btn-block-sm btn-danger']")private WebElement submitbutton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement headeralert;

	
	

	public void clickNewAdminUser()
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clicknewuser);
	}
	
	
	public void newClick()
	{
		clicknewbtn.click();
	}

	public void enterNewUserName(String adminusername)

	{
		
		enternewusername.sendKeys(adminusername);

	}

	public void enterNewPassword(String adminpassword)

	{
		enternewpassword.sendKeys(adminpassword);

	}

	public void dropdownSelect()

	{
		Select select =new Select(dropdownfield);
		select.selectByIndex(1);

	}
	
	public void clickOnSaveButton()
	{
		submitbutton.click();
		
	}
	
	
	public boolean isHeaderLoaded()

	{
		return headeralert.isDisplayed();


	}

	
	}	
	


