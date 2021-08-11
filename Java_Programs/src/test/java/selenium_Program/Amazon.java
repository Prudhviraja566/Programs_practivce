package selenium_Program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Amazon 
{

    public static void main(String [] args) throws AWTException
    {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
	driver.findElement(By.xpath("//span[text()='OnePlus']/../../../span/a/div")).click();

	driver.findElement(By.xpath("//span[text()='boAt']/../../../span/a/div")).click();
	
	driver.findElement(By.xpath("//span[text()='Featured']")).click();
	
	driver.findElement(By.xpath("//a[text()='Price: Low to High']")).click();

	List<WebElement> product = driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//div[@data-component-type='s-search-result']//h2//span"));

	for (int i = 0; i < product.size()-1; i++)
	{
	String productname = driver.findElement(By.xpath("(//div[@class='s-main-slot s-result-list s-search-results sg-row']//div[@data-component-type='s-search-result']//h2//span)["+(i+1)+"]")).getText();
	String proceed = "Product Name : "+productname+"')]/../../../..//a[@class='a-size-base a-link-normal a-text-normal' or @class='a-size-mini a-link-normal a-text-normal']/span[1]/span[2]/span[2]";
	System.out.println(proceed);
	String productprice =driver.findElement(By.xpath(proceed)).getText();
	System.out.println(productname+" price = " + productprice);
	}
	System.out.println(product.size());
	}
}
