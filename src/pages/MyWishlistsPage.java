package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishlistsPage {

	WebDriver driver;
	WebElement wishlistNameField;
	WebElement saveButton;
	WebElement assertWishlist;
	WebElement assertWishlist1;
	WebElement deleteWishlist;
	WebElement assertWishlistIsDeleted;
	
	public MyWishlistsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getWishlistNameField() {
		return driver.findElement(By.id("name"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitWishlist"));
	}
	
	public WebElement getAssertWishlist() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_28392\"]/td[1]/a"));
	}
	
	public WebElement getAssertWishlist1() {
		return driver.findElement(By.id("wishlist_28690"));
	}
	

	public WebElement getDeleteWishlist() {
		return driver.findElement(By.xpath("//div[@id='block-history']/table[@class='table table-bordered']/tbody/tr[2]//i[@class='icon-remove']"));
	}

	public void inputWishlistNameField(String wishlistName) {
		this.getWishlistNameField().sendKeys(wishlistName);
	}
	public void clickSaveButton() {
		this.getSaveButton().click();
	}
	public void clickDeleteWishlist() {
		this.getDeleteWishlist().click();
	}
	public void assertWishlistIsDeleted() {
		try{
			 driver.findElements(By.id("wishlist_28695"));
			 System.out.println("Wishlist is deleted");
			}
			catch(NoSuchElementException e){
			 System.out.println("Wishlist is not deleted");
			}

	}
	public void acceptChromePopUp() {
		driver.switchTo().alert().accept();
	}
}
