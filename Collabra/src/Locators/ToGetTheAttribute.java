package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String username="meghana";
		driver.get("https://www.instagram.com/");
		
		WebElement usernameTf = driver.findElement(By.name("username"));
		usernameTf.clear();
		usernameTf.sendKeys(username);
		
		String actualDataEntered = usernameTf.getAttribute("value");
		
		
		if(actualDataEntered.equals(username))
		{
			System.out.println("Username is entered properly");
			
		}
		}

	}

