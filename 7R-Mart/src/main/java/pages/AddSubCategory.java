package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddSubCategory {
	WebDriver driver;

	public AddSubCategory(WebDriver driver)	
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")private WebElement addnewsubcategory;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']")private WebElement clicknewbtn;
	@FindBy(xpath="//select[@id='cat_id']")private WebElement categorydropdownfield;
	@FindBy(xpath="//input[@id='subcategory']")private WebElement addsubcategory;
	@FindBy(xpath="//input[@id='main_img']")private WebElement fileupload;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement submitbutton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")private WebElement headeralert;

	
	

	public void clickNewSubcategory()
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addnewsubcategory);
	}
	
	
	public void newButtonClick()
	{
		clicknewbtn.click();
	}
	
	public void selectCategoryFromDropdown()

	{
		Select select =new Select(categorydropdownfield);
		select.selectByIndex(1);

	}


	public void enterSubCategory(String subcategory)

	{
		addsubcategory.sendKeys(subcategory);

	}

	public void fileUpload()
	{
		fileupload.sendKeys("file:///C:/Users/HP/Downloads/pdf-sample.pdf");
		fileupload.click();
		
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


