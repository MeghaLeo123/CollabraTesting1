package Actions;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleCalenderPopup {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		String month = ldt.getMonth().name();
		month  = month.substring(0,1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver,10);
		
		driver.get("https://in.via.com/");
		Actions actions = new Actions(driver);
		actions.click().perform();
		
		driver.findElement(By.xpath("//button[text()='Sure!']")).click();
		driver.findElement(By.id("departure")).click();
		for(;;) {
			try {
			driver.findElement(By.xpath("//span[text()='"+month+" "+year+"']/../../..//div[text()='"+date+"']")).click();			
			break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@class='vc-month-box-head-cell vc-month-controls icon-Rightarrowthin vc-month-control-active js-next-month']")).click();
			}
		}
	}
}

