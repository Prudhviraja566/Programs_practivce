package GenericCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericCode 
{
   public static WebDriver launchBrowser(String browsername)
   {
	   WebDriver driver = null;
	   if(browsername.equals("Chrome"))
	   {
		   driver=new ChromeDriver();
	   }
	   else if(browsername.equals("Firefox"))
	   {
		   driver = new FirefoxDriver();
	   }
	return driver;
	   
   }
}
