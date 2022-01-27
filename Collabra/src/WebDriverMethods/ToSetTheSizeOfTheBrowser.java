package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheSizeOfTheBrowser {

	public static void main (String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://skillrary.com/");
		
		Dimension dimension = driver.manage().window().getSize();
		int height =dimension.getHeight();
		int width =dimension.getWidth();
		System.out.println("Height: "+ height +" and Width: "+ width);
		

	
	}
}
