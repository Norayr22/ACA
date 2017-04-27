package page.child;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuestPage {
 
	final static String CLICK_SPORT_BUTTON = "//a[@href='https://sport.totogaming.am/SportsBook/Home?l=ru&d=d']";
	final static String LOGO = "//div[@class='tl_logo']";
	
	@FindBy(xpath = CLICK_SPORT_BUTTON)
	private WebElement click_sport_button;
	@FindBy(xpath = LOGO)
	private WebElement logo;
	
	public void clickSportButton(){
		this.click_sport_button.click();
	}
	public boolean logoIsDisplayed(){
		return this.logo.isDisplayed();
		
	}
	
	
}
