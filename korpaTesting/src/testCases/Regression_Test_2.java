package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.korpaMainPage;
import pages.RegistrationPage;

public class Regression_Test_2 {
    
    static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		
		
		
		fromMainToPrijaviSePage();
        clickingRegistrateButton();
        inputingRegistrationForm();
        clickingRegistrateButton2();
		
		
	}
	
	
	public  static void fromMainToPrijaviSePage()
	{

		driver.get("https://korpa.ba/");
		korpaMainPage.Prijavi_se_Button(driver).click();
	}

    public static void clickingRegistrateButton()
	{
		korpaMainPage.Registruj_se_Button(driver).click();
	}
	
    public static void inputingRegistrationForm()
	{
		
		RegistrationPage.imeInputField(driver).sendKeys("Nodi");
		RegistrationPage.emailInputField(driver).sendKeys("123test.com");
		RegistrationPage.phoneNumInputField(driver).sendKeys("0623455678");
		RegistrationPage.passwordInputField(driver).sendKeys("testing1234");
	}
	
    public static void clickingRegistrateButton2()
	{
		RegistrationPage.registrateButton2(driver).click();
	}
}
