package Invoice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjectTextField;
	
	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shippingAddressTextField;

	public WebElement getShippingAddressTextField() {
		return shippingAddressTextField;
	}
	
	@FindBy(xpath="//input[@onclick='return copyAddressLeft(EditView)']")
	private WebElement coppyingAddress;

	public WebElement getCoppyingAddress() {
		return coppyingAddress;
	}
	
	@FindBy(xpath="(//img[@title=\"Select\"])[3]")
	private WebElement organizationName;

	public WebElement getOrganizationName() {
		return organizationName;
	}
	
	//@FindBy(xpath=("(//tr[@class='lvtColData'])[11]/../../..//a[text()='Motorola']"))
	@FindBy(linkText="Motorola")
	private WebElement clickonMotorola;
	
	

	public WebElement getClickonMotorola() {
		return clickonMotorola;
	}
	



	@FindBy(id="searchIcon1")
	private WebElement clickonIcon;
	
	

		
		public WebElement getClickonIcon() {
		return clickonIcon;
	}
		@FindBy(id="searchIcon2")
		private WebElement clickonIcon1;
		
		
		public WebElement getClickonIcon1() {
			return clickonIcon1;
		}


		@FindBy(id="popup_product_130")
		private WebElement clickOnProduct;

		public WebElement getClickOnProduct() {
			return clickOnProduct;
		}
		
		@FindBy(id="popup_product_57")
		private WebElement clickonProduct1;
		
		public WebElement getClickonProduct1() {
			return clickonProduct1;
		}


		@FindBy(id="qty1")
		private WebElement enterQuantity;




	     public WebElement getEnterQuantity() {
			return enterQuantity;
		}
	     
	     @FindBy(id="qty2")
	     private WebElement enterDigit;
	     
	     public WebElement getEnterDigit() {
			return enterDigit;
		}
	     
	     @FindBy(xpath="//img[contains(@src,'themes/images/up_layout.gif')]")
	     private WebElement clickOnDown;
	     
	     public WebElement getClickOnDown() {
			return clickOnDown;
		}


		@FindBy(xpath="(//input[@type='submit'])[2]")

	     private WebElement clickOnSave;
	     
	     public WebElement getClickOnSave() {
			return clickOnSave;
		}
	     
	     @FindBy(xpath="//input[@value='Add Product']")
	     private WebElement addProduct;
	     
	     public WebElement getAddProduct() {
			return addProduct;
		}


		@FindBy(linkText ="Sign Out")
	     private WebElement signOut;
	     
	     public WebElement getSignOut() {
			return signOut;
		}
	     
	     @FindBy(xpath="(//img[@src='themes/softed/images/user.PNG'])")
	     private WebElement clickOnimg2;
	     
	     public WebElement getClickOnimg2() {
			return clickOnimg2;
		}
	     
	     @FindBy(xpath=("//img[@id='jscal_trigger_duedate']"))
	     private WebElement clickOnCalender;
	     

        public WebElement getClickOnCalender() {
			return clickOnCalender;
		}


		public void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000);");
	}
		
	
	
}


