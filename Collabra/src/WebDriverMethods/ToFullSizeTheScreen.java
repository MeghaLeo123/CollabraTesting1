package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFullSizeTheScreen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().fullscreen();

	}

}
