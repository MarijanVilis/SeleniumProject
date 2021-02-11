package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class MyAddressesPage {
	
	WebDriver driver;
	WebElement updateButton;
	WebElement assertAddressChange;
	WebElement addNewAddressButton;
	WebElement assertNewAddress;
	WebElement deleteAddressButton;
	WebElement assertIfAddressIsDeleted;
	
	
	public MyAddressesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getUpdateButton() {
		return driver.findElement(By.xpath("//a[@title='Update']"));
	}
	
	
	public WebElement getAssertAddressChange() {
		return driver.findElement(By.className("address_address1"));
	}
	

	public WebElement getAddNewAddressButton() {
		return driver.findElement(By.xpath("//a[@title='Add an address']"));
	}
	
	public WebElement getAssertNewAddress() {
		return driver.findElement(By.xpath("/html//div[@id='center_column']//div[@class='bloc_adresses row']/div[2]/ul/li[2]/span[1]"));
	}
	

	public WebElement getDeleteAddressButton() { 
		return driver.findElement(By.xpath("/html//div[@id='center_column']//div[@class='bloc_adresses row']/div[2]/ul//a[@title='Delete']/span"));
	}

	public void clickUpdateButton() {
		this.getUpdateButton().click();
	}
	public void clickAddNewAddressButton() {
		this.getAddNewAddressButton().click();
	}
	public void deleteNewAddressButton() {
		this.getDeleteAddressButton().click();
	}
	public void acceptChromePopUpWindow() {
		driver.switchTo().alert().accept();
	}
	public void assertAddressIsDeleted(String deleted) {
		try{
			 driver.findElements(By.className("page-subheading"));
			 System.out.println("Address is deleted");
			}
			catch(NoSuchElementException e){
			 System.out.println("Address is not deleted");
			}

	}
	
}

