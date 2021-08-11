package selenium_Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericCode.GenericCode;

public class Explicit_Wait 
{
	public static void main(String[] args)
	{
	    WebDriver driver = GenericCode.launchBrowser("Chrome");
	    driver.manage().window().maximize();
	   //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    
	    driver.get("https://www.flipkart.com");
 
 		System.out.println("Title webpage : " + driver.getTitle());
	    
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    
	    driver.findElement(By.name("q")).sendKeys("iphone x", Keys.ENTER);
	    
	    // Explicit Wait 
	    
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.titleContains("Iphone X"));
	    
	    System.out.println(driver.getTitle());
	    
	}
}
