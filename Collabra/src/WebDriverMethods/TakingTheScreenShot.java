package WebDriverMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingTheScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		File tempfile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempfile);
		
		File destFile = new File("./errorScreenShot/Scrrenshot3.png");
		
		FileUtils.copyFile(tempfile , destFile);
		
	    tempfile.renameTo(destFile);
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    
	   // File weScreenshot = driver.findElement(By.xpath("//a[.='VIEW ALL']")).getScreenshotAs(OutputType.FILE);
	    
	    //File weFile = new File("./errorScreenShot/Scrrenshot2.png");
	    //weScreenshot.renameTo(weFile);
	    
	    
	    
	    
		
		
	
}
}
