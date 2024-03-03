package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import applicationPages.LoginPage;
import basePackage.BaseClass;

public class LoginPageTest extends BaseClass {
	
	LoginPage loginPage =new LoginPage(); ;
	
	@BeforeMethod
	public void IniliseBrowser() throws Exception {
		InitilisingDirver();
		 loginPage = new LoginPage();
	}

@Test
public void TestLogin() throws Exception {
	Thread.sleep(3000);
	String TitleOfpage=loginPage.LoginTest("standard_user", "secret_sauce");
	Assert.assertEquals(TitleOfpage, "Swag Labs");
}


@AfterMethod
public void CloseApplication() {
	getDriver().close();
}


}
