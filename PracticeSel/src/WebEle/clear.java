package WebEle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTagName;

public class clear {
	public static void main(String[] arg) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
//		
//		WebElement ele1 = driver.findElement(By.id("username"));
//		ele1.clear();
//		ele1.sendKeys("Meghana");
//		//System.out.println(ele1.getText());
//		
//	    String  ele2 = driver.findElement(By.linkText("Sign in")).getCssValue("border");
//		System.out.println(ele2);
//		
		
		
	}

	
}
