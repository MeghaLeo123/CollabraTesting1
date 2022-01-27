package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckTheAlignmentUsingGetRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement userText=driver.findElement(By.id("email"));
		System.out.println(userText.getSize());
		WebElement =driver.findElement(By.id("pass"));
		System.out.println(userText.getSize());
		
		
        
	}

}
