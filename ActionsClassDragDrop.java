package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDragDrop {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoqa.com/droppable");
	       driver.manage().window().maximize();
	       Actions act=new Actions(driver);
	       WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
	       WebElement target=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
	       Thread.sleep(4000);
	       act.dragAndDrop(source, target).perform();
	       String text=target.getText();
	       if(text.equals("Dropped!"))
	       {
	    	   System.out.println("Passed , source element is dropped to the target location");
	       }
	       else
	       {
	    	   System.out.println("Passed , source element is dropped to the target location");
	       }
	       Thread.sleep(4000);
	       driver.close();
	       
	}

}
