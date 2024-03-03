package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class BaseClass {
	
	Properties prop= new Properties();
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();	
	
	public WebDriver getDriver() {
		return driver.get();
	}

	
	@Test
	
	public  String InitilisigPropertiesFile() throws Exception {

	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/DataFiles/prop.properties");
	prop= new Properties();
	 prop.load(fis);
	String Browsername= prop.getProperty("browser");
	 return Browsername;
	
		
	}
	
	public void InitilisingDirver() throws Exception {
		
		String NameOfBrowser=InitilisigPropertiesFile();
		if(NameOfBrowser.equalsIgnoreCase("chrome")) {
			driver.set(new ChromeDriver());
			//getDriver=new ChromeDriver();
		}else if(NameOfBrowser.equalsIgnoreCase("firefox")) {
			driver.set(new FirefoxDriver());
			//driver=new FirefoxDriver();
		}else if(NameOfBrowser.equalsIgnoreCase("ie")) {
			driver.set(new InternetExplorerDriver());
			//driver=new InternetExplorerDriver();
		}else {
			System.out.println("Please input proper browsername");
		}
		getDriver().get(prop.getProperty("url"));
		//getDriver().get("https://www.saucedemo.com/?ref=hackernoon.com");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	


}
