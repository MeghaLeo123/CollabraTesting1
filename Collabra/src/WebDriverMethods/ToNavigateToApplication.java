package WebDriverMethods;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToNavigateToApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe" );
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.zomato.com/");
        driver.get("https://www.swiggy.com/");
	}

}
