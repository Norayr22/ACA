package page.child;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragElementsPage {
	
    
    WebDriver driver;
    @FindBy(xpath = Constants.TV_ICON)
    WebElement tv_icon;
    @FindBy(xpath = Constants.MENU_ICON)
    WebElement menu_icon;
    @FindBy(xpath = Constants.LIVE_TV_WINDOW)
    WebElement live_tv_window;
    @FindBy(xpath = Constants.PLACE_TO_DRAG_LIVETV)
    WebElement place_to_drag;
    public DragElementsPage(WebDriver driver){
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    } 
    public void dragElements(){
    Actions Drag = new Actions(driver);
	Drag.dragAndDrop(tv_icon, menu_icon).perform();
}
    public void dragLiveTv(){
    Actions Drag1 = new Actions(driver);
    Drag1.dragAndDrop(live_tv_window, place_to_drag).perform();
    }
}
