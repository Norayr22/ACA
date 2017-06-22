package page.child;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.USERNAME)
	WebElement username;
	@FindBy(xpath = Constants.PRESS_LOGOUT)
	WebElement press_logout;
	
	public LogOutPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void pressOnUsername(){
		this.username.click();
	}
	public void pressOnLogOut(){
		this.press_logout.click();
	}
}
