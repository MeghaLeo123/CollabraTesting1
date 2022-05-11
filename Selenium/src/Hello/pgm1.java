package Hello;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm1 {
	public static void main(String[]  args) {
		System.setProperty("webdriver.chrome.driver","./divers12/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
	}

}
