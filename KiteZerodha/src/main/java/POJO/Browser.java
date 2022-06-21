package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting chrome driver class to monitor
		driver.get("https://kite.zerodha.com/");//method of Webdriver interaface
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}
