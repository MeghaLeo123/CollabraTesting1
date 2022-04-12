
package testCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericLiberary.BaseClass;

public class TestCase_1 extends BaseClass{
	
	@Test
	
		public void report1() {
		String title="Zomto";
		
			if(driver.getTitle().contains(title)) {
				extentTest.log(LogStatus.PASS,"Test Passes");
				
			}else {
				System.out.println("Fail");
			}
			extent.endTest(extentTest);
			//reports.flush();
			

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


	


