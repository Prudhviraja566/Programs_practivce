package selenium_Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GenericCode.GenericCode;

public class Google_AutoSuggestions 
{
	public static void main(String[] args) 
	{
	   // Step 1 : Launch Browser, Open Application, Maximize 
		
		WebDriver driver = GenericCode.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		// Step 2 : capture all Suggestiond
		
		driver.findElement(By.name("q")).sendKeys("facebook");
		
		List<WebElement> Auto = driver.findElements(By.xpath("//ul[@class='erkvQe']//span[contains(text(),'facebook')]"));
		
		for(WebElement wb : Auto)
		{
			System.out.println(wb.getText());
			
			if(wb.getText().contains("lite"))
			{
				wb.click();
				break;
			}
		}
		
		System.out.println(Auto.size());
		
		// Step 3 : close the Browser
		
		 driver.close();
		
	}
}
