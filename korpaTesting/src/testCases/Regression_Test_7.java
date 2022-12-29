package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.korpaMainPage;
import pages.LoginPage;
import pages.ProfilePage;

public class Regression_Test_7 {

    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
		
		mainToPrijaviSe();
		loginInputForm();
		clickingLoginButton();
		clickProfileButton();
		switchingLanguage();

	}
	
	public static void mainToPrijaviSe()
	{
		driver.get("https://korpa.ba/");
		korpaMainPage.Prijavi_se_Button(driver).click();
	}
	
	public static void loginInputForm()
	{
		LoginPage.emailInputField(driver).sendKeys("testtestic512@gmail.com");
		LoginPage.passwordInputField(driver).sendKeys("testtestic123$");
	}
	
	public static void clickingLoginButton()
	{
		LoginPage.loginButton(driver).click();
	}
	public static void clickProfileButton()
	{
		korpaMainPage.profile(driver).click();
	}
	public static void switchingLanguage()
	{
		ProfilePage.languageButton(driver).click();
		ProfilePage.switchToEnglishButton(driver).click();
	}
}
