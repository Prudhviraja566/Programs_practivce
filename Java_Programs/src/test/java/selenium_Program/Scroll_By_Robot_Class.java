package selenium_Program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class Scroll_By_Robot_Class 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
	   // Step 1 : Launch Browser, Open Application, Maximize
		
		WebDriver driver = GenericCode.launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		// Step 2 : close window popup
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		
	}
}
