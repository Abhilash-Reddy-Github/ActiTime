package com.actitime.TimeTrack;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.pages.loginpage;
@Listeners(com.actitime.genericLib.MyListeners.class)
public class invalidlogin extends BaseTest {
	
	@Test
	public  void invalidLogin() throws Throwable
	{
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		FileLib flib = new FileLib();
		loginpage lp = new loginpage(driver);
		
		int rc = flib.getRowCount(EXCEL_PATH, "invalid");
		
	    for(int i =1; i<=rc; i++)
	    {
		String un = flib.getcelldata(EXCEL_PATH, "invalid", i, 0);
		String pw = flib.getcelldata(EXCEL_PATH, "invalid", i, 1);	
		lp.login(un, pw);
		
		
	    }
	    
	
	}
}
