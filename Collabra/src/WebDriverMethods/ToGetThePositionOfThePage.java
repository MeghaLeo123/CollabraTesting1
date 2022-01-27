package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Point;

public class ToGetThePositionOfThePage {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		Point point = driver.manage().window().getPosition();
	
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		
		
	}

}
