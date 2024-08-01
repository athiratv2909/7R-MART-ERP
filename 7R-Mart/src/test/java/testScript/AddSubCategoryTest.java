
package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import constants.Constants;
import constants.Messages;
import pages.AddSubCategory;
import pages.LoginPage;
import utility.ExcelUtilities;
import utility.RandomDataUtility;

public class AddSubCategoryTest extends Base {
	@Test(groups={"sanity","regression"})
	
	public void verifyTheUserIsAbleToAddSubCategory() throws IOException 
	{
		String usernamevalue=ExcelUtilities.getStringData(1, 0,Constants.LOGIN_PAGE);
		String passwordvalue=ExcelUtilities.getStringData(1, 1,Constants.LOGIN_PAGE);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(usernamevalue);
		loginpage.enterPasswordOnPasswordField(passwordvalue);
		loginpage.clickOnSignInButton();
		
		AddSubCategory addsubcategory=new AddSubCategory(driver);
		addsubcategory.clickOnManageCategory();
		boolean isheaderlistsubcategoriesloaded= addsubcategory.isHeaderListSubCategoriesVisible();
		
		addsubcategory.clickOnNewInListSubCategory();
		boolean isheaderaddsubcategoryloaded=addsubcategory.isHeaderAddSubCategoryVisible();
		
	
		String categorydropdownvalue=ExcelUtilities.getIntegerData(0, 1,Constants.SUB_CATEGORY_DATA_PAGE);
		String subcategoryname=RandomDataUtility.getProductSubCategory();
		String subcategorytextfieldvalue=subcategoryname;
		
		
		addsubcategory.enterDataInAddSubcategoryWindow(categorydropdownvalue,subcategorytextfieldvalue);
		addsubcategory.clickOnSaveButton();
		
		
		Assert.assertTrue(isheaderlistsubcategoriesloaded,Messages.HEADER_LIST_SUBCATEGORIES_NOT_LOADED);
		Assert.assertTrue(isheaderaddsubcategoryloaded,Messages.HEADER_ADD_SUBCATEGORIES_NOT_LOADED);
		
		
	}

}
