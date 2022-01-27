package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MynthraBarElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		
	List<WebElement>	navigationEle=driver.findElements(By.xpath("//a[@data-type='navElements']"));
	for(WebElement element : navigationEle)
	{
		
	System.out.println(element.getText());

	}
	}

}
