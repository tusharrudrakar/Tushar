package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Screenshot;

public class TestListeners extends BaseTest implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test has started");
	}
	public void onTestFailure(ITestResult result) {
		try {
		Screenshot.TakeScreenShot(driver, result.getName());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "Test success");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "Test Skipped");
	}

}
