package testNG_Advanced;

import org.testng.annotations.Test;

import pomRepo.HomePage;

public class TC_Configuration_002 extends BaseClass {
	
	@Test
	public void modifyLoan() {
		HomePage homePage = new HomePage(driver);
		homePage.getUsersModulelink().click();
		
		
	}
	

}
