package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation  {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.skillrary.com/");
	Thread.sleep(2000);
	driver.get("http://www.zomato.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	URL url =new URL("https://www.swiggy.com");
	driver.navigate().to(url);
	}
}


