package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utility.PageUtility;
import utility.WebElementUtility;
import utility.WebElementUtility;

public class AddSubCategory {
	WebDriver driver;
	utility.PageUtility pageutility=new utility.PageUtility();
	WebElementUtility webelementutility=new WebElementUtility();
	
	public AddSubCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[7]/div/a")private WebElement subcategory;
	
	@FindBy(xpath="//h1[text()='List Sub Categories']")private WebElement headerlistsubcategories;
	@FindBy(xpath="//a[@onclick='click_button(1)']")private WebElement rednewbutton;
	@FindBy(xpath="//h1[text()='Add Sub Category']")private WebElement headeraddsubcategory;
	
	@FindBy(xpath="//select[@class='form-control selectpicker']")private WebElement categorydropdown;
	@FindBy(xpath="//input[@name='subcategory']")private WebElement subcategorytextfield;
	@FindBy(xpath="//button[@name='create']")private WebElement savebutton;
		
	public void clickOnManageCategory()
	{
		subcategory.click();
		
	}
	public boolean isHeaderListSubCategoriesVisible()
	{
		boolean isheaderlistsubcategoriesavailable=webelementutility.isElementDisplayed(headerlistsubcategories);
		return isheaderlistsubcategoriesavailable;
	}
	

	public void clickOnNewInListSubCategory()
	{
	rednewbutton.click();
	
	}

	public boolean isHeaderAddSubCategoryVisible()
	{
	boolean isheaderaddsubcategoryavailable=webelementutility.isElementDisplayed(headeraddsubcategory);
	return isheaderaddsubcategoryavailable;
	}
	public void enterDataInAddSubcategoryWindow(String categorydropdownvalue,String subcategorytextfieldvalue)
	{
	
	pageutility.selectByValue(categorydropdown, categorydropdownvalue);
	subcategorytextfield.sendKeys(subcategorytextfieldvalue);
	}
	public void clickOnSaveButton()
	{
	savebutton.click();
	
	}


	}
