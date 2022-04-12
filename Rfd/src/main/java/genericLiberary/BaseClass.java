package genericLiberary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass implements FrameworkConstants {
	
	public ExtentReports extent;
	public ExtentTest extentTest;
  public static WebDriver driver;
  public WebDriver explicitWait;
	
	@BeforeSuite
	public void setUp() {
		//ExtentHtmlReporter html = new ExtentHtmlReporter("extentReporter.html");
		ExtentReports extent = new ExtentReports("./ExtentReports/reports.html");
		ExtentTest extentTest = extent.startTest("ExtentDemo");
	}
	@BeforeClass
	public void setUp1() {
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully", true);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//explicitWait = (WebDriver) new WebDriverWait(driver, 10);
	}
		
	@BeforeMethod
	public void setUp2() {
		driver.get("https://www.zomato.com/");
		
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
		
	}
}
	
	