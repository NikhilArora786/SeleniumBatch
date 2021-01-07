package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupExecutionTestScriptClassOne extends BaseClass{
	
	
	@Test
	public void verifyLoginAmazonFunctionality1() throws InterruptedException
	{
		  
	       WebElement amazonTextBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	       amazonTextBox.sendKeys("Vivo Mobiles in mobiles",Keys.ENTER);
	       
	}

	
	
	@Test(groups= {"smokeTest","RegressionTest"})
	public void verifyLoginAmazonFunctionality2() throws InterruptedException
	{
		   
	       WebElement amazonTextBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	       amazonTextBox.sendKeys("Samsung A20s in Mobiles",Keys.ENTER);
	       
	       
	}
	
	

}
