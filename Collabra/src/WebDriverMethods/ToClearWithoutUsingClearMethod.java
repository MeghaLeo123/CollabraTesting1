package WebDriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearWithoutUsingClearMethod {



	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.linkedin.com/");
		
		WebElement userText = driver.findElement(By.id("session_key"));
		userText.sendKeys("meghana@gmail.com");
		
		 JavascriptExecutor js =(JavascriptExecutor)driver;
	      js.executeScript("arguments[0].value='';", userText);
	       
		

	}

}
