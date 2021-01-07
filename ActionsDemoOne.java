package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemoOne {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com");
	       driver.manage().window().maximize();
	       //By ref=By.cssSelector("input.gLFyf.gsfi");
	       WebElement element=driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
	       Actions act=new Actions(driver);
	       act.sendKeys("Java download",Keys.ENTER).perform();
	       Thread.sleep(4000);
	       driver.close();
	}

}
