package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_pages {

	
	WebDriver driver;

	public Manage_pages(WebDriver driver)	
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and @class='nav-link']")private WebElement clickmanagepage;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement clicknewbotton;
	@FindBy(xpath="//input[@id='title']")private WebElement entertitle;
	@FindBy(xpath="//div[@class='note-editable card-block']")private WebElement descfield;
	@FindBy(xpath="//input[@id='page']")private WebElement pagevalue;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement clickonsave;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement messageheader;

	

	public void clickmanagepage()
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickmanagepage);
	}
	
	public void clickOnNewButton()
	{
		clicknewbotton.click();	

	}

	public void enterTitle(String title)

	{
		
	entertitle.sendKeys(title);

	}

	public void enterDescription(String description)

	{
		descfield.sendKeys(description);

	}

	public void enterPageName(String pagename)

	{
		pagevalue.sendKeys(pagename);

	}
	
	public void clickOnSaveButton()
	{
		clickonsave.click();
		
	}
	
	
	public boolean isHeaderLoaded()

	{
		return messageheader.isDisplayed();


	}

	
	}	
	

