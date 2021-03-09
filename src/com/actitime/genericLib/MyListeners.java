package com.actitime.genericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener{

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+" ended", true);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+" started", true);
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" method failed", true);
		webDriverCommonLib wlib = new webDriverCommonLib();
		try {
			wlib.getpagescreenshot(result.getName());
		} catch(Throwable e){e.printStackTrace();}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" method skipped", true);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" method started", true);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" method passed", true);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
