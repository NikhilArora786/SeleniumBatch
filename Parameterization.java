package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	
	
	
	@Parameters({"url","username","password"})
	@Test
	public void verifyLoginAmazonFunctionality(String url, String username , String password) throws InterruptedException
	{
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get(url);
	       driver.manage().window().maximize();
	       WebElement accountsAndList=driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"));
	       Actions act=new Actions(driver);
	       act.moveToElement(accountsAndList).perform();
	       Thread.sleep(4000);
	       WebElement sign_InButton=driver.findElement(By.xpath("//span[text()='Sign in']"));
	       if(sign_InButton.isEnabled())
	       {
	    	   sign_InButton.click();
	       }
	       Thread.sleep(4000);
	       WebElement emailOrMobilePhoneNumberTextbox=driver.findElement(By.xpath("//input[@id='ap_email' and @name='email']"));
	       act.sendKeys(emailOrMobilePhoneNumberTextbox,username).perform();
	       WebElement continueButton=driver.findElement(By.xpath("//input[@id='continue']"));
	       continueButton.click();
	       WebElement passwordTextbox=driver.findElement(By.xpath("//input[@id='ap_password']"));
	       act.sendKeys(passwordTextbox,password).perform();
	       Thread.sleep(4000);
	       WebElement signInButton=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	       signInButton.click();
	       Thread.sleep(40000);
	       WebElement amazonTextBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	       amazonTextBox.sendKeys("One Plus 8T Mobile in Mobiles",Keys.ENTER);
	       Thread.sleep(4000);
	       WebElement accountsListDropdown=driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"));
	       act.moveToElement(accountsListDropdown).perform();
	       Thread.sleep(4000);
	       WebElement signOut=driver.findElement(By.xpath("//span[text()='Sign Out']"));
	       signOut.click();
	       Thread.sleep(4000);
	       driver.close();
	}

}
