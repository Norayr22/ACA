package page.child;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveTvPage {
        WebDriver driver;
    
    @FindBy(xpath = Constants.CLICK_TO_LIVETV)
    WebElement live_tv;
    @FindBy(xpath = Constants.OPEN_LIVETV_LIST)
    WebElement live_tv_list;
    @FindBy(xpath = Constants.CHOOSE_SECOND_LIVE_MATCH)
    WebElement second_live_match;
    @FindBy(xpath = Constants.CUT_LIVETV_FROM_SITE)
    WebElement cut_live_tv;
    
    public LiveTvPage(WebDriver driver){
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    public void clickLiveTv(){
    	this.live_tv.click();
    	
    }
    public void openLiveTvList(){
    	this.live_tv_list.click();
    }
    public void chooseSecondMatch(){
    	this.second_live_match.click();
    }
    public void cutLiveTv(){
    	this.cut_live_tv.click();
    }
}
