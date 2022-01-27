package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToClickAndHold {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver,10);
		driver.get("https://www.trello.com/");
		
	driver.findElement(By.linkText("Log in")).click();
	
    driver.findElement(By.id("user")).sendKeys("meghanaleo2001@gmail.com");
    explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
    
    driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.linkText("password")).sendKeys("Megha@01");
	driver.findElement(By.id("login-submit")).click();
	
	driver.findElement(By.xpath("//div[text()='Selenium Practise']")).click();
	
	Actions actions = new Actions(driver);
	WebElement srcElement = driver.findElement(By.xpath("//span[text()='Theory Questions']"));
	WebElement dstElement = driver.findElement(By.xpath("//h2[text()='Done']/../..//span[text()='ooo']"));
	//actions.dragAndDropBy(srcElement, 800, 0).perform();
	
	actions.clickAndHold(srcElement).moveByOffset(600,300).perform();
	actions.release().perform();
	}
	
}
