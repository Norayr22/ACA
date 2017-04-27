package aca.first.test;






import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import page.child.GuestPage;
import page.child.LangChange;
import page.child.LoginPage;
import page.child.ReceiptPage;



public class MyFirstWebDriverTest {
	private final String SELECTED_ENGLISH_LANGUAGE_FOR_MOBILE_DEVICE = "//span[text()='English']";
    private final String MOBILE_DEVICE_LANGUAGE_SELECTOR = "//div[@class='ru']";
	private final String MOBILE_VERSION_BUTTON = "//a[@class='toMobile']";
	private final String WEB_DRIVE_TYPE = "webdriver.chrome.driver";
    private final String WEB_DRIVER_EXE_PATH = "C:\\Users\\USER\\Downloads\\chromedriver_win32\\Chromedriver.exe";
    private final String URL = "http://totobet.am";
    private final String CLICK_SPORT_BUTTON = "//a[@href='https://sport.totogaming.am/SportsBook/Home?l=ru&d=d']";
    private final String JS_LOGIC_FOR_PAGE_SCROLLING = "window.scrollBy(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));";
    private final String LOGIN_BUTTON = "//a[@class='btnLoginHeader secBtn transAll']";
    private final String INPUT_LOGIN_FIELD = "//input[@id='login']";
    private final String LOGIN = "totobasket";
    private final String INPUT_PASSWORD_FIELD = "//input[@id='password']";
    private final String PASSWORD = "toto1";
    private final String CLICK_TO_LOGIN = "//*[@id='login_dialogue']/input";
    private final String USERNAME = "//label[@class='value ']//div[contains(text(), 'totobasket']";
    private final String WEB_PAGE_LANGUAGE_SELECTOR = "//div[@class='sportHeaderLang secClr']//div[@class='lang ru']";
    private final String SELECTED_ENGLISH_LANGUAGE_FOR_WEB_PAGE = "//div[@class='dropdown-content']//div[@class='lang en']";
    private final String IMAGE_OF_GREAT_BRITAIN_FLAG = "//a[@class='flex dropdown-menu']//img[@src='/img/flags/en.png']";
    private final String CHOOSE_FOOTBALL_ON_LEFT_MENU = "//span[@class='leftMenutxt txtColorPrm oe' and text()='Football']";
    private final String CHOOSE_EUROPE_FROM_FOOTBALL = "//span[@class='leftMenutxt txtColorSec oe' and contains(text(), 'Europe')]";
    private final String CHOOSE_UEFA_CHAMPIONS_LEGUE_FROM_EUROPE = "//span[@class='leftMenutxt txtColorSec oe' and contains(text(), 'UEFA Champions League (')]";
    private final String PRESS_ON_FIRST_ODD_ON_FIRST_GAME = "(//div[@class='prematch_stake_odd_factor l_od Decimal'])[1]";
    private final String INPUT_FIELD_FOR_BETTING = "//div[@class='betAmountRow displayFlex']//input[@id='betAmountInput']";
    private final String INPUT_MONEY = "10";
    private final String PRESS_PLACE_BET_BUTTON = "//input[@class='btn_bet ternBtn ns transAll']";
    private final String ERROR_MESSAGE_ABOUT_MIN_BET = "//div[@class='err']";
    private final String RESULTS_BUTTON = "(//a[@href='/SportsBook/Results'])[1]";
    private final String CLICK_ALL_FROM_RESULTS = "//div[@id='res_cmb_ev']";
    private final String CHOOSE_ENGLAND_FROM_ALL_MENU = "//div[@class='valueList ']//div[@title='England']";
    private final String PRESS_SHOW_BUTTON_IN_RESLUTS = "//input[@id='res_btn_show']";
    private final String PRESS_STATISTICS = "//a[@class='sm ic' and @href='javascript:OpenStatPage()']";
    private final String PRESS_HANDBALL_FROM_STATISTICS = "//div[@style='border-bottom:solid 1px #333;']//a[@id='button_sp_10']";
    private final String PRESS_EUROPE_FROM_HANDBALL_STATISTICS = "//a[@id='button_cont_10_1']";
    private final String CHOOSE_SPAIN_FROM_EUROPE = "//a[@id='button_cnt_10_169']";
    private final String CHOOSE_NATIONAL_CUP_FROM_SPAIN = "//a[@class='menuCompName menuCompName_1254']";
    private final String PRESS_REGULATIONS = "//a[@class='sm ic'and @href='https://rules.totogaming.am/?l=en&m=4&s=4']";
    private final String PRESS_LOGOUT = "(//div[@class='item '])[7]";
    private final String CUT_LIVETV_FROM_SITE = "//div[@class='selectorWrapper displayFlex']//div[@class='chb_control']";
    private final String LIVE_TV_WINDOW = "//div[@class='infoPanelDragger']";
    private final String PLACE_TO_DRAG_LIVETV = "//div[@id='sportHeaderPanewatch']";
    private final String TV_ICON = "//div[@class='ro_item ro_item3 transition200ms mn_border sportIcon header_reposition_icon']";
    private final String MENU_ICON = "//div[@class='ro_item ro_item1 transition200ms mn_border sportIcon header_reposition_icon']";
    private final String CLICK_TO_LIVETV = "//div[@class='tab_selector']//span[text()='Live TV']";
    private final String OPEN_LIVETV_LIST = "(//div[@class='dropDownControl '])[3]";
    private final String CHOOSE_SECOND_LIVE_MATCH = "((//div[@class='valueList '])[3]//i[@class='sportIcon'])[2]";
    private final String CLICK_CALCULATOR = "//a[@href='javascript:BetCalculator.show();']";
    private final String CHANGE_CALCULATOR_SYSTEM_STANDART = "//div[@id='calcSwitch']//label[@class='onOffSwitchLabel']";
    private final String CLICK_SYSTEM_OPTION = "//div[@id='calc_new_systemType']";
    private final String CHOOSE_FROM_OPTIONS_2_4 = "(//div[@class='valueList ' and @style='display: block;']//div[@class='item '])[1]";
    private final String FIRST_INPUT_FIELD_FOR_ODD = "(//input[@class='coeff textbox'])[1]";
    private final String SECOND_INPUT_FIELD_FOR_ODD = "(//input[@class='coeff textbox'])[2]";
    private final String THIRD_INPUT_FIELD_FOR_ODD = "(//input[@class='coeff textbox'])[3]";
    private final String FOURTH_INPUT_FIELD_FOR_ODD = "(//input[@class='coeff textbox'])[4]";
    private final String UNCHECK_THIRD_FIELD = "//label[@for='ch3']";
    private final String CALCULATE_BUTTON = "//input[@class='btn primBtn transAll oe']";
    private final String CHECK_NUMBER_OF_OPTIONS = "//div[@class='numbOfV']//span[text()='6']";
    
    private WebDriver webDriver;
    private String verificationMessage;
   
    
    @BeforeSuite()
    public void setUp() {
        System.setProperty(WEB_DRIVE_TYPE, WEB_DRIVER_EXE_PATH);
        webDriver = new ChromeDriver();
        verificationMessage="";
        
        webDriver.get(URL);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
/* Description: verify that language was changed.
Precondition: Will be a registered user.
1. Open any browser,
2. Go to https://totogaming.am,
3. Go to Sport,
4. Press the Login button,
5. In the opened window enter valid login and password,
6. Press login,
7. Change the language for example for English
8. Verify that language was changed.
Expected result: we must see in website all words in English.
 */
   
@Test()
public void myFirstTest() throws InterruptedException {  
        GuestPage guestpage = new GuestPage();
        guestpage.clickSportButton();
        LoginPage login = new LoginPage(webDriver);
        login.clickOnLoginButton();
        login.enterName(LOGIN,PASSWORD);
        login.submit();         
        try {
            Assert.assertTrue(webDriver.findElements(By.name(USERNAME)) !=null);
        }catch (Error e){
            verificationMessage = e.getMessage();
            Assert.fail(verificationMessage);
        }  
        LangChange change_language = new LangChange(webDriver);
        change_language.changeLanguage();
        
        
        try {                        
            Assert.assertTrue( webDriver.findElements(By.xpath(IMAGE_OF_GREAT_BRITAIN_FLAG))!=null);}
            catch (Error e){
                verificationMessage = e.getMessage();
                Assert.fail(verificationMessage);
            }
        }
/*
 * Description: verify that we can't take bet amount less than 50 
 * Steps:
 * Choose any kind of sport, country, tournament, event,
   From the choosen event press on any coeficient,
   Enter the amount <50,
   Press "Place Bet",
   Expected Result: we must see the erro log (Min. bet amount is 50, max. 500000) */

@Test()
public void mySecondTest() throws InterruptedException {

	   GuestPage guestpage = new GuestPage();
       guestpage.clickSportButton();
       webDriver.findElement(By.xpath(CHOOSE_FOOTBALL_ON_LEFT_MENU)).click(); 
       Thread.sleep(1000);
       webDriver.findElement(By.xpath(CHOOSE_EUROPE_FROM_FOOTBALL)).click();
       Thread.sleep(2000);
       webDriver.findElement(By.xpath(CHOOSE_UEFA_CHAMPIONS_LEGUE_FROM_EUROPE)).click();
       Thread.sleep(2000);
       webDriver.findElement(By.xpath(PRESS_ON_FIRST_ODD_ON_FIRST_GAME)).click();
       Thread.sleep(1000);
       webDriver.findElement(By.xpath(INPUT_FIELD_FOR_BETTING)).sendKeys(INPUT_MONEY);
       webDriver.findElement(By.xpath(PRESS_PLACE_BET_BUTTON)).click();
       try {                        
           Assert.assertTrue( webDriver.findElements(By.xpath(ERROR_MESSAGE_ABOUT_MIN_BET))!=null);}
           catch (Error e){
               verificationMessage = e.getMessage();
               Assert.fail(verificationMessage);
               Thread.sleep(3000);
           }
       }
/*
 * Description: verify that we can see Results of games
 * 1.Click on Sport button
 * 2.click on Results
 * 3.Choose from Result List for example England football games
 * 4.Press Show button
 * Expected result: we must see result of England football games       

@Test()
public void myThirdTest() throws InterruptedException{
	  webDriver.findElement(By.xpath(CLICK_SPORT_BUTTON)).click();
      webDriver.findElement(By.xpath(RESULTS_BUTTON)).click(); 
      Thread.sleep(3000);
      webDriver.findElement(By.xpath(CLICK_ALL_FROM_RESULTS)).click();
      Thread.sleep(10000);
      Actions action1 = new Actions(webDriver);
      WebElement wc = webDriver.findElement(By.xpath(CHOOSE_ENGLAND_FROM_ALL_MENU));
      action1.moveToElement(wc).moveToElement(webDriver.findElement(By.xpath(CHOOSE_ENGLAND_FROM_ALL_MENU))).click().build().perform();
      webDriver.findElement(By.xpath(PRESS_SHOW_BUTTON_IN_RESLUTS)).click(); 	
    	   
     }
/*
 * 
@Test()
public void myFourthTest() throws InterruptedException {
	  webDriver.findElement(By.xpath(CLICK_SPORT_BUTTON)).click();
      webDriver.findElement(By.xpath(PRESS_STATISTICS)).click();
      Thread.sleep(10000);
   	  ArrayList<String> tab = new ArrayList<String> (webDriver.getWindowHandles());
   	  webDriver.switchTo().window(tab.get(1));
   	  webDriver.findElement(By.xpath(PRESS_HANDBALL_FROM_STATISTICS)).click();
   	  Thread.sleep(1000);
   	  webDriver.findElement(By.xpath(PRESS_EUROPE_FROM_HANDBALL_STATISTICS)).click();
   	  Thread.sleep(1000);
   	  webDriver.findElement(By.xpath(CHOOSE_SPAIN_FROM_EUROPE)).click();
   	  Thread.sleep(1000);
   	  webDriver.findElement(By.xpath(CHOOSE_NATIONAL_CUP_FROM_SPAIN)).click();
      Thread.sleep(10000);
   	  webDriver.close();
   	  webDriver.switchTo().window(tab.get(0));
      Thread.sleep(1000);
   	  webDriver.findElement(By.xpath(PRESS_REGULATIONS)).click();
   	  Thread.sleep(3000);
   	  ArrayList<String> tab1 = new ArrayList<String> (webDriver.getWindowHandles());
   	  webDriver.switchTo().window(tab1.get(1));
      webDriver.close();
   	  webDriver.switchTo().window(tab1.get(0));
    	  }
@Test()
public void myFifthTest() throws InterruptedException{
	  webDriver.findElement(By.xpath(CLICK_SPORT_BUTTON)).click();
      webDriver.findElement(By.xpath(LOGIN_BUTTON)).click();
      webDriver.findElement(By.xpath(INPUT_LOGIN_FIELD)).sendKeys(LOGIN);
      webDriver.findElement(By.xpath(INPUT_PASSWORD_FIELD)).sendKeys(PASSWORD);
      webDriver.findElement(By.xpath(CLICK_TO_LOGIN)).click();
      try {
        Assert.assertTrue(webDriver.findElements(By.xpath(USERNAME)) !=null);
        }catch (Error e){
    	verificationMessage = e.getMessage();
        Assert.fail(verificationMessage);
                }
      Thread.sleep(3000);
      webDriver.findElement(By.xpath(USERNAME)).click();
      Thread.sleep(1000);
      webDriver.findElement(By.xpath(PRESS_LOGOUT)).click();
      try {
        Assert.assertTrue(webDriver.findElements(By.xpath(LOGIN_BUTTON)) !=null);
        }catch (Error e){
        verificationMessage = e.getMessage();
        Assert.fail(verificationMessage);
                }
            
            }
        
@Test()
public void mySixthTest() throws InterruptedException{
	    webDriver.findElement(By.xpath(CLICK_SPORT_BUTTON)).click();
        webDriver.findElement(By.xpath(LOGIN_BUTTON)).click();
        webDriver.findElement(By.xpath(INPUT_LOGIN_FIELD)).sendKeys(LOGIN);
        webDriver.findElement(By.xpath(INPUT_PASSWORD_FIELD)).sendKeys(PASSWORD);
        webDriver.findElement(By.xpath(CLICK_TO_LOGIN)).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath(CLICK_TO_LIVETV)).click();
        Thread.sleep(5000);
        webDriver.findElement(By.xpath(OPEN_LIVETV_LIST)).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath(CHOOSE_SECOND_LIVE_MATCH)).click();
            
            
        }
        
@Test()
public void MySevenTest() throws InterruptedException{
	    webDriver.findElement(By.xpath(CLICK_SPORT_BUTTON)).click();
        Thread.sleep(3000);
        WebElement element = webDriver.findElement(By.xpath(TV_ICON)); 
        WebElement target = webDriver.findElement(By.xpath(MENU_ICON));
        Thread.sleep(3000);
        Actions Drag = new Actions(webDriver);
    	Drag.dragAndDrop(element, target).perform();
    } 
    
@Test()
public void MyEightTest() throws InterruptedException{
	    webDriver.findElement(By.xpath(CLICK_SPORT_BUTTON)).click();
        webDriver.findElement(By.xpath(CLICK_CALCULATOR)).click();
        webDriver.findElement(By.xpath(CHANGE_CALCULATOR_SYSTEM_STANDART)).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath(CHANGE_CALCULATOR_SYSTEM_STANDART)).click();
        webDriver.findElement(By.xpath(CLICK_SYSTEM_OPTION)).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(CHOOSE_FROM_OPTIONS_2_4)).click();
        webDriver.findElement(By.xpath(FIRST_INPUT_FIELD_FOR_ODD)).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        webDriver.findElement(By.xpath(FIRST_INPUT_FIELD_FOR_ODD)).sendKeys("2.25");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(SECOND_INPUT_FIELD_FOR_ODD)).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        webDriver.findElement(By.xpath(SECOND_INPUT_FIELD_FOR_ODD)).sendKeys("3.37");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(THIRD_INPUT_FIELD_FOR_ODD)).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        webDriver.findElement(By.xpath(THIRD_INPUT_FIELD_FOR_ODD)).sendKeys("4.47");
        webDriver.findElement(By.xpath(THIRD_INPUT_FIELD_FOR_ODD)).sendKeys(Keys.TAB);
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(FOURTH_INPUT_FIELD_FOR_ODD)).sendKeys("5.55");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath(UNCHECK_THIRD_FIELD)).click();
        webDriver.findElement(By.xpath(CALCULATE_BUTTON)).click();
        
        try {
            Assert.assertTrue(webDriver.findElements(By.xpath(CHECK_NUMBER_OF_OPTIONS)) !=null);
        }catch (Error e){
            verificationMessage = e.getMessage();
            Assert.fail(verificationMessage);
            }
        }

@Test()
public void MyNineTest() throws InterruptedException{
	    webDriver.findElement(By.xpath(CLICK_SPORT_BUTTON)).click();
        webDriver.findElement(By.xpath(CUT_LIVETV_FROM_SITE)).click();
        WebElement element1 = webDriver.findElement(By.xpath(LIVE_TV_WINDOW)); 
        WebElement target1 = webDriver.findElement(By.xpath(PLACE_TO_DRAG_LIVETV));
        Thread.sleep(3000);
        Actions Drag1 = new Actions(webDriver);
   	    Drag1.dragAndDrop(element1, target1).perform();
    	
       }

     
@Test()
public void MyTenthTest() throws InterruptedException{
        webDriver.findElement(By.xpath(CLICK_SPORT_BUTTON)).click();
        Thread.sleep(5000);
    	JavascriptExecutor jse = (JavascriptExecutor)webDriver;
        jse.executeScript(JS_LOGIC_FOR_PAGE_SCROLLING);
        webDriver.findElement(By.xpath(MOBILE_VERSION_BUTTON)).click();
        Thread.sleep(10000);
    	webDriver.findElement(By.xpath(MOBILE_DEVICE_LANGUAGE_SELECTOR)).click();
    	webDriver.findElement(By.xpath(SELECTED_ENGLISH_LANGUAGE_FOR_MOBILE_DEVICE)).click();  
    	
    }
    

       
      
	

       @AfterSuite()
    public void close(){
    
        webDriver.close();
		webDriver.quit();
        webDriver.manage().deleteAllCookies();

    }
*/
}





