package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemoTwo {
	
	@Test
	public void verifyGooglePageTextBox() throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com");
	       driver.manage().window().maximize();
	       WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	       element.sendKeys("Java download");
	       Thread.sleep(4000);
	       driver.close();
	}

	@Test
	public void verifyGooglePageTextBox2() throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com");
	       driver.manage().window().maximize();
	       WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	       element.sendKeys("Java download",Keys.ENTER);
	       Thread.sleep(4000);
	       driver.close();
	}
	
	@Test
	public void verifyGoogleWebpageTitleUsingIf() throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com");
	       driver.manage().window().maximize();
	       //WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	       String actualTitle=driver.getTitle();
	       String expTitle="Google";
	       if(expTitle==actualTitle)
	       {
	    	   System.out.println("Test case is passed");
	       }
	       else
	       {
	    	   System.out.println("Test case is failed");
	       }
	       Thread.sleep(4000);
	       driver.close();
	}
	
	@Test
	public void verifyGoogleWebpageTitleUsingAssertions() throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com");
	       driver.manage().window().maximize();
	       //WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	       String actualTitle=driver.getTitle();
	       String expTitle="Google";
	       Assert.assertEquals(actualTitle, expTitle);
	       Thread.sleep(4000);
	       driver.close();
	}

}
