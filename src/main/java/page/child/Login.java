package page.child;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page.base.PageObject;


public class Login extends PageObject {
	

	
    final String INPUT_LOGIN_FIELD = "//input[@id='login']";
    final String LOGIN = "totobasket";
    final String INPUT_PASSWORD_FIELD = "//input[@id='password']";
    final String PASSWORD = "toto1";
    final String CLICK_TO_LOGIN = "//*[@id='login_dialogue']/input";
    
   
    
	
    
    @FindBy(xpath = INPUT_LOGIN_FIELD)
    private WebElement login;
    @FindBy(xpath = INPUT_PASSWORD_FIELD)
    private WebElement password;
    @FindBy(xpath = CLICK_TO_LOGIN)
    private WebElement loginButton;
	
    
    public Login(WebDriver driver)  {
		super(driver);
    }
    public void enterName(String login, String password)  {
		this.login.clear();
		this.login.sendKeys(login);
		this.password.clear();
		this.password.sendKeys(password);
	}
    
    
    public ReceiptPage submit(){
        loginButton.click();
        return new ReceiptPage(driver);
   
    }
}


