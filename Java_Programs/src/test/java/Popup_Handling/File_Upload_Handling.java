package Popup_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import GenericCode.GenericCode;

public class File_Upload_Handling 
{
	private static final String WebElement = null;

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver = GenericCode.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		
		
		String mainID = driver.getWindowHandle();
		Set<String> AllID =driver.getWindowHandles();
		
		Iterator<String> it = AllID.iterator();
		
		while(it.hasNext())
		{
			String id  = it.next();
			if(!id.equals(mainID))
			{
				driver.switchTo().window(id);
				driver.close();
			}
		}
		driver.switchTo().window(mainID);
		
		driver.findElement(By.xpath("(//button[contains(text(),'Register ')])[1]")).click();
		
		driver.findElement(By.cssSelector("button[titile='I am Experienced']")).click();
		
		driver.findElement(By.cssSelector("span.uploadCV")).click();
		
		StringSelection path = new StringSelection("C:\\Users\\PRUDHVI RAJ ANNA\\Desktop\\Prudhvi Ra Resume.docx");
		
		// Access system Clipboard
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		Clipboard cb = toolkit.getSystemClipboard();
		
		// Transfer te select the path of file
		
		cb.setContents(path, null);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		// Click on Enter
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
