package Utility;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser;

public class Screenshot {
	public static void TakeScreenShot(WebDriver driver, String Name) throws IOException {
		
		String d = Screenshot.date();
		
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    		
	    File destination = new File("C:\\Selinium\\Screenshot " + Name + d + ".jpeg");
	    
	    FileHandler.copy(source, destination);
	}
	public static String date() {


		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");//format the time data and time as required
		LocalDateTime currentTime = LocalDateTime.now();//return current time
		String d=dtf.format(currentTime);//format the time given my now()method to required format and return String
		return d;
		
		//String date = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss").format(LocalDateTime.now());
	//	return date;
		
	}
		
	}