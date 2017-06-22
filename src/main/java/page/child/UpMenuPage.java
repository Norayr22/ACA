package page.child;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpMenuPage {

	WebDriver driver;
	
	@FindBy(xpath = Constants.PRESS_STATISTICS)
	WebElement statistics;
	@FindBy(xpath = Constants.PRESS_REGULATIONS)
	WebElement regulations;
	
	public UpMenuPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    public void pressStatistics(){
    	this.statistics.click();
    }
    public void pressRegulations(){
    	this.regulations.click();
    }
}
