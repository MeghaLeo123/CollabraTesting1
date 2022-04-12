package ExtentReport;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports reports = new ExtentReports("./ExtentReports/Reports.html");
		ExtentTest extentTest = reports.startTest("ExtentDemo");
		
		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		String title="Zomato";
		if(driver.getTitle().contains(title)) {
			extentTest.log(LogStatus.PASS,"Test Passes");
			
		}else {
			System.out.println("Fail");
		}
		reports.endTest(extentTest);
		reports.flush();
	}
}

		
