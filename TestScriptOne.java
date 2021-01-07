package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class TestScriptOne  extends BaseClass{
	
	@Test
	public void verifyLoginAmazonFunctionality() throws InterruptedException
	{
		  
	       WebElement amazonTextBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	       amazonTextBox.sendKeys("One Plus 8T Mobile in Mobiles",Keys.ENTER);
	       
	}

	
	
	@Test
	public void verifyLoginAmazonFunctionality2() throws InterruptedException
	{
		   
	       WebElement amazonTextBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	       amazonTextBox.sendKeys("SamsungMobiles",Keys.ENTER);
	       
	       
	}

}
