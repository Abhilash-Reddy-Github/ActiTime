package com.actitime.TimeTrack;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.webDriverCommonLib;
import com.actitime.pages.loginpage;
@Listeners(com.actitime.genericLib.MyListeners.class)
public class validlogintest extends BaseTest {
	
	@Test
	public  void loginTest() throws Throwable {
		System.out.println("hawlkodjndjghfdrf j");
	
//		BaseTest bt = new BaseTest();
//		bt.openBrowser();
//		 loginpage lp = new loginpage(driver);
//		 FileLib flib = new FileLib();
//		 String un = flib.getpropertyvalue(PROP_PATH, "username");
//		 String pw = flib.getpropertyvalue(PROP_PATH, "password");
//		 //		 lp.setUntb(un); //		 lp.setPwtb(pw);  //		 lp.clickloginbtn();
//		 // 3 in 1 method created
//		 lp.login(un, pw);
//
//		 webDriverCommonLib wlib = new webDriverCommonLib();
//		 wlib.waitforPageTitle(flib.getpropertyvalue(PROP_PATH, "homeTitle"));
//		 wlib.verify(wlib.getPageTitle(), flib.getpropertyvalue(PROP_PATH, "homeTitle"), "Home Page");
		
		
	}
	

	
}
