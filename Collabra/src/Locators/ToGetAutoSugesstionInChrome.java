package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAutoSugesstionInChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).click();
		List<WebElement> listOfSuggestions = driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]"));
		List<WebElement> dataOfSuggestions = driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]"));
		System.out.println("The no of suggestions are : " +listOfSuggestions.size());
		
		for(WebElement ele : dataOfSuggestions )
		{
			System.out.println(ele.getText());
		}
		

	}

}
