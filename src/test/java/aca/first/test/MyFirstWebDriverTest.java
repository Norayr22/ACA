package aca.first.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyFirstWebDriverTest {
    private final String WEB_DRIVE_TYPE = "webdriver.chrome.driver";
    private final String WEB_DRIVER_EXE_PATH = "C:\\Users\\USER\\Downloads\\chromedriver_win32\\Chromedriver.exe";
    private final String URL = "http://totobet.am";
    private WebDriver webDriver;
    private String xpath = "//a[@class='tl_register_button']";
    private String xpath1 = "//a[@href='https://sport.totogaming.am/SportsBook/Home?l=ru&d=d']";
    private String verificationMessage;

    @Before
    public void setUp() {
        System.setProperty(WEB_DRIVE_TYPE, WEB_DRIVER_EXE_PATH);
        webDriver = new ChromeDriver();
        verificationMessage="";
    }

    @Test
    public void myFirstTest() {
        webDriver.get(URL);
        try {
            Assert.assertTrue(webDriver.findElements(By.xpath(xpath)).size() != 0);
        }catch (Error e){
            verificationMessage = e.getMessage();
            Assert.fail(verificationMessage);
        }
        try {
            Assert.assertTrue( webDriver.findElements(By.xpath(xpath1)).size() !=0);}
            catch (Error e){
                verificationMessage = e.getMessage();
                Assert.fail(verificationMessage);
            }
        }

    

    @After
    public void close(){
        webDriver.close();
		webDriver.quit();

    }


}

