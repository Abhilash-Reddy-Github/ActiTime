package com.actitime.pages; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginpage {
	//Decleration
	@FindBy(name="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(xpath="//input[@valign='absmiddle']") private WebElement loginbtn;
	
	//initialzation
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	//Address returning method
	

	public WebElement getUntb() {
		return untb;
	}

	public void setUntb(String	 un) {
		untb.sendKeys(un);
	}

	public WebElement getPwtb() {
		return pwtb;
	}

	public void setPwtb(String pw) {
		pwtb.sendKeys(pw);
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void clickloginbtn() {
		loginbtn.click();
	}
	
	public void login(String un, String pw) {
		
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		loginbtn.click();
	}
}
