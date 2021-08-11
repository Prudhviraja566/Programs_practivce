package selenium_Program;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser 
{
   public static void main(String[] args) 
   {
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.google.com/");
	 
	 driver.navigate().refresh();
	 
	 
	 driver.manage().window().setSize(new Dimension(400,200));
	 
	 driver.manage().window().setPosition(new Point(45,25));
	 
	 driver.navigate().to("https://www.facebook.com/");
	 
   }
}
