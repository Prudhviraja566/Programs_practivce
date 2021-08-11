package selenium_Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GenericCode.GenericCode;

public class Flipkart_Inverst 
{
     public static void main(String[] args)
     {
	   // Step 1 : Launch Browser, Open application, Maximize
    	 WebDriver driver = GenericCode.launchBrowser("Chrome");
    	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 
    	 driver.get("https://www.flipkart.com/");
    	 
    	 driver.manage().window().maximize();
    	 
    	// Step 2 : close window popup 
    	 
    	 driver.findElement(By.xpath("//button[text()='✕']")).click();
    	 
        // Step 3 : Sreach the product in filpkart
    	 
    	 WebElement sreach=driver.findElement(By.name("q"));
    	 sreach.sendKeys("mobiles");
    	 sreach.submit();
    	 
    	// Step 4 : capture the title in first one 
    	
        String  Price = driver.findElement(By.xpath("//div[text()='POCO M3 (Cool Blue, 64 GB)']/ancestor::div[@class='_3pLy-c row']"
        												+ "/descendant::div[@class='_30jeq3 _1_WHN1']")).getText(); 
    	
        List<WebElement> Title = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
    	int count = 1;
    	String str1 = "POCO M3 (Cool Blue, 64 GB)";
    	for(WebElement result : Title)
    	{
    		String str = result.getText();
    		if(str.equals(str1))
    		{
    			System.out.println(" Title Name : " + str + " Price is : "+Price);
    			System.out.println("Validation Passed");
    			result.click();
    		}

    	     System.out.println("Title : "+ count  +" : " +result.getText());	
    	     count++;
    	}

    	     	 System.out.println("Total number of Titles is : " + Title.size());
	 }
}
