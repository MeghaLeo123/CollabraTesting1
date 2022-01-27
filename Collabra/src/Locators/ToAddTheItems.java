package Locators;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAddTheItems {

	public static void main(String[] args) 
		{
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    ChromeDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.get("https://www.flipkart.com/");
		   
		    driver.findElement(By.xpath("//button[text()='✕']")).click();
			driver.findElement(By.name("q")).sendKeys("poco",Keys.ENTER);
			driver.findElement(By.xpath("//div[text()='POCO C31 (Royal Blue, 64 GB)']")).click();
			addToCart(driver, "Poco- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
			
			
			driver.findElement(By.name("q")).clear();
			driver.findElement(By.name("q")).sendKeys("iphone12",Keys.ENTER);
			driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Black, 64 GB)']")).click();
			addToCart(driver, "Iphone12- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
			
			
			driver.findElement(By.name("q")).clear();
			driver.findElement(By.name("q")).sendKeys("iphone13",Keys.ENTER);
			driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 256 GB)']")).click();
			addToCart(driver, "Iphone13- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
			
			
			driver.findElement(By.linkText("Cart")).click();
			driver.navigate().refresh();
			driver.findElement(By.xpath(""));
			}
		
		public static void addToCart(WebDriver driver,String expectedtitle) {
			String parentWin = driver.getWindowHandle();
			Set<String> allWin = driver.getWindowHandles();
			allWin.remove(parentWin);
			
			for(String s : allWin) {
				driver.switchTo().window(s);
				String actualtitle = driver.getTitle();
				if(expectedtitle.equals(actualtitle)) {
					System.out.println("Driver switched control to a parent page");
				}
			}
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			driver.switchTo().window(parentWin);
			
		} 
}

