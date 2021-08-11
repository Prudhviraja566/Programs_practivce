package selenium_Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class Scroll_By_JavaScript 
{
	public static void main(String[] args) throws InterruptedException 
	{
	   // Step 1 : Launch Browser, Open Application, Maximize
		
		WebDriver driver = GenericCode.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
   	    driver.findElement(By.xpath("//button[text()='✕']")).click();
   	    
   	  //  driver.findElement(By.name("q")).sendKeys("iphone x",Keys.ENTER);
   	    
   	    
   	    
   	    Thread.sleep(2000);
   	    JavascriptExecutor js = (JavascriptExecutor)driver;
   	    
   	    js.executeScript("alert('Welcome to Selenium')");
   	 
   	    
   	    
	}
}
