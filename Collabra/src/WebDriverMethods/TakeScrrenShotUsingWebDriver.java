package WebDriverMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScrrenShotUsingWebDriver {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(tempfile);
		
		File destFile = new File("./errorScreenShot/Scrrenshot3.png");

		//By using common io ,because by using rename we cannot take screenshot.so we are using this.
		FileUtils.copyFile(tempfile , destFile);
		
	    tempfile.renameTo(destFile);
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    
	   // File weScreenshot = driver.findElement(By.xpath("//a[.='VIEW ALL']")).getScreenshotAs(OutputType.FILE);
	    
	    //File weFile = new File("./errorScreenShot/Scrrenshot2.png");
	    //weScreenshot.renameTo(weFile);
	    


	}

}
