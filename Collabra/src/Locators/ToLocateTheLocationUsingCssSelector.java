package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateTheLocationUsingCssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[inpu[class='sugInp']")).click();
	}

}
