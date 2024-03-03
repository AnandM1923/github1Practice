package commonUtilitesActions;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import basePackage.BaseClass;

public class AllActionsUtilities extends BaseClass {
	
	public static void ClickOnWebElement(WebDriver ldriver,WebElement element) {
	boolean flag=false;
	try {
		element.click();
		flag=true;
	}catch(Exception e) {
		System.out.println("Exception occured " +e.getMessage());
		flag=false;
	}if(flag) {
		System.out.println("The Click operation is done on :" +element);
	}else {
		System.out.println("The Click operation is done on :" +element);
	}
		
	}
	
	public static void Sendvalues(WebDriver ldriver,WebElement element,String texts) {
		boolean flag=false;
		try {
			
			element.sendKeys(texts);
			flag=true;
		}catch (Exception e) {
			System.out.println("Exception occured " +e.getMessage());
			flag=false;

		}if(flag) {
			System.out.println("The Sendvalues operation is done on :" +element);
		}else {
			System.out.println("The Sendvalues operation is done on :" +element);
		}
		
	}
	
	
	public static List<String> SelectListOfFliter(WebDriver ldriver,List<WebElement>  element) {
		List<String> FilterList=new ArrayList<String>();
		String filtertexts;
		List<WebElement> filterlist = element;
			
			for(WebElement ele:filterlist) {
				
				String filtertext1s=ele.getText();
				
				//System.out.println("The Size of the Filter is: "+ele.getSize());
				//System.out.println("The Eleemnts of the Filters are " +ele.getText());
				
				FilterList.add(ele.getText());
				
			}
			
			return FilterList;
			//Assert.assertEquals(FilterList.get(0),"");
			
	}

}
