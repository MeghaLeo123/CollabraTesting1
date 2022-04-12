package Invoice;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_32 {
	@Test
	
	public void AssignedToInvoice2() throws InterruptedException {
		
		String testURL = ExcelUtility.readStringData("Sheet1", 0, 0);
		String username = ExcelUtility.readStringData("Sheet1", 0, 1);
		String password = ExcelUtility.readStringData("Sheet1", 0, 2);
		String expectedLoginPageTitle = ExcelUtility.readStringData("Sheet1", 0, 3);
		String expectedHomePageTitle = ExcelUtility.readStringData("Sheet1", 0, 4);
		String subject = ExcelUtility.readStringData("Sheet1", 0, 5);
		String shipping = ExcelUtility.readStringData("Sheet1", 0, 6);
		
		LocalDateTime ldt = LocalDateTime.now();
		String month = ldt.getMonth().name();
		month  = month.substring(0,1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();
		
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(testURL);
		String actualLoginPageTitle = driver.getTitle();
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login page displayed successfully");
		} else {
			System.out.println("Login page not displayed successfully");
		}

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getUsernameTextfield().sendKeys(username);
		loginPage.getPasswordTextfield().sendKeys(password);
		loginPage.getLoginButton().click();

		
		String actualHomePageTitle = driver.getTitle();
		if (actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Home page displayed successfully ");
		} else {
			System.out.println("Home page not displayed successfully");
		}
		
		HomePage homePage = new HomePage(driver);
		homePage.clickOnInovice(driver);
		homePage.getClickOnCreate().click();
		
		InvoicePage invoicePage = new InvoicePage(driver);
		invoicePage.getSubjectTextField().sendKeys(subject);
		invoicePage.getShippingAddressTextField().sendKeys(shipping);
		invoicePage.getCoppyingAddress().click();
		
		invoicePage.getOrganizationName().click();
		
		
		String expectedParentPage = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		allWinId.remove(expectedParentPage);
		
		for(String a:allWinId)
		{
			driver.switchTo().window(a);
			InvoicePage invoice=new InvoicePage(driver);
			invoice.getClickonMotorola().click();
			
			Alert confirmationPopUp=driver.switchTo().alert();
			System.out.println(confirmationPopUp.getText());
			
			confirmationPopUp.dismiss();
			
			
		}
		
	    driver.switchTo().window(expectedParentPage);
		invoicePage.scroll(driver);
		
		//invoicePage.getClickOnAddProduct().click();
		
		invoicePage.getClickonIcon().click();
		
        String expectedParentPage1 = driver.getWindowHandle();
		Set<String> allWinId1 = driver.getWindowHandles();
		allWinId1.remove(expectedParentPage1);
		
		for(String a1:allWinId1)
		{
			driver.switchTo().window(a1);
			InvoicePage invoice1=new InvoicePage(driver);
			Thread.sleep(3000);
	        invoice1.getClickOnProduct().click();
 	
		}
		
		driver.switchTo().window(expectedParentPage1);
        invoicePage.getEnterQuantity().sendKeys("1");
     
        invoicePage.getClickOnCalender().click();
         
       
    		driver.findElement(By.xpath("//td[text()='February, 2022']/../../..//td[text()='15']")).click();					
        
      invoicePage.getClickOnSave().click();
        
      invoicePage.getClickOnimg2().click();
        
      invoicePage.getSignOut().click();
        
      
		
	}
}




