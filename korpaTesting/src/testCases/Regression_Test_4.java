package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.korpaMainPage;
import pages.RegistrationPage;

public class Regression_Test_4 {
    
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
		RegistrationPage.emailInputField(driver).sendKeys("test123test@gmail.com");
		RegistrationPage.phoneNumInputField(driver).sendKeys("06234578");
		RegistrationPage.passwordInputField(driver).sendKeys("1");
	}
	
    public static void clickingRegistrateButton2()
	{
		RegistrationPage.registrateButton2(driver).click();
	}

}
