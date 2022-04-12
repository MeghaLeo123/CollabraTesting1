

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oyorooms.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		String allwinId = driver.getWindowHandle();
		System.out.println(allwinId);
		
		driver.get("https://www.zomato.com/");
		//driver.get("https://www.swiggy.com/");
		Set<String> allwin2 =driver.getWindowHandles();
		for(String allwin1 : allwin2) {
			System.out.println(allwin1);
		}
		
	String parentWin = driver.getWindowHandle();
	Set<String> childWin = driver.getWindowHandles();
	childWin.remove(parentWin);
	
	for(String all:childWin) {
		driver.switchTo().window(all);
		driver.close();
		
	}
				
	}

}
