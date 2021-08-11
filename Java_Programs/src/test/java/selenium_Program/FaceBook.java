package selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericCode.GenericCode;

public class FaceBook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	  // Step 1 : Launch Browser , Open Application, Maximize
		
      WebDriver driver = GenericCode.launchBrowser("Chrome");
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com");
      
      
      // Step 2 : Enter the user name and Password
      
      driver.findElement(By.id("email")).sendKeys("7093170809");
      
      driver.findElement(By.id("pass")).sendKeys("raja@123A");
      
      // Step 3 : login button click
      
      driver.findElement(By.name("login")).click();
      
      Thread.sleep(10000);
      
      // Step 4 : close browser
      
      driver.close();
      
	}
}
