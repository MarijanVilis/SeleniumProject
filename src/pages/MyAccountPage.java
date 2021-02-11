package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	
	WebDriver driver;
	WebElement assertSignInText;
	WebElement signOutButton;
	WebElement myAddressesButton;
	WebElement myPersonalInformatioButton;
	WebElement myWishlistsButton;
	
	public MyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getAssertSignInText() {
		return driver.findElement(By.className("info-account"));
	}

	public WebElement getSignOutButton() {
		return driver.findElement(By.className("logout"));
	}
		
	public WebElement getMyAddressesButton() {
		return driver.findElement(By.className("icon-building"));
	}
	

	public WebElement getMyPersonalInformatioButton() {
		return driver.findElement(By.xpath("//a[@title='Information']"));  
	}
	

	public WebElement getMyWishlistsButton() {
		return driver.findElement(By.className("icon-heart"));
	}

	public void clickSignOutButton() {
		this.getSignOutButton().click();
	}
	public void clickMyAddressesButton() {
		this.getMyAddressesButton().click();	
	}
	public void clickMyPersonalInformationButton() {
		this.getMyPersonalInformatioButton().click();
	}
	public void clickMyWishlistsButton() {
		this.getMyWishlistsButton().click();
	}
}
