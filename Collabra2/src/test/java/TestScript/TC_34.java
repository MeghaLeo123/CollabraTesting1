package TestScript;

import java.util.Set;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import GenericLiberary.BaseClass;
import GenericLiberary.ExcelUtility;
import PomRepo.InvoicePage;

public class TC_34 extends BaseClass{
	String testURL = ExcelUtility.readStringData("Sheet1", 0, 0);
	String username = ExcelUtility.readStringData("Sheet1", 0, 1);
	String password = ExcelUtility.readStringData("Sheet1", 0, 2);
	String expectedLoginPageTitle = ExcelUtility.readStringData("Sheet1", 0, 3);
	String expectedHomePageTitle = ExcelUtility.readStringData("Sheet1", 0, 4);
	String subject = ExcelUtility.readStringData("Sheet1", 0, 5);
	String shipping = ExcelUtility.readStringData("Sheet1", 0, 6);
	@Test
	public void AssignedToInvoice4() throws InterruptedException {
		
		homePage.getClickOnCreate().click();

		InvoicePage invoicePage = new InvoicePage(driver);
		invoicePage.getSubjectTextField().sendKeys(subject);
		invoicePage.getShippingAddressTextField().sendKeys(shipping);
		invoicePage.getCoppyingAddress().click();

		invoicePage.getOrganizationName().click();

		String expectedParentPage = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		allWinId.remove(expectedParentPage);

		for (String a : allWinId) {
			driver.switchTo().window(a);
			InvoicePage invoice = new InvoicePage(driver);
			invoice.getClickonMotorola().click();

			Alert confirmationPopUp = driver.switchTo().alert();
			System.out.println(confirmationPopUp.getText());

			confirmationPopUp.dismiss();

		}

		driver.switchTo().window(expectedParentPage);
		invoicePage.scroll(driver);

		invoicePage.getClickonIcon().click();

		String expectedParentPage1 = driver.getWindowHandle();
		Set<String> allWinId1 = driver.getWindowHandles();
		allWinId1.remove(expectedParentPage1);

		for (String a1 : allWinId1) {
			driver.switchTo().window(a1);
			InvoicePage invoice1 = new InvoicePage(driver);
			Thread.sleep(3000);
			invoice1.getClickOnProduct().click();

		}

		driver.switchTo().window(expectedParentPage1);

		invoicePage.getAddProduct().click();
		invoicePage.getClickonIcon1().click();

		String expectedParentPage2 = driver.getWindowHandle();
		Set<String> allWinId2 = driver.getWindowHandles();
		allWinId2.remove(expectedParentPage2);

		for (String a2 : allWinId2) {
			driver.switchTo().window(a2);
			InvoicePage invoice2 = new InvoicePage(driver);
			Thread.sleep(3000);
			invoice2.getClickonProduct1().click();

		}

		driver.switchTo().window(expectedParentPage2);

		invoicePage.getEnterQuantity().sendKeys("1");
		
		invoicePage.getEnterDigit().sendKeys("233");
		
		invoicePage.getClickOnDown().click();

		invoicePage.getClickOnSave().click();

		invoicePage.getClickOnimg2().click();


	}
}



