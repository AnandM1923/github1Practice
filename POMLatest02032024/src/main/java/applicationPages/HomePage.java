package applicationPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;
import commonUtilitesActions.AllActionsUtilities;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	List<WebElement> filetrs;
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public List<String> ListOFFilters() {
		List<String> FileterStringsTexts = AllActionsUtilities.SelectListOfFliter(getDriver(),filetrs);
		return FileterStringsTexts;
		
	}

}
 