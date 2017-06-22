package page.child;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {
	
    WebDriver driver;
    @FindBy(xpath = Constants.RESULTS_BUTTON)
    WebElement result_button;
    @FindBy(xpath = Constants.CLICK_ALL_FROM_RESULTS)
    WebElement choose_all;
    @FindBy(xpath = Constants.CHOOSE_ENGLAND_FROM_ALL_MENU)
    WebElement choose_england;
    @FindBy(xpath = Constants.PRESS_SHOW_BUTTON_IN_RESLUTS)
    WebElement press_show_button;
    
    public ResultsPage(WebDriver driver){
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    public void clickOnResults(){
    	this.result_button.click();
    }
    public void clickAll(){
    	this.choose_all.click();
    }
    public void chooseEngland(){
    Actions action1 = new Actions(driver);
    action1.moveToElement(choose_england).moveToElement(choose_england).click().build().perform();
    }
    public void pressShowButton(){
    	this.press_show_button.click();
    }
  	   
}
