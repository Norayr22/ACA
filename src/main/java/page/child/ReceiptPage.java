package page.child;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page.base.PageObject;

public class ReceiptPage extends PageObject{
	final String HOME_PAGE = "//a[@href='/SportsBook/Home']";
	@FindBy(xpath = HOME_PAGE)
	private WebElement header; 
	public ReceiptPage(WebDriver driver){
		
	super(driver);
		} 
	public String confirmationHeader(){ 
		return header.getText(); 
	}
}
