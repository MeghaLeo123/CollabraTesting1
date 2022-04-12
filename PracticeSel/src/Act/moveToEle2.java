package Act;

import java.io.File;
//import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class moveToEle2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.oyorooms.com/");
	    driver.findElement(By.id("autoComplete__home")).sendKeys("my","so","re");
		
		
		
	Actions action = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//span[text()='Indonesia']"));
	action.moveToElement(ele).perform();		
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File tmp = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./srcs/ss2.png");
	tmp.renameTo(dest);
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File tmp1 = driver.findElement(By.linkText("Hyderabad")).getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./srcs/ss3.png");
		tmp1.renameTo(dest1);
		
		
		
		

	}

}