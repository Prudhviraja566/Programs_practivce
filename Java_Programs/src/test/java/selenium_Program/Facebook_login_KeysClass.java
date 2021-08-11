package selenium_Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class Facebook_login_KeysClass 
{
	public static void main(String[] args) 
	{
	  // Step 1 : Launch Browser, Open application, Maximize
		
		WebDriver driver =  GenericCode.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
      // Step 2 : Enter the Username and Password click Login
		
		driver.findElement(By.id("email")).sendKeys("7093170809",Keys.TAB,"raja@123A",Keys.TAB,Keys.TAB,Keys.ENTER);
		
	  // step 3 : browser close 
		
		driver.close();
	}
}
