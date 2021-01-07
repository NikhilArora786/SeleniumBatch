package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemoThree {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com");
	       driver.manage().window().maximize();
	       WebElement element=driver.findElement(By.xpath("//a[text()='Gmail']"));
	       Actions act=new Actions(driver);
	       act.contextClick(element).perform();
	       Thread.sleep(4000);
	       driver.close();
	}

}
