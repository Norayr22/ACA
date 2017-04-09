package aca.first.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class MyFirstWebDriverTest {
    private final String WEB_DRIVE_TYPE = "webdriver.chrome.driver";
    private final String WEB_DRIVER_EXE_PATH = "C:\\Users\\USER\\Downloads\\chromedriver_win32\\Chromedriver.exe";
    private final String URL = "http://totobet.am";
    private WebDriver webDriver;
    private String xpath = "//a[@class='tl_register_button']";
    private String xpath1 = "//a[@href='https://sport.totogaming.am/SportsBook/Home?l=ru&d=d']";
    private String verificationMessage;

    @BeforeSuite()
    public void setUp() {
        System.setProperty(WEB_DRIVE_TYPE, WEB_DRIVER_EXE_PATH);
        webDriver = new ChromeDriver();
        verificationMessage="";
    }
/* Description: Verify if it is possible to place a bet (pre-match)
Precondition: Will be a registered user.
1. Open any browser,
2. Go to https://totogaming.am,
3. Go to Sport,
4. Press the Login button,
5. In the opened window enter valid login and password,
6. Press login,
7. Choose any kind of sport, country, tournament, event,
8. From the choosen event press on any coeficient,
9. Enter the amount or the bet (>=50 AMD),
10. Press "Place Bet",
Expected result: The message "Bet placed. Good Luck!" will appear and the balance will be less of the amount of the bet and the bet history will be apdated by that bet.
The same is acctual also for In-Play bets. Only 3 point will be "Go to In-Play".
 * 
 */
    @Test()
    public void myFirstTest() throws InterruptedException {
        webDriver.get(URL);
        webDriver.findElement(By.xpath("//a[@href='https://sport.totogaming.am/SportsBook/Home?l=ru&d=d']")).click();
//        Thread.sleep(10000L);
          webDriver.findElement(By.xpath("//a[@class='btnLoginHeader secBtn transAll']")).click();
          webDriver.findElement(By.xpath("//input[@id='login']")).sendKeys("totobasket");
          webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("toto1");
          webDriver.findElement(By.xpath("//*[@id='login_dialogue']/input")).click();
//       try {
//            Assert.assertTrue(webDriver.findElements(By.xpath("//*[@id='login_panel']/div[1]/label/div")) != null);
//        }catch (Error e){
//            verificationMessage = e.getMessage();
//            Assert.fail(verificationMessage);
//        }  
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector(".dropdown-content a[href*='?l=fr']")).click();

//       webDriver.findElement(By.className("div.selected.displayFlex span.arrow")).click();
//       webDriver.findElement(By.className("div.selected.displayFlex.lang.en")).click();
//           webDriver.findElement(By.cssSelector("div.selected.displayFlex span.arrow")).click();
//           webDriver.findElement(By.className(".singleLang.displayFlex")).click();
//           webDriver.findElement(By.cssSelector("div.lang.en")).click();
//           
          
       /* try {                        
            Assert.assertTrue( webDriver.findElements(By.xpath(xpath1)).size() !=0);}
            catch (Error e){
                verificationMessage = e.getMessage();
                Assert.fail(verificationMessage);
            }
        }

    

 /*   @After
    public void close(){
        webDriver.close();
		webDriver.quit();
*/
    }

	




}

