package Test;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser;
import POM.ZerodhaForgotPage;
import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;
import Utility.Report;
@Listeners(TestListeners.class)
public class ZerodhaPinPageTest extends BaseTest {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void extentReports() {
		reports = Report.createReport();
	}
	
WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void LoginToZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
		test= reports.createTest("LoginToZerodhaWithPinTest");
		ZerodhaLoginPage zerodhaloginpage = new ZerodhaLoginPage(driver);
		String userName = Parametrization.getData(0, 1);
		String password = Parametrization.getData(1, 1);
		zerodhaloginpage.enterUserID(userName);
		zerodhaloginpage.enterpassword(password);
 		zerodhaloginpage.ClickOnLogin();
	}
 	@Test
 		public void  ForgotPassordTest() throws EncryptedDocumentException, IOException {
 		ZerodhaForgotPage zerodhaForgotPage = new ZerodhaForgotPage(driver);
 		zerodhaForgotPage.ClickOnForgotID();
 		String userID = Parametrization.getData(0, 1);
 		String panNo = Parametrization.getData(5, 1);
 		String Email = Parametrization.getData(6, 1);
 		zerodhaForgotPage.EnterUserID();
        zerodhaForgotPage.EnterPANNo(panNo);
        zerodhaForgotPage.EnterEmail(Email);
        zerodhaForgotPage.ClickOnReset();
        
 	}
 	
 	@Test
 	    public void PinPageTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
		String pin = Parametrization.getData(2, 1);
		zerodhaPinPage.enterpin(pin);
		zerodhaPinPage.clickOnContinue();
		
		ZerodhaHomePage zerodhaHomePage = new ZerodhaHomePage(driver);
		String Share = Parametrization.getData(3, 1);
		zerodhaHomePage.entersearch(Share);
		System.out.println(Share);
		
	    zerodhaHomePage.buy(driver);
	    Thread.sleep(2000);
		//zerodhaHomePage.sell(driver);
	   // zerodhaHomePage.Quantity(driver);
	    //String Quantity = Parametrization.getData(4, 1);
	   // System.out.println(Quantity);
	   // Thread.sleep(2000);
	  //zerodhaHomePage.market(driver);
		zerodhaHomePage.Submit(driver);
      //zerodhaHomePage.cancel(driver);
	}	
		@AfterMethod
		public void closeBrowser(ITestResult result) {
			
			if(result.getStatus() == ITestResult.FAILURE) {
				test.log(Status.FAIL,result.getName());
			} else if (result.getStatus() == ITestResult.SUCCESS) {
				test.log(Status.PASS,result.getName());
			}
			else {
				test.log(Status.SKIP,result.getName());
			}
		}
		
		@AfterTest
        private void flushResult() {
		reports.flush();
		
	}
}
