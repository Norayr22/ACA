package page.child;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LangChange {

	WebDriver driver;
	final String WEB_PAGE_LANGUAGE_SELECTOR = "//div[@class='sportHeaderLang secClr']//div[@class='lang ru']";
    final String SELECTED_ENGLISH_LANGUAGE_FOR_WEB_PAGE = "//div[@class='dropdown-content']//div[@class='lang en']";
    
   
    @FindBy(xpath=(WEB_PAGE_LANGUAGE_SELECTOR))
    WebElement langSelect;

    @FindBy(xpath = SELECTED_ENGLISH_LANGUAGE_FOR_WEB_PAGE)                                                 
    WebElement engLanguage;
    
    public LangChange(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
    public void changeLanguage() {
    	 Actions action = new Actions(driver);
    	 action.moveToElement(langSelect);//.moveToElement(langSelect).click().build().perform();
    	 action.moveToElement(engLanguage).moveToElement(engLanguage).click().build().perform();
    
         }
}

