package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class YourAddressesPage {
	
	WebDriver driver;
	WebElement addressField;
	WebElement cityField;
	WebElement stateField;
	WebElement zipCodeField;
	WebElement mobilePhoneField;
	WebElement saveButton;
	WebElement addressTitleField;
	
	
	
	public YourAddressesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getAddressField() {
		return driver.findElement(By.id("address1"));
	}
	
	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitAddress"));
	}
	

	public WebElement getCityField() {
		return driver.findElement(By.id("city"));
	}

	public WebElement getStateField() {
		return driver.findElement(By.id("id_state"));
	}
	
	public WebElement getZipCodeField() {
		return driver.findElement(By.id("postcode"));
	}

	public WebElement getMobilePhoneField() {
		return driver.findElement(By.id("phone_mobile"));
	}
	
	public WebElement getAddressTitleField() {
		return driver.findElement(By.id("alias"));
	}

	public void inputAddressField(String address) {
		this.getAddressField().clear();
		this.getAddressField().sendKeys(address);
	}
	public void clickSaveButton() {
		this.getSaveButton().click();
	}
	public void inputCityField(String city) {
		this.getCityField().clear();
		this.getCityField().sendKeys(city);
	}
	public void selectState(String state) {
	    stateField = getStateField();
		stateField.click();
		Select dropdown= new Select(stateField);
		dropdown.selectByVisibleText(state);
	}
	public void inputZipCodeField(String zipCode) {
		this.getZipCodeField().sendKeys(zipCode);
	}
	public void inputMobilePhoneField(String mobilePhone) {
		this.getMobilePhoneField().sendKeys(mobilePhone);
	}
	public void inputAddressTitleField(String addressTitle) {
		this.getAddressTitleField().clear();
		this.getAddressTitleField().sendKeys(addressTitle);
	}
	
	
}
