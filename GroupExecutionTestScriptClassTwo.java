package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GroupExecutionTestScriptClassTwo extends BaseClass {
	
	
	@Test(groups= {"smokeTest","RegressionTest"})
	public void verifyLoginAmazonFunctionality3() throws InterruptedException
	{
		  
	       WebElement amazonTextBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	       amazonTextBox.sendKeys("One Plus 8T Mobile in Mobiles",Keys.ENTER);
	       
	}

	
	
	@Test(groups= {"RegressionTest"})
	public void verifyLoginAmazonFunctionality4() throws InterruptedException
	{
		   
	       WebElement amazonTextBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	       amazonTextBox.sendKeys("Oppo Mobile in Mobiles",Keys.ENTER);
	       
	       
	}

}
