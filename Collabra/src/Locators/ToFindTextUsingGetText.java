package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindTextUsingGetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedError = "Please identify yourself";
		WebElement errorMsg = driver.findElement(By.id("headerContainer"));
		String actualError = errorMsg.getText();
		System.out.println(actualError);
		if(expectedError.equals(actualError))
		{
			System.out.println("proper error message is dispalyed");
		}
		else
		{
			System.out.println("Invalid error message");
		}
	}


		

	}

