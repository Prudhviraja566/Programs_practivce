package selenium_Program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class Robot_Clsss 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
	  // Step 1 : Launch Browser, Open Application, Maximize
	   WebDriver driver = GenericCode.launchBrowser("Chrome");

	   driver.manage().window().maximize();
	   driver.get("https://demo.actitime.com/login.do");
	   
	   // Step 2 : By using robot class access Keys
	   
	   driver.findElement(By.id("username")).sendKeys("admin");
	   
	   Robot r = new Robot();
	   
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_A);
	   
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_A);
	   
	   
	   Thread.sleep(2000);
	   
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_C);
	   
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_C);
	   
	   Thread.sleep(2000);
	   
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_TAB);
	   
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_TAB);
	   
	   Thread.sleep(2000);
	   
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_V);
	   
	   
	   
	 
	   
		
	}
}
