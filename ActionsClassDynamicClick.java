package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDynamicClick {
	
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoqa.com/buttons");
	       driver.manage().window().maximize();
	       Actions act=new Actions(driver);
	       /*
	        * isDisplayed()
	        * isEnabled()
	        */
	       WebElement dynamicClickMeButton=driver.findElement(By.xpath("//button[text()='Click Me']"));
	       if(dynamicClickMeButton.isEnabled())
	       {
	       act.moveToElement(dynamicClickMeButton).click().perform();
	       }
	       WebElement dynamicClickMeMessage=driver.findElement(By.xpath("//p[text()='You have done a dynamic click']"));
	       if(dynamicClickMeMessage.isDisplayed())
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

}
