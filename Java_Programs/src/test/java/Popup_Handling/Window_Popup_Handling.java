package Popup_Handling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class Window_Popup_Handling 
{
	public static void main(String[] args) 
	{
	  WebDriver driver = GenericCode.launchBrowser("Chrome");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.naukri.com/");
	  
	  String mainID = driver.getWindowHandle();
	  
	  System.out.println(mainID);
	  Set<String> AllID  = driver.getWindowHandles();
	  
	  for(String id : AllID)
	  {
		  if(!mainID.equals(id))
		  {
			  driver.switchTo().window(id);
			  driver.close();
		  }
		
	  }
	  driver.switchTo().window(mainID);
	  driver.findElement(By.xpath("(//button[contains(text(),'Register ')])[1]")).click();
		 
	}
}
