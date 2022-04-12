package WeBdriver;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;


public class webdri2 {
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.skillrary.com/");
	//driver.manage().window().maximize();
	//driver.manage().window().fullscreen();
//	Dimension dimension = driver.manage().window().getSize();
//	int height = dimension.getHeight();
//	int width = dimension.getWidth();
//	System.out.println("Height :" +height+ "and Width :" +width );

//	Dimension dimension = new Dimension(2011,234);
//	driver.manage().window().setSize(dimension);
	
//	Point point = driver.manage().window().getPosition();
//	System.out.println(point.getX());
//	System.out.println(point.getY());

	Point point = new Point(123,233);
	driver.manage().window().setPosition(point);
	
	
	
	
	
	
	
	}
	

}
