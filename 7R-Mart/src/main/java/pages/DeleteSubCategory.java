package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DeleteSubCategory {
	WebDriver driver;

	public DeleteSubCategory(WebDriver driver)	
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private WebElement addnewsubcategory;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/delete?del=334&page_ad=1]")private WebElement deletenbtn;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/delete?del=363&page_ad=1']")private WebElement confirmationalert;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement headeralert;


	
	

	public void clickNewSubcategory()
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addnewsubcategory);
	}
	
	
	public void deleteSubCategory()
	{
		deletenbtn.click();
	}
	
	
	
	public void alertBox()
	{
		confirmationalert.click();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
	}
	
	
	public boolean isHeaderLoaded()

	{
		return headeralert.isDisplayed();


	}

	
	}	





