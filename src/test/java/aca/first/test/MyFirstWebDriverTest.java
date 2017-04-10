package aca.first.test;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
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
       try {
            Assert.assertTrue(webDriver.findElements(By.xpath("//*[@id='login_panel']/div[1]/label/div")) !=null);
        }catch (Error e){
            verificationMessage = e.getMessage();
            Assert.fail(verificationMessage);
        }  
        Thread.sleep(3000);
        Actions action = new Actions(webDriver);
        WebElement we = webDriver.findElement(By.xpath("//div[@class='sportHeaderLang secClr']"));
        action.moveToElement(we).moveToElement(webDriver.findElement(By.xpath("//div[@class='sportHeaderLang secClr']"))).click().build().perform();
       Thread.sleep(1000);
        WebElement wr = webDriver.findElement(By.xpath("//div[@class='dropdown-content']//div[@class='lang en']"));
        action.moveToElement(wr).moveToElement(webDriver.findElement(By.xpath("//div[@class='dropdown-content']//div[@class='lang en']"))).click().build().perform();
        
        Thread.sleep(3000);
      
          
        try {                        
            Assert.assertTrue( webDriver.findElements(By.xpath("//a[@class='flex dropdown-menu']//img[@src='/img/flags/en.png']"))!=null);}
            catch (Error e){
                verificationMessage = e.getMessage();
                Assert.fail(verificationMessage);
            }
        }

    

   @AfterSuite()
    public void close(){
        webDriver.close();
		webDriver.quit();

    }

}






