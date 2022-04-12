package testNG_Advanced;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_Congiguration_001 {
	@Test
	public void modifyLoan() {
		Reporter.log("from modify before suite method",true);
	}
		
    @BeforeMethod
		public void modifyLoan1() {
			Reporter.log("from before method",true);
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
		public void modifyLoan4() {
			Reporter.log("from  before class method",true);
	}
    @AfterClass
		public void modifyLoan5() {
			Reporter.log("from modify after suite method",true);
			
					
	}




}
