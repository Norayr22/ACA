package page.child;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatisticsPage {
	
    WebDriver driver;
    
    @FindBy(xpath = Constants.PRESS_HANDBALL_FROM_STATISTICS)
    WebElement press_handball;
    @FindBy(xpath = Constants.PRESS_EUROPE_FROM_HANDBALL_STATISTICS)
    WebElement press_europe;
    @FindBy(xpath = Constants.CHOOSE_SPAIN_FROM_EUROPE)
    WebElement choose_spain;
    @FindBy(xpath = Constants.CHOOSE_NATIONAL_CUP_FROM_SPAIN)
    WebElement choose_spain_cup;
    
    public StatisticsPage(WebDriver driver){
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    public void pressHandball(){
    	this.press_handball.click();
    }
    public void pressEurope(){
    	this.press_europe.click();
    }
    public void chooseSpain(){
    	this.choose_spain.click();
    }
    public void chooseSpainCup(){
    	this.choose_spain_cup.click();
    }
}
