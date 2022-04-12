package GenericLiberary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

//import Invoice.ExcelUtility;
import PomRepo.HomePage;
import PomRepo.InvoicePage;
import PomRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public ExcelUtility elib = new ExcelUtility();
	public WebDriverWait explictWait;
	public HomePage homePage;
	public LoginPage loginPage;
	public InvoicePage invoicePage;
	public Actions actions;

	String testURL = ExcelUtility.readStringData("Sheet1", 0, 0);
	String username = ExcelUtility.readStringData("Sheet1", 0, 1);
	String password = ExcelUtility.readStringData("Sheet1", 0, 2);
	String expectedLoginPageTitle = ExcelUtility.readStringData("Sheet1", 0, 3);
	String expectedHomePageTitle = ExcelUtility.readStringData("Sheet1", 0, 4);
//	String subject = ExcelUtility.readStringData("Sheet1", 0, 5);
//	String shipping = ExcelUtility.readStringData("Sheet1", 0, 6);
   
	
	
	@BeforeTest
	public void LaunchingBrowser(@Optional("chrome") String bName) {
		if (bName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"./src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
		Reporter.log("Browser is launched Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized Successfully", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		explictWait = new WebDriverWait(driver, 10);
	}

	@BeforeClass
	public void LoginAppVtiger() {

		
		driver.get(testURL);
		loginPage = new LoginPage(driver);
		loginPage.getUsernameTextfield().sendKeys(username);
		loginPage.getPasswordTextfield().sendKeys(password);
		loginPage.getLoginButton().click();
		Reporter.log("Home page is displayed successfully", true);
	}
	
	@BeforeMethod
	public void HomeVtiger() {
		homePage = new HomePage(driver);
		homePage.getClickOnmore().click();
		homePage.getClickOnInvoice().click();
	}


	@AfterClass
	public void ClosingBrowser() {
		
		Reporter.log("Signed out successfully", true);
		driver.quit();
		Reporter.log("Successfully closed the browser", true);
	}

}