package Popup_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class Alert_Popup_Handling 
{
     public static void main(String[] args) throws InterruptedException 
     {
	   // Step 1 : Lanuch Browser, Open Application, Maximize
    	 
    	 WebDriver driver = GenericCode.launchBrowser("Chrome");
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	 
    	 driver.manage().window().maximize();
    	 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    	 
    	 driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
    	 
    	 Thread.sleep(2000);
    	 
    	 Alert alt = driver.switchTo().alert();
    	 
    	 alt.accept();
    	 
    	 Thread.sleep(2000);
    	 
    	 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
    	 
    	 Alert alt1 = driver.switchTo().alert();
    	 alt1.sendKeys("Facebook");
    	 alt1.accept();
    	 
    	 String result = driver.findElement(By.id("result")).getText();
    	 System.out.println(result);
	 }
}
