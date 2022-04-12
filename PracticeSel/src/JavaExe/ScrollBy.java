package JavaExe;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000);");
		
//		JavascriptExecutor js1 =(JavascriptExecutor)driver;
//		js1.executeScript("window.scrollTo(0,2000);");
		WebElement ele =driver.findElement(By.xpath("//h2[text()='Collections']"));
		
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].scrollIntoView(true);",ele);
		
	}
	
	

}
