package selenium_Program;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;


public class Broken_link 
{
     public static void main(String[] args) throws MalformedURLException, IOException 
     {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    System.out.println(driver.getTitle());
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    for(WebElement link : links)
	    {
	    	String url = link.getAttribute("href");
	    	HttpURLConnection httpcon = (HttpURLConnection)new URL(url).openConnection();
	    	httpcon.connect();
	    	int  respcode = httpcon.getResponseCode();
	    	
	    	if(respcode >= 400)
	    	{
	    		System.out.println("broken link " + " " + url +  " "+  respcode);
	    	}
	    	else
	    	{
	    		System.out.println("Valid link " +respcode  + " "  + url);
	    	}
	     } 
	    driver.close();
	 }
}


