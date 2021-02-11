package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourPersonalInformationPage {

	WebDriver driver;
	WebElement firstNameField;
	WebElement currentPasswordField;
	WebElement saveButton;
	WebElement assertSuccessfullUpdate;

	public YourPersonalInformationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getFirstNameField() {
		return driver.findElement(By.id("firstname"));
	}
	
	public WebElement getCurrentPasswordField() {
		return driver.findElement(By.id("old_passwd"));
	}
	

	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button"));
	}
	

	public WebElement getAssertSuccessfullUpdate() {
		return driver.findElement(By.className("alert-success"));
	}

	public void updateFirstNameField(String firstName) {
		this.getFirstNameField().clear();
		this.getFirstNameField().sendKeys(firstName);
	}
	public void inputPasswordField(String password) {
		this.getCurrentPasswordField().sendKeys(password);
	}
	public void clickSaveButton() {
		this.getSaveButton().click();
	}
}
