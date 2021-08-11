package selenium_Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GenericCode.GenericCode;

public class Flipkart 
{
    public static void main(String[] args) 
    {
    	
       // Step 1 : Launch Browser, Open Application, Maximize
    	
	   WebDriver driver = GenericCode.launchBrowser("Chrome");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.get("https://www.flipkart.com/");
	   
	   // Step 2 : close the window
	   
	  driver.findElement(By.xpath("//button[text()='✕']")).click();
	  
	  //  Step 3 : Search the product 
	  
	  WebElement search=driver.findElement(By.name("q"));
	  
	  search.sendKeys("mobiles");
	  search.submit();
	  
	  // Step 4 :  capture all titles 
	  
	  List<WebElement> result = driver.findElements(By.cssSelector("div._4rR01T"));
	  
	  for(WebElement wb : result)
	  {
		  System.out.println(wb.getText());
	  }
	  
	  System.out.println(result.size());
	  
	  // Step 5 : close browser
	   
	  driver.close();
	}
}
