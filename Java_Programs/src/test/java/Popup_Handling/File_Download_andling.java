package Popup_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class File_Download_andling 
{
	public static void main(String[] args) throws AWTException 
	{
	  WebDriver driver = GenericCode.launchBrowser("Chrome");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  
	  driver.manage().window().maximize();
	  driver.get("https://maven.apache.org/download.cgi");
	  
	  driver.findElement(By.linkText("apache-maven-3.8.1-bin.zip")).click();
	  
	  Robot r = new Robot();
	  
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	}
}
