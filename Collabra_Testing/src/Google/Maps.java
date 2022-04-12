package Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/maps/@12.9311835,77.5504667,15z");
		driver.findElement(By.id("xoLGzf-T3iPGc")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='Zvyb8e-T3iPGc-icon TbsL9e-ZGNLv']/../..//input[@tooltip='Choose starting point, or click on the map...']"));
		ele.sendKeys("Kathriguppe");
		ele.click();
	}

}
