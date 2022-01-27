package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loan_003 {
	
	@Test(groups="SmokeTest",priority=1)
	public void createLoan() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.quit();
		driver.close();
	
	}
	
	@Test(groups="AdhocTest",priority=2)
	+public void createLoan1() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.quit();
		driver.close();
	
	}


}
