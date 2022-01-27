package WebDriverMethods;

	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ToSettTheSizeOfTheApplication {

		public static void main (String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\hp\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://skillrary.com/");
			
			Dimension dimension = new Dimension(1212,2300);
			driver.manage().window().setSize(dimension);
			
			

		
		}
	}



s                                                               