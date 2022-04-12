package Demo;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reportpgm1 {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver1/chromedriver.exe");
	}
	static	WebDriver driver = new ChromeDriver();
	public static void main(String args[]) {
		
		
		
		ExtentReports reports = new ExtentReports("./ExtentReports/Reports.html");
		ExtentTest extentTest = reports.startTest("ExtentDemo");
		
		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		String title="Zomto";
		if(driver.getTitle().contains(title)) {
			extentTest.log(LogStatus.PASS,"Test Passes");
			
		}else {
			System.out.println("Fail");
		}
		reports.endTest(extentTest);
		reports.flush();
		

	}
	public static String Screenshot() {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File tempFile = ts.getScreenshotAs(OutputType.FILE);
	System.out.println(tempFile); 
	File destFile = new File("./Screenshot/Scrnshot1.png");	
	
	try {
		FileHandler.copy(tempFile, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String filePath = destFile.getAbsolutePath();
	System.out.println(filePath);
	return filePath;
	


}
}
