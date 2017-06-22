package page.child;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BettingPage {

	
    WebDriver driver;
    
    @FindBy(xpath = Constants.PRESS_ON_FIRST_ODD_ON_FIRST_GAME)
    WebElement press_odd;
    @FindBy(xpath = Constants.INPUT_FIELD_FOR_BETTING)
    WebElement input_field;
    @FindBy(xpath = Constants.PRESS_PLACE_BET_BUTTON)
    WebElement place_bet;
    @FindBy(xpath = Constants.ERROR_MESSAGE_ABOUT_MIN_BET)
    WebElement error_message;
    
    public BettingPage(WebDriver driver){
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    public void pressOnFirstOdd(){
    	this.press_odd.click();
    }
    public void inputField(){
    	this.input_field.sendKeys(Constants.INPUT_MONEY);
    }
    public void pressPlaceBet(){
    	this.place_bet.click();
    }
    public boolean errorMessageIsDisplayed(){
    	return this.error_message.isDisplayed();
    }
}
