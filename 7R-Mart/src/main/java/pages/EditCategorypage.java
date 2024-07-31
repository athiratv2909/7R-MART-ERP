package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCategorypage {
	WebDriver driver;

	public EditCategorypage(WebDriver driver)	
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")private WebElement newcategory;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/category/edit?edit=285&page_ad=1']")private WebElement editbutton;
	@FindBy(xpath="//input[@id='category']")private WebElement entercategory;
	@FindBy(xpath="//button[class='btn btn-danger']")private WebElement updatebtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement headeralert;



	public void clickNewCategory()
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", newcategory);
	}
	
	
	public void clickoneditCategory()
	{
		editbutton.click();
	}
	
	
	public void enterValueInCategory(String category)

	{
		entercategory.sendKeys(category);

	}
public void ClickOnUpdate()
{
	
	updatebtn.click();
}

	
	public boolean isHeaderLoaded()

	{
		return headeralert.isDisplayed();


	}

	
	}	




