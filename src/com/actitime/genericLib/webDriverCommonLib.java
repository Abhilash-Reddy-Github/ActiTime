package com.actitime.genericLib;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class webDriverCommonLib extends BaseTest
{
	public void waitforPageTitle(String title) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void verify(String actual, String expected, String page) {
		Assert.assertEquals(actual, expected);
		Reporter.log(page+" is Displayed", true);
		}
	
	public void selectOption(String text, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectOption(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
			}
	

	public void selectOption(int index, WebElement element) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void SwitchToFrame(int index) {
		
		driver.switchTo().frame(index);
	}
	
	public void SwitchToFrame(String value) {
		
		driver.switchTo().frame(value);
	}
	
	public void SwitchToFrame(WebElement element) {
		
		driver.switchTo().frame(element);
	}

	public void mouseHover(WebElement element)
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	
	public void getpagescreenshot(String name) throws Throwable{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshots/"+name+".jpg");
		Files.copy(src, dst);
	}

	
}
