package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	
//		alert
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
//		confirm
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
      	driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	
		
		

	}

}
