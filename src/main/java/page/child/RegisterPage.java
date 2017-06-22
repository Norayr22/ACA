package page.child;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;
	@FindBy(xpath = Constants.REGISTER_BUTTON)
	private WebElement register_button;
	@FindBy(xpath = Constants.REGISTER_USER_NAME)
	private WebElement user_name;
	@FindBy(xpath = Constants.REGISTER_FIRST_NAME)
	private WebElement first_name;
	@FindBy(xpath = Constants.SELECT_COUNTRY)
	private WebElement select_country;
	@FindBy(xpath = Constants.ENTER_EMAIL)
	private WebElement enter_email;
	@FindBy(xpath = Constants.REGISTER_LAST_NAME)
	private WebElement last_name;
	@FindBy(xpath = Constants.SELECT_CITY)
	private WebElement select_city;
	@FindBy(xpath = Constants.CHOOSE_DATE)
	private WebElement choose_date;
	@FindBy(xpath = Constants.CHOOSE_MONTH)
	private WebElement choose_month;
	@FindBy(xpath = Constants.CHOOSE_YEAR)
	private WebElement choose_year;
	@FindBy(xpath = Constants.ENTER_PASSWORD)
	private WebElement enter_password;
	@FindBy(xpath = Constants.CONFIRM_PASSWORD)
	private WebElement confirm_password;
	@FindBy(xpath = Constants.ENTER_ADRESS)
	private WebElement enter_adress;
	@FindBy(xpath = Constants.MOBILE_NUMBER)
	private WebElement mobile_number;
	@FindBy(xpath = Constants.ENTER_PASPORT)
	private WebElement enter_pasport;
	@FindBy(xpath = Constants.CAPTCHA)
	private WebElement capthca;
	@FindBy(xpath = Constants.AGREE_CHECK)
	private WebElement agree_check;
	@FindBy(xpath = Constants.REGISTER)
	private WebElement register;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickToRegister() throws InterruptedException {
		this.register_button.click();
		String username[] = { "hakob00221", "arthur88774", "gegham55998", "ando118874", "levongharib" };
		this.user_name.sendKeys(username[new Random().nextInt(username.length)]);
		String name[] = { "Hakob", "Arthur", "Gegham", "Andranik", "Levon" };
		this.first_name.sendKeys(name[new Random().nextInt(name.length)]);
		this.select_country.click();
		driver.findElement(By.xpath("(//li[@rel='257'])[2]")).click();
		this.select_city.click();
		String num[] = { "Agarak", "Abovyan", "Alaverdi", "Aparan" };
		Random rel = new Random();
		String x = num[rel.nextInt(num.length)];
		driver.findElement(By.xpath("//li[text()='" + x + "']")).click();
		this.choose_date.click();
		Random date = new Random();
		int y = date.nextInt(8);
		if (y == 0)
			y++;
		driver.findElement(By.xpath("//div[@id = 'mCSB_1_container']//li[@rel='" + y + "']")).click();
		this.choose_month.click();
		Random month = new Random();
		int z = month.nextInt(7);
		if (z == 0)
			z++;
		driver.findElement(By.xpath("//div[@id = 'mCSB_2']//li[@rel='" + z + "']")).click();
		this.choose_year.click();
		int year[] = { 1993, 1994, 1995, 1996 };
		Random choose = new Random();
		int c = year[choose.nextInt(year.length)];
		driver.findElement(By.xpath("//div[@id = 'mCSB_3']//li[@rel='" + c + "']")).click();
		String email[] = { "hokob1954@mail.ru", "andranik14@gmail.com", "gegham221704@gmail.com",
				"lenggharibyan@mail.ru", "arthur_1980@mail.ru" };
		this.enter_email.sendKeys(email[new Random().nextInt(email.length)]);
		String pass[] = { "hakob1954", "Andranik140", "levonik770088", "arthuRRuhta12", "GeGhAm19910" };
		String password = pass[new Random().nextInt(pass.length)];
		this.enter_password.sendKeys(password);
		this.confirm_password.sendKeys(password);
		String lastName[] = { "Barseghyan", "Antonyan", "Goharyan", "Vardanyan", "Soghomonyan" };
		this.last_name.sendKeys(lastName[new Random().nextInt(lastName.length)]);
		String adress[] = { "G.Njdehi 16 ", "Davin ANhaxti 14", "Isahakyan 25", "Tumanyan 1", "N.Zaryan 88" };
		this.enter_adress.sendKeys(adress[new Random().nextInt(adress.length)]);
		String mobile[] = { "94156587", "93785651", "91205568", "93533739", "91414515" };
		this.mobile_number.sendKeys(mobile[new Random().nextInt(mobile.length)]);
		String id[] = { "AH068041", "AH098455", "AH0871212", "AH085885", "AH032284" };
		this.enter_pasport.sendKeys(id[new Random().nextInt(id.length)]);
		this.capthca.click();
		Thread.sleep(10000);
		this.agree_check.click();
		this.register.click();
	}

}
