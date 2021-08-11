package Popup_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import GenericCode.GenericCode;

public class Incognito_Browser 
{
     public static void main(String[] args)
     {
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--incognito");
	    
	    WebDriver driver = new ChromeDriver(option);
	    
	    driver.get("https://www.facebook.com/");
    	 
	}
}


class AcutalBrowser
{
	public static void main(String[] args) throws AWTException 
	{
	    WebDriver driver = GenericCode.launchBrowser("Chrome");
	    
	    Robot r = new Robot();
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_SHIFT);
	    r.keyPress(KeyEvent.VK_N);
	    
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_SHIFT);
	    r.keyRelease(KeyEvent.VK_N);
	    
	    
	    
	}
}