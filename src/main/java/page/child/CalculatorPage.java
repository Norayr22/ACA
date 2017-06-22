package page.child;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

	 
     WebDriver driver;
     
     @FindBy(xpath = Constants.CLICK_CALCULATOR)
     WebElement calculator;
     @FindBy(xpath = Constants.CHANGE_CALCULATOR_SYSTEM_STANDART)
     WebElement change_calculator;
     @FindBy(xpath = Constants.CLICK_SYSTEM_OPTION)
     WebElement system_options;
     @FindBy(xpath = Constants.CHOOSE_FROM_OPTIONS_2_4)
     WebElement choose_option;
     @FindBy(xpath = Constants.FIRST_INPUT_FIELD_FOR_ODD)
     WebElement first_odd;
     @FindBy(xpath = Constants.SECOND_INPUT_FIELD_FOR_ODD)
     WebElement second_odd;
     @FindBy(xpath = Constants.THIRD_INPUT_FIELD_FOR_ODD)
     WebElement third_odd;
     @FindBy(xpath = Constants.FOURTH_INPUT_FIELD_FOR_ODD)
     WebElement fourth_odd;
     @FindBy(xpath = Constants.UNCHECK_THIRD_FIELD)
     WebElement uncheck_third_field;
     @FindBy(xpath = Constants.CALCULATE_BUTTON)
     WebElement calc_button;
     @FindBy(xpath = Constants.CHECK_NUMBER_OF_OPTIONS)
     WebElement number_of_options;
     
     public CalculatorPage(WebDriver driver){
    	 this.driver = driver;
    	 PageFactory.initElements(driver, this);
    	 
     }
     public void clickCalculator(){
    	 this.calculator.click();
     }
     public void changeCalculator(){
    	 this.change_calculator.click();
    	 
     }
     public void systemCalculatorOption(){
    	 this.system_options.click();
     }
     public void chooseFromOptions(){
    	 this.choose_option.click();
    	 
     }
     public void enterOdds(){
    	 this.first_odd.clear();
    	 this.first_odd.sendKeys("3");
    	 this.second_odd.clear();
    	 this.second_odd.sendKeys("4");
    	 this.third_odd.clear();
    	 this.third_odd.sendKeys("4.5");
    	 this.third_odd.sendKeys(Keys.TAB);
    	 this.fourth_odd.clear();
    	 this.fourth_odd.sendKeys("5.5");
     }
     public void uncheck(){
    	 this.uncheck_third_field.click();
     }
     public void calculate(){
    	 this.calc_button.click();
     }
     public boolean nuberOfOprtionsIsDisplayed(){
       return this.number_of_options.isDisplayed();
     }
}    