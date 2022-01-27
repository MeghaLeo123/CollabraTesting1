package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateAnElementUsingIdLocator {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		ChromeDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys("Meghana");
		
		driver.findElement(By.name("pwd")).sendKeys("Abc117");
		
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}

}
