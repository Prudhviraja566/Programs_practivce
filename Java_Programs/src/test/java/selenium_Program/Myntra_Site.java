package selenium_Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GenericCode.GenericCode;

public class Myntra_Site 
{
	public static void main(String[] args) 
	{
	    // Step 1 : Launch Browser, Open Application, Maximize
		
		WebDriver driver = GenericCode.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
	    // Step 2 : capture all links 
		
		List<WebElement>links = driver.findElements(By.xpath("//a"));
		int count = 0;
		
		for(WebElement wb : links)
		{
			System.out.println(wb.getText());
			count++;
		}
		System.out.println("Total number links : " +count);
		
	}
}
