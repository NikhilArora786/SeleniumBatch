package actions;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import com.google.common.collect.ImmutableBiMap.Builder;

public class ActionsBuilderDemoTest {

	public static void main(String[] args) throws InterruptedException {
		/* Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the value of textbox input:");
		 String inputText=scan.nextLine();*/
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.google.com");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
	     //By ref=By.cssSelector("input.gLFyf.gsfi");
	     WebElement element=driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
	     Actions act=new Actions(driver);
	     act.moveToElement(element).click()
	     .keyDown(element,Keys.SHIFT)
	     .sendKeys(element,"Java download")
	     .keyUp(element, Keys.SHIFT)
	     .contextClick(element)
	     .doubleClick(element)
	     .perform();
	     //Note:- build() is not more necessary method to be used in actions class object for performing multiple actions.
	    
	    

	}

}
