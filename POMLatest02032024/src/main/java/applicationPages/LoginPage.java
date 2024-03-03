package applicationPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseClass;
import commonUtilitesActions.AllActionsUtilities;

public class LoginPage extends BaseClass {
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(getDriver(), this);
		
	}
	
	@FindBy(id="login-button")
	WebElement Loginele;
	
	@FindBy(id="user-name")
	WebElement user_name;
	
	@FindBy(id="password")
	WebElement passwordT;
	

	public String LoginTest(String un, String psrd) {
		AllActionsUtilities.Sendvalues(getDriver(), user_name, un);
		AllActionsUtilities.Sendvalues(getDriver(), passwordT, psrd);
		AllActionsUtilities.ClickOnWebElement(getDriver(),Loginele);
		String TitlOFthePage=getDriver().getTitle();
		return TitlOFthePage;
	}
	
	
	
	public void  ClickOnElement() {
		
		AllActionsUtilities.ClickOnWebElement(getDriver(),Loginele);
	}

}
