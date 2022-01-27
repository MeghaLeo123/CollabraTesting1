package Assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getWindowHandle());

	}

}
