package Assignment1;

import java.util.Set;

import org.openqa.selenium.TreeSet;
import org.openqa.selenium.chrome.ChromeDriver;

public class Treeset {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.naukri.com");
			TreeSet<String> titles = new TreeSet<String>();
			
			Set<String> allWindowIds = driver.getWindowHandles();
		    for(String windowId: allWindowIds) {
		   
			driver.switchTo().window(windowId);
		    titles.add(driver.getTitle());
		    }
		    for(String title : titles)
		    {
		    	System.out.println(title);
		    
		    
		    
			
		    }
		

	}

}
