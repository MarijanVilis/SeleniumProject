package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends TestBase{

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(2000);
	}
	
	@Test (priority = 0)
	public void logIn() throws InterruptedException {
		String username = excelReader.getData("LogInTests", 5, 5);
		String password = excelReader.getData("LogInTests", 5, 6);
		String assertSignIn = excelReader.getData("LogInTests", 5, 8);
		
		logInTests(username, password);
		
		String textForAssert = myAccountPage.getAssertSignInText().getText();
		Assert.assertEquals(textForAssert, assertSignIn);
		
	}
	@Test (priority = 5)
	public void logInWithInvalidEmail() throws InterruptedException {
		String username = excelReader.getData("LogInTests", 5, 16);
		String password = excelReader.getData("LogInTests", 5, 17);
		String assertSignInError = excelReader.getData("LogInTests", 5, 19);
		
		logInTests(username, password);
		
		String textForAssert = authenticationPage.getAssertSignInText().getText();
		Assert.assertEquals(textForAssert,assertSignInError);	
	}
	@Test (priority = 10)
	public void logInWithInvalidPassword() throws InterruptedException {
		String username = excelReader.getData("LogInTests", 5, 26);
		String password = excelReader.getData("LogInTests", 5, 27);
		String assertSignInError = excelReader.getData("LogInTests", 5, 19);
		
		logInTests(username, password);
		
		String textForAssert = authenticationPage.getAssertSignInText().getText();
		Assert.assertEquals(textForAssert,assertSignInError);
	}
	@Test (priority = 15)
	public void logInEmptyEmailValidPassword() throws InterruptedException {
		String username = excelReader.getData("LogInTests", 5, 37);
		String password = excelReader.getData("LogInTests", 5, 38);
		String assertSignInError = excelReader.getData("LogInTests", 5, 40);
		
		logInTests(username, password);
		
		String textForAssert = authenticationPage.getAssertSignInText().getText();
		Assert.assertEquals(textForAssert,assertSignInError);
	}
	@Test (priority = 20)
	public void logInValidEmailEmptyPassword() throws InterruptedException {
		String username = excelReader.getData("LogInTests", 5, 47);
		String password = excelReader.getData("LogInTests", 5, 48);
		String assertSignInError = excelReader.getData("LogInTests", 5, 50);
		
		logInTests(username, password);
		
		String textForAssert = authenticationPage.getAssertSignInText().getText();
		Assert.assertEquals(textForAssert,assertSignInError);
	}
	@Test (priority = 25)
	public void logInNoCredentials() throws InterruptedException {
		String username = excelReader.getData("LogInTests", 5, 57);
		String password = excelReader.getData("LogInTests", 5, 58);
		String assertSignInError = excelReader.getData("LogInTests", 5, 60);
		
		logInTests(username, password);
		
		String textForAssert = authenticationPage.getAssertSignInText().getText();
		Assert.assertEquals(textForAssert,assertSignInError);
	}
	@Test (priority = 30)
	public void logOut() throws InterruptedException {
		String assertAuthentication = excelReader.getData("LogInTests", 5, 72);
		logIn();
		myAccountPage.clickSignOutButton();
		
		String textForAssert = authenticationPage.getAssertAuthentication().getText();
		Assert.assertEquals(textForAssert, assertAuthentication);
	}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	
}
