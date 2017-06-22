package page.child;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileVersionPage {
	
	WebDriver driver;
	
	@FindBy(xpath = Constants.MOBILE_VERSION_BUTTON)
	WebElement mobile_version;
	@FindBy(xpath = Constants.MOBILE_DEVICE_LANGUAGE_SELECTOR)
	WebElement language_selector;
	@FindBy(xpath = Constants.SELECTED_ENGLISH_LANGUAGE_FOR_MOBILE_DEVICE)
	WebElement select_english;
	
	public MobileVersionPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickMobileVersion(){
		this.mobile_version.click();
		
	}
	public void languageSelector(){
		this.language_selector.click();
	}
	public void selectEnglish(){
		this.select_english.click();
	}
}
