package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendkeys {



	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://via.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("wzrk-cancel")).click();
	  WebElement FromTextfield=driver.findElement(By.id("source"));
	  FromTextfield.clear();
	 
	  FromTextfield.sendKeys("My","so","re",Keys.CONTROL+"a");
	  Thread.sleep(3000);
      FromTextfield.sendKeys(Keys.CONTROL+"c");
      	
      WebElement ToTextfield=driver.findElement(By.id("destination"));
	  ToTextfield.clear();
	  Thread.sleep(3000);
	  ToTextfield.sendKeys(Keys.CONTROL+"v");
   }

}
