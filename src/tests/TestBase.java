package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AuthenticationPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.MyAddressesPage;
import pages.MyWishlistsPage;
import pages.YourAddressesPage;
import pages.YourPersonalInformationPage;

public class TestBase {
	
	WebDriver driver;
	ExcelReader excelReader;
	
	//pages
	MainPage mainPage;
	AuthenticationPage authenticationPage;
	MyAccountPage myAccountPage;
	MyAddressesPage myAddressesPage;
	YourAddressesPage yourAddressesPage;
	YourPersonalInformationPage yourPersonalInformationPage;
	MyWishlistsPage myWishlistsPage;
	
	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.mainPage = new MainPage(driver);
		this.excelReader = new ExcelReader("data/testplan.xlsx");
		this.authenticationPage = new AuthenticationPage(driver);
		this.myAccountPage = new MyAccountPage(driver);
		this.myAddressesPage = new MyAddressesPage(driver);
		this.yourAddressesPage = new YourAddressesPage(driver);
		this.yourPersonalInformationPage = new YourPersonalInformationPage(driver);
		this.myWishlistsPage = new MyWishlistsPage(driver);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void pposleKlase() throws IOException {
		driver.close();
	}
	public void logInTests(String username, String password) throws InterruptedException {
		mainPage.clickSignInButton();
		Thread.sleep(2000);
		authenticationPage.inputEmailField(username);
		authenticationPage.inputPasswordField(password);
		authenticationPage.clickSignInButton();
		Thread.sleep(2000);
	}
	
}