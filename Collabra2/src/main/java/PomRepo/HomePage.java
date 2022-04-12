package PomRepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "More")
	private WebElement clickOnmore;

	@FindBy(xpath = "//a[@id='more' and @name='Invoice']")
	private WebElement clickOnInvoice;

	public WebElement getClickOnmore() {
		return clickOnmore;
	}

	public WebElement getClickOnInvoice() {
		return clickOnInvoice;
	}
	
	@FindBy(xpath="//img[@title='Create Invoice...']")
	   private WebElement clickOnCreate;

	public WebElement getClickOnCreate() {
		return clickOnCreate;
	}
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjectTextField;
	
	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

public void clickOnInovice(WebDriver driver){

		Actions action = new Actions(driver);
		action.moveToElement(clickOnmore).perform();

		clickOnInvoice.click();

	}

public void alert(WebDriver driver) {
	// TODO Auto-generated method stub
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
   
      
   
}
