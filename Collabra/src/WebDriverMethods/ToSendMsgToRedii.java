package WebDriverMethods;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSendMsgToRedii {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");

		driver.findElement(By.linkText("Sign in")).click();

		WebElement userText = driver.findElement(By.id("login1"));
		userText.clear();
		userText.sendKeys("meghanam1999@rediffmail.com");

		WebElement Pwd = driver.findElement(By.id("password"));
		Pwd.clear();
		Pwd.sendKeys("Leosuho@01");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		WebElement To = driver.findElement(By.xpath("//input[@id='TO_IDcmp2']"));
		To.clear();
		To.sendKeys("meghanams1999@rediffmail.com");

		WebElement Sub = driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']"));
		Sub.clear();
		Sub.sendKeys("Meghana M");

		WebElement frameElement = driver
				.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, rdMailEditorcmp2')]"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("HI , Good Evening");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		Thread.sleep(3000);

		for (;;) {
			try {
				driver.findElement(By.xpath("//span[text()='Rediff . com']")).click();
				driver.findElement(By.linkText("Delete")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.navigate().refresh();
			}
		}
		//driver.close();
	}

}
