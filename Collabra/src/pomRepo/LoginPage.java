package pomRepo;

import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage() {
		//initialize the code at the time of calling to all the page classes and identify elements using getter() and it avoids staleElement exception
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="username")
	

}
