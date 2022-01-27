package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchingChromeBrowser {
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    FirefoxDriver driver1=new FirefoxDriver();
	
	    
	}
	
	

}
