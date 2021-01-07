package testNgDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	/*
	 * ITestListener
	 * ITestResult
	 * onTestFailure method
	 */
	
	
	@Test
	public void takeScreenshot() throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.amazon.com");
	       driver.manage().window().maximize();
	       TakesScreenshot ts=(TakesScreenshot)driver;
	       File scrFile=ts.getScreenshotAs(OutputType.FILE);
	       File destFile=new File("C:\\Users\\NIKHIL ARORA\\Desktop\\Screenshot\\"+"testNgAmazonSS2"+".png");
	       try
	       {
	       FileUtils.copyFile(scrFile, destFile);
	       }
	       catch(Exception e)
	       {
	    	   e.printStackTrace();
	       }
	       Thread.sleep(4000);
	       driver.close();
	}

}
