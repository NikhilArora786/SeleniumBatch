package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public static WebDriver driver;
	public Actions act;
	
	@BeforeClass(alwaysRun=true)
	public void launchTheBrowser() throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("https://www.amazon.com");
	       driver.manage().window().maximize();
	       WebElement accountsAndList=driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"));
	       act=new Actions(driver);
	       act.moveToElement(accountsAndList).perform();
	       Thread.sleep(4000);
	       WebElement sign_InButton=driver.findElement(By.xpath("//span[text()='Sign in']"));
	       if(sign_InButton.isEnabled())
	       {
	    	   sign_InButton.click();
	       }
	       Thread.sleep(4000);
	}
	
	
	@BeforeMethod(alwaysRun=true)
	public void loginIntoTheApplication() throws InterruptedException
	{

	      
	       WebElement emailOrMobilePhoneNumberTextbox=driver.findElement(By.xpath("//input[@id='ap_email' and @name='email']"));
	       act.sendKeys(emailOrMobilePhoneNumberTextbox,"nikarora036@gmail.com").perform();
	       WebElement continueButton=driver.findElement(By.xpath("//input[@id='continue']"));
	       continueButton.click();
	       WebElement passwordTextbox=driver.findElement(By.xpath("//input[@id='ap_password']"));
	       act.sendKeys(passwordTextbox,"Nik@1234").perform();
	       Thread.sleep(4000);
	       WebElement signInButton=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	       signInButton.click();
	       Thread.sleep(40000);
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void logoutFromTheApplication() throws InterruptedException
	{
		   Thread.sleep(4000);
	       WebElement accountsListDropdown=driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"));
	       act.moveToElement(accountsListDropdown).perform();
	       Thread.sleep(4000);
	       WebElement signOut=driver.findElement(By.xpath("//span[text()='Sign Out']"));
	       signOut.click();
	}
	
	@AfterClass(alwaysRun=true)
	public void closeTheBrowser() throws InterruptedException
	{
		   Thread.sleep(4000);
	       driver.close();
	}

}
