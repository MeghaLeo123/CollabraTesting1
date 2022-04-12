package WeBdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wedri3 {
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.get("https://www.zomato.com/");
//		driver.get("https://www.skillrary.com/");
//		driver.get("https://www.oyorooms.com/");
//		
//		driver.navigate().forward();
//		driver.navigate().back();
//		
//	URL url = new URL("https://www.skillrary.com/");
//		driver.navigate().to(url);
//		
		driver.navigate().to("https://www.zomato.com/");
		
	}

}
