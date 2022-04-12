package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Priority {		//testNG class
	@Test(priority=2)		//by default priority will be 0,if it is same then it will go alphabetically
	public void dell() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.dell.com/");
	}
	
	@Test(priority=-1)
	public void lenskart() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.lenskart.com/");
	}
	
	@Test(invocationCount=6,threadPoolSize = 2)
	public void lenovo() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.lenovo.com/");
	}
}