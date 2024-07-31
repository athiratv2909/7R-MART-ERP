package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewNews {
	
	WebDriver driver;

	public AddNewNews(WebDriver driver)	
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);

	}
	

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")private WebElement clicknews;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")private WebElement clicknew;
	@FindBy(xpath="//textarea[@placeholder='Enter the news']")private WebElement enternews;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement clickonsave;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement messageheader;

	

	public void clickNewspage()
	
	{
		clicknews.click();
	}
	
	
	
	public void clickNewBtn()
	{
		 clicknew.click(); ;
	}

	
	public void enterNews(String news)

	{
		
		enternews.sendKeys(news);

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
	




