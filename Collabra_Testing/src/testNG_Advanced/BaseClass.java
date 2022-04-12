package testNG_Advanced;

	
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import pomRepo.HomePage;
import pomRepo.LoginPage;

	public class BaseClass  {
		WebDriver driver;
		@Test
		public void modifyLoan() {
			Reporter.log("from modify before suite method",true);
		}
			
	    @BeforeMethod
			public void beforeMethod() {
	    	driver.get("https://demo.actitime.com/login.do");
	    	LoginPage  loginPage = new LoginPage(driver);
	    	loginPage.loginToApp("admin","manager");
	    	String expectedHomePageTitle = "";
	    	if(driver.getTitle().equals(expectedHomePageTitle)) {
	    		Reporter.log("Successfully logged in the application",true);
	    	}else {
	    		Reporter.log("Login Page was failed");
	    	}
	    }
			
		@BeforeTest
			public void modifyLoan2() {
				Reporter.log("from before test method",true);
		}
				
		@BeforeSuite
			public void modifyLoan3() {
				Reporter.log("from before suite method",true);
		}
					
		
		@BeforeClass
			public void beforeClass(@Optional("chrome") String bName) {
			if(bName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(bName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new FirefoxDriver();
			}else {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			Reporter.log("Browser is launched successfully",true);
			driver.manage().window().maximize();
			Reporter.log("Browser is maximized successfully",true);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	    @AfterClass
			public void afterClass() {
	    	driver.quit();
				Reporter.log("Successfully closed the browser");
	    }
				
		@AfterMethod
		    public void afterMethod() {
			HomePage homePage = new HomePage(driver);
			homePage.getLogoutLink().click();
			String expectedLoginPageTitle ="";
			if(driver.getTitle().equals(expectedLoginPageTitle)) {
				Reporter.log("Successfully logged out of the application");
			}else {
				Reporter.log("Successfully closed the browser");
			}
		}
	




	}


