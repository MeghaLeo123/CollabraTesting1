package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		ChromeDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		driver.findElement(By.name("pass")).sendKeys("Abc117");
		
		


	}

}
