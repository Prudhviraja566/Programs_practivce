package selenium_Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import GenericCode.GenericCode;

public class DragAndDrop 
{
	public static void main(String[] args)
	{
	   // Step 1 : Launch Browser, Open Application, Maximize
		
		WebDriver driver = GenericCode.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		// Step 2 : Inspect the drop and Drag WebElement 
		
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement dropElement = driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(dragElement, dropElement).perform();
	    //act.clickAndHold(dropElement).build().perform();
		
	}
}
