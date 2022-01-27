package Locators;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCompareTheProduct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement texts = driver.findElement(By.name("q"));
		texts.click();
		texts.sendKeys("Poco");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//div[@data-id])[3]")).click();
		String value = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
		String price =value.toString();
		String pric =price.replaceAll("[^\\d.","");
		
		int val=Integer.parseInt(pric);
		System.out.println(val);

    if(val<=6000)
    {
		String parentWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		allWin.remove(parentWin);
        String expectedtitle ="POCO M2 Pro (Two Shades of Black, 64 GB)";
		
        for (String s : allWin) {
			driver.switchTo().window(s);
			String actualtitle = driver.getTitle();
			if (expectedtitle.equals(actualtitle)) {
				System.out.println("Driver switched control to a parent page");
			}
		}
		
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//span[text()='CART']")).click();
    }
    
		else
		{
			System.out.println("Watch price is greater than 6000");
		}

	}
}


