package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependesOnMethods {
	
	@Test(priority=1)
	public void createLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		int i=1/10;
		driver.quit();
		
	}
	@Test(priority=2,dependsOnMethods="createLoan")
	public void modifyLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.quit();
	}
	
	@Test(priority=3)
	public void repayLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.quit();
		}
	@Test(priority=4)
	public void deleteLoan() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.quit();
		
	}
	

}
