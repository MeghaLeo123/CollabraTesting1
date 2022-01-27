package testNGBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Loans_101 {                       //testNG class

	@Test
	public void deleteLoan() {                     //test case
		System.out.println("Hi welcome to TestNG");
		
		Reporter.log("We are learning how to add logs in report",true);
	}
}
