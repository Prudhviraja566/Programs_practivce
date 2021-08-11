package selenium_Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class ActiTime 
{
	public static void main(String[] args) 
	{
	    // Step 1 : Launch Browser, Open Application, Maximize
		
		  WebDriver driver = GenericCode.launchBrowser("Chrome");
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://demo.actitime.com/login.do");
		  
		// Step 2 : Enter the Username and Password and login button
		  
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  
		  driver.findElement(By.cssSelector("a#loginButton")).click();
		  
	   // Step 3 : Click on report 
		  
		  driver.findElement(By.xpath("//div[text()='Reports']")).click();
		 
		
	}
}
