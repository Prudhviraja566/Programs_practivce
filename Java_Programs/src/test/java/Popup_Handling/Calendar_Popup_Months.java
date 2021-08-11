package Popup_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class Calendar_Popup_Months 
{
    public static void main(String[] args) 
    {
	   // Step 1 : Launch Browser, Open Application, Maximize
    	
    	WebDriver driver = GenericCode.launchBrowser("Chrome");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	
    	driver.manage().window().maximize();
    	driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
    	
    	driver.findElement(By.id("datepicker")).click();
    	
    	// Step 2 : Current Date capture
    	
    	String currentDate = "//a[contains(@class,'ui-state-highlight')]";
    	
    	// Step 3 : tomorrow date in next week 
    	
    	String TomorrowDate = "(//a[contains(@class,'ui-state-highlight')]/ancestor::td[contains(@class,'ui-datepicker-today')]/following::td)[1]";
    	
    	String TD=driver.findElement(By.xpath(TomorrowDate)).getText();
    	System.out.println(TD);
    	
	}
}
