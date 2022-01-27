package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Accounts_006 {
	@Test(timeOut=10000)
	public void lenskart() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		// driver.get("https://in.bookmyshow.com/");
	//	driver.quit();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		driver.get("www.amazon.in");
		
		driver.quit();
		}
	}
	


