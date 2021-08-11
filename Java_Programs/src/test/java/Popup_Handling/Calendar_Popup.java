package Popup_Handling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GenericCode.GenericCode;

public class Calendar_Popup 
{
     public static void main(String[] args) 
     {
	   // step 1 : Launch Browser, Open Application, Maximize
    	 
    	 WebDriver driver = GenericCode.launchBrowser("Chrome");
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	 
    	 driver.manage().window().maximize();
    	 driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
    	 
    	  Date d = new Date();
    	  System.out.println(d);
    	  
    	  SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    	  String formdate = sdf.format(d);
    	  
    	  System.out.println(formdate);
    	  
    	  WebElement date =driver.findElement(By.id("datepicker"));
    	  
    	  date.click();
    	  
    	  driver.findElement(By.xpath("(//a[contains(@class,'ui-state-highlight')]"
    	  			+"/ancestor::td/following::td[@class='ui-datepicker-week-end']/a[@class='ui-state-default'])[3]")).click();
    	  
    	 
	 }
}
