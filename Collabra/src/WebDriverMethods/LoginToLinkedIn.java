package WebDriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginToLinkedIn {

	
	public static void main(String[] args) {

		// Test Data
		String testUrl = ("https://linkedin.com/");
		String Username = "meghana.m0610@gmail.com";
		String Password = "Megha@01";
		String expectedLoginPageTitle = "LinkedIn: Log In or Sign Up";
		String expectedHomePageTitle = "(3) Feed | LinkedIn";

		// Step 1: open the browser and enter the URL
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized successfully");
		driver.get(testUrl);
		String actualLoginPageTitle = driver.getTitle();
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login page is displayed successfully");
		} else {
			System.out.println("Login page is not  displayed successfully");
		}

		// step 2: Enter username into username textfield
		WebElement usernameTextField = driver.findElement(By.id("session_key"));
		usernameTextField.clear();
		usernameTextField.sendKeys(Username);
		String actualUsernameEntered = usernameTextField.getAttribute("value");
		if (actualUsernameEntered.equals(Username)) {
			System.out.println("username enterd successfully");
		} else {
			System.out.println("username enterd is not successfully");
		}

		// step 3: Enter password into password textfield
		WebElement passwordTextField = driver.findElement(By.id("session_password"));
		passwordTextField.clear();
		passwordTextField.sendKeys(Password);
		String actualPasswordEntered = passwordTextField.getAttribute("value");
		if (actualPasswordEntered.equals(Password)) {
			System.out.println("password enterd successfully");
		} else {
			System.out.println("password enterd is not successfully");
		}

		// step 4:click on Login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualHomePageTitle = driver.getTitle();
		if (actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Homepage is displayed successfully");
		} else {
			System.out.println("Homepage is not displayed successfully");
		}
	}
}
