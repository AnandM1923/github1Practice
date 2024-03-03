package testCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import applicationPages.HomePage;
import applicationPages.LoginPage;
import basePackage.BaseClass;

public class HomePageTest extends BaseClass {
	LoginPage loginPage = new LoginPage();
	HomePage homePage=new HomePage();
	
	@BeforeMethod
	public void IniliseBrowser() throws Exception {
		InitilisingDirver();
		 loginPage = new LoginPage();
		 homePage=new HomePage();
	}

@Test
public void VeriFyList() throws Exception {
	Thread.sleep(3000);
	
	loginPage.LoginTest("standard_user", "secret_sauce");
	List<String> originalStirng=new ArrayList<String>();
	List<String> filtertexts = homePage.ListOFFilters();
	
	for(String fi:filtertexts) {
		String[] ingStr = fi.split(" ");
		 originalStirng = Arrays.asList(ingStr);
		
		}
	
	List<String> ActualFilterList=new ArrayList<String>();
	
	
	ActualFilterList.add("Name (A to Z)");
	ActualFilterList.add("Name (Z to A)");
	ActualFilterList.add("Price (low to high)");
	ActualFilterList.add("Price (high to low)");
	
	System.out.println("filtertexts are :" +filtertexts);
	System.out.println("ActualFilterList are :" +ActualFilterList);
	
	System.out.println("First String from lisrt : " +filtertexts.get(0));
	
	System.out.println("First String from lisrt : " +ActualFilterList.get(0));
	
	
	//Assert.assertEquals(originalStirng, ActualFilterList);
	//Assert.assertEquals(filtertexts.get(1), ActualFilterList.get(1));
	//Assert.assertEquals(filtertexts.get(2), ActualFilterList.get(2));
	//Assert.assertEquals(filtertexts.get(3), ActualFilterList.get(3));
	  
	
	
}


@AfterMethod
public void CloseApplication() {
	getDriver().close();
}


}
