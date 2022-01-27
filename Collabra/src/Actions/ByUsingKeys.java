package Actions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ByUsingKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// WebDriverWait explicitWait = new WebDriverWait(driver,10);
		driver.get("https://www.myntra.com/");
		List<WebElement> navEle = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		Actions actions = new Actions(driver);
		for (WebElement ele : navEle) {
			actions.keyDown(Keys.SHIFT).click(ele).perform();
			actions.keyUp(Keys.SHIFT).perform();
		}
		
		Set<String> allWindowIds=driver.getWindowHandles();
		String expectedWindowTitle="Home and Living - Buy Interior Decoration Products and Accessories Online in India";
		
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
			String actualWindowTitle = driver.getTitle();
			if(expectedWindowTitle.equals(actualWindowTitle))
			{
				driver.close();
				break;
			}
		}

	}

}
