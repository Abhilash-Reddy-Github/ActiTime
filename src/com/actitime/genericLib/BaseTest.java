package com.actitime.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConsts{
	
	public static WebDriver driver;
	
	@BeforeClass
	 public void openBrowser() throws Throwable
	 {
		 FileLib flib = new FileLib();
		 String browser = flib.getpropertyvalue(PROP_PATH, "browser");
		 if(browser.equals("chrome")) {
			 System.setProperty(CHROME_KEY, CHROME_VALUE);
			 driver=new ChromeDriver();
		 }
		 else if(browser.equals("firefox")) {
			 System.setProperty(GECKO_KEY, GECKO_VALUE);
			 driver = new FirefoxDriver();
		 }
		 driver.manage().window().maximize();
		 String appurl = flib.getpropertyvalue(PROP_PATH, "url");
		 driver.get(appurl);
	 
	 
	 
	     webDriverCommonLib wlib =  new webDriverCommonLib();
	     wlib.verify(wlib.getPageTitle(), flib.getpropertyvalue(PROP_PATH, "loginTitle"), "Login Page");
	     
}
	 @AfterClass
	 public void closeBrowser()
	 {
		 driver.quit();
	 }
	

}
