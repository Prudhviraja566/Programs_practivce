package selenium_Program;

import java.awt.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import GenericCode.GenericCode;

public class List_Box_Handling 
{
    public static void main(String[] args) 
    {
	    // Step 1 : Launch Browser, Open Application, Maximize
    	
    	WebDriver driver = GenericCode.launchBrowser("Chrome");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    
    	driver.manage().window().maximize();
    	
    	driver.get("https://www.facebook.com");
    	
    	// Step 2 : click on sign Up
    	
    	driver.findElement(By.xpath("//a[text()='ಹೊಸ ಖಾತೆಯನ್ನು ರಚಿಸಿ']")).click();
    	
    	WebElement days = driver.findElement(By.id("day"));
    	
    	
    	Select s = new Select(days);
    	
    	s.selectByVisibleText("20");
    	
    	 WebElement monthList = driver.findElement(By.id("month"));
    	
    	Select s1 = new Select(monthList);
    	
    	 java.util.List<WebElement> Item = s1.getOptions();
    	 
    	 
    	 for(WebElement wb : Item)

    	 {
    		 System.out.println(wb.getText());
    	 }
    	
    	
	}
}
