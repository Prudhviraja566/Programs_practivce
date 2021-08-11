package selenium_Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GenericCode.GenericCode;

public class Flipkart_Single_Product 
{
    public static void main(String[] args) 
    {
	   // Step 1 : Launch Browser, Open Application, Maximize
    	
    	WebDriver driver = GenericCode.launchBrowser("Chrome");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.get("https://www.flipkart.com/");
    	
       // Step 2 : window  popup close  and Search the product 
    	
    	driver.findElement(By.xpath("//button[text()='✕']")).click();
    	WebElement Search = driver.findElement(By.name("q"));
    	Search.sendKeys("Sumsung");
    	Search.submit();
    	
    	
        // Step 3 : Next button capture 
    	
    	WebElement Next = driver.findElement(By.xpath("//span[text()='Next']"));
    	
    	for(int i = 0 ; i <= 28 ; i++ )
    	{
    		List<WebElement> AllProduct = driver.findElements(By.xpath("//div[starts-with(text(),'SAMSUNG ')]"));
    		
    		int size = AllProduct.size();
    		
    		for(WebElement wb : AllProduct)
    		{
    			System.out.println(wb.getText());
    		}
    		
    		if(i < 28)
    		{
    			System.out.println("HI");
    			Next.click();
    		}
    	}
	}
}
