package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationPage {
	
	WebDriver driver;
	WebElement emailField;
	WebElement passwordField;
	WebElement signInButton;
	WebElement assertSignInText;
	WebElement assertAuthentication;
	


	public AuthenticationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getEmailField() {
		return driver.findElement(By.id("email"));
	}


	public WebElement getPasswordField() {
		return driver.findElement(By.id("passwd"));
	}


	public WebElement getSignInButton() {
		return driver.findElement(By.id("SubmitLogin"));
	}
	
	public WebElement getAssertSignInText() {
		return driver.findElement(By.className("alert-danger"));
	}
	
	public WebElement getAssertAuthentication() {
		return driver.findElement(By.className("page-heading"));
	}


	public void inputEmailField(String username) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(username);
	}
	public void inputPasswordField(String password) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
	}
	public void clickSignInButton() {
		this.getSignInButton().click();
	}

}
