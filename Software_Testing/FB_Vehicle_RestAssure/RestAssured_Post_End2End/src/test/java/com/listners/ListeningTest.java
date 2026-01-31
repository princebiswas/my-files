package com.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Utility.ExtentManager;
import Utility.ExtentTestManager;

public class ListeningTest implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Run Test Method"+result.getMethod().getMethodName());
		ExtentTestManager.startTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Run Test Sucess"+result.getMethod().getMethodName());
		ExtentTestManager.getTest().log(Status.PASS, "Test Passed  " +result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Run Test Failure"+result.getMethod().getMethodName());
		ExtentTestManager.getTest().log(Status.FAIL, result.getThrowable() + "Test Failed" + result.getName() +""+ result.getHost());

	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Run Test Skipped"+result.getMethod().getMethodName());
		ExtentTestManager.getTest().log(Status.PASS, result.getThrowable());

		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}
	
	public void onStart(ITestContext context)
	{
		System.out.println("Test Start "+ context.getName());
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("Test Finish"+context.getName());
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
		
	}
	
	

}
