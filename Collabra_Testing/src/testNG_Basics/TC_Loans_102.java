package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loans_102 {
	
	@Test(enabled=false)
	public void lenskart() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.lenskart.com/");
	}
		
		
		@Test(priority=-1,invocationCount=0,threadPoolSize=4)
		public void lenovo() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.lenovo.com/");

			
	}

}
