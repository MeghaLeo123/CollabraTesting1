package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://zomato.com/");
		System.out.println(driver.getPageSource());

	}

}
