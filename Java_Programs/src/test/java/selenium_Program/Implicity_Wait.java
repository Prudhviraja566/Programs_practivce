package selenium_Program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class Implicity_Wait 
{
	public static void main(String[] args)
	{
	    WebDriver driver = GenericCode.launchBrowser("Chrome");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.get("https://www.flipkart.com/");
	    
	    System.out.println("Title webpage : " + driver.getTitle());
	    
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    
	    driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
	    
	    System.out.println(driver.getTitle());
	    
	    
	}
}
