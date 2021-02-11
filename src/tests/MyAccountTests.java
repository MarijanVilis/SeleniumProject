package tests;

import org.apache.batik.util.gui.DropDownComponent;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MyAddressesPage;

public class MyAccountTests extends TestBase{
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(2000);
	}
//	@Test (priority = 0)
//	public void updateAddressTest() throws InterruptedException {
//		String username = excelReader.getData("MyAccount Tests", 5, 5);
//		String password = excelReader.getData("MyAccount Tests", 5, 6);
//		String address = excelReader.getData("MyAccount Tests", 5, 10);
//		String assertAddress = excelReader.getData("MyAccount Tests", 5, 12);
//		
//		logInTests(username, password);
//		myAccountPage.clickMyAddressesButton();
//		Thread.sleep(2000);
//		myAddressesPage.clickUpdateButton();
//		yourAddressesPage.inputAddressField(address);
//		yourAddressesPage.clickSaveButton();
//		
//		String textForAssert = myAddressesPage.getAssertAddressChange().getText();
//		Assert.assertEquals(textForAssert, assertAddress);
//		
//	}
//	@Test (priority = 5)
//	public void addAddressTest() throws InterruptedException {
//		String username = excelReader.getData("MyAccount Tests", 5, 19);
//		String password = excelReader.getData("MyAccount Tests", 5, 20);
//		String address = excelReader.getData("MyAccount Tests", 5, 24);
//		String city = excelReader.getData("MyAccount Tests", 5, 25);
//		String state = excelReader.getData("MyAccount Tests", 5, 26);
//		String zipCode = excelReader.getData("MyAccount Tests", 5, 27);
//		String mobilePhone = excelReader.getData("MyAccount Tests", 5, 29);
//		String addressTitle = excelReader.getData("MyAccount Tests", 5, 30);
//		String assertNewAddress = excelReader.getData("MyAccount Tests", 5, 32);
//		
//		logInTests(username, password);
//		myAccountPage.clickMyAddressesButton();
//		Thread.sleep(2000);
//		myAddressesPage.clickAddNewAddressButton();
//		Thread.sleep(2000);
//		yourAddressesPage.inputAddressField(address);
//		yourAddressesPage.inputCityField(city);
//		yourAddressesPage.selectState(state);
//		yourAddressesPage.inputZipCodeField(zipCode);
//		yourAddressesPage.inputMobilePhoneField(mobilePhone);
//		yourAddressesPage.inputAddressTitleField(addressTitle);
//		yourAddressesPage.clickSaveButton();
//		Thread.sleep(2000);
//		
//		String textForAssert = myAddressesPage.getAssertNewAddress().getText();
//		Assert.assertEquals(textForAssert, assertNewAddress);
//		
//	}
//	@Test (priority = 10)
//	public void deleteAddedAddress() throws InterruptedException {
//		String username = excelReader.getData("MyAccount Tests", 5, 39);
//		String password = excelReader.getData("MyAccount Tests", 5, 40);
//		String deleted = excelReader.getData("MyAccount Tests", 5, 45);
//		
//		logInTests(username, password);
//		myAccountPage.clickMyAddressesButton();
//		Thread.sleep(2000);
//		myAddressesPage.deleteNewAddressButton();
//		Thread.sleep(2000);
//		myAddressesPage.acceptChromePopUpWindow();
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		myAddressesPage.assertAddressIsDeleted(deleted);
//		
//	}
	
//	@Test (priority = 20)
//	public void updatePersonalInformation() throws InterruptedException {
//		String username = excelReader.getData("MyAccount Tests", 5, 52);
//		String password = excelReader.getData("MyAccount Tests", 5, 53);
//		String firstNameUpdate = excelReader.getData("MyAccount Tests", 5, 56);
//		String assertSuccesfulUpdate = excelReader.getData("MyAccount Tests", 5, 59);
//		
//		logInTests(username, password);
//		myAccountPage.clickMyPersonalInformationButton();
//		yourPersonalInformationPage.updateFirstNameField(firstNameUpdate);
//		yourPersonalInformationPage.inputPasswordField(password);
//		yourPersonalInformationPage.clickSaveButton();
//		Thread.sleep(2000);
//		
//		String textForAssert = yourPersonalInformationPage.getAssertSuccessfullUpdate().getText();
//		Assert.assertEquals(textForAssert, assertSuccesfulUpdate);
//		
//		//change the updated name back to original
//		driver.manage().deleteAllCookies();
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		logInTests(username, password);
//		myAccountPage.clickMyPersonalInformationButton();
//		yourPersonalInformationPage.updateFirstNameField("Marijan");
//		yourPersonalInformationPage.inputPasswordField(password);
//		yourPersonalInformationPage.clickSaveButton();
//		Thread.sleep(2000);
//		
//	}
//	@Test (priority = 25)
//	public void addWishilist() throws InterruptedException {
//		String username = excelReader.getData("MyAccount Tests", 5, 66);
//		String password = excelReader.getData("MyAccount Tests", 5, 67);
//		String wishlistName = excelReader.getData("MyAccount Tests", 5, 70);
//		String assertWishlist = excelReader.getData("MyAccount Tests", 5, 72);
//		
//		logInTests(username, password);
//		myAccountPage.clickMyWishlistsButton();
//		myWishlistsPage.inputWishlistNameField(wishlistName);
//		myWishlistsPage.clickSaveButton();
//		Thread.sleep(2000);
//		
//		String textForAssert = myWishlistsPage.getAssertWishlist().getText();
//		Assert.assertEquals(textForAssert, assertWishlist);	
//		
//		
//	}
	@Test (priority = 30)
	public void addMultipleWishilist() throws InterruptedException {
		String username = excelReader.getData("MyAccount Tests", 5, 66);
		String password = excelReader.getData("MyAccount Tests", 5, 67);
		String wishlistName1 = excelReader.getData("MyAccount Tests", 5, 85);
		
		logInTests(username, password);
		myAccountPage.clickMyWishlistsButton();
		myWishlistsPage.inputWishlistNameField(wishlistName1);
		myWishlistsPage.clickSaveButton();
		Thread.sleep(2000);
		
		String textForAssert = myWishlistsPage.getAssertWishlist1().getText();
		Assert.assertEquals(textForAssert, wishlistName1);
		
	}
	@Test (priority = 30)
	public void deleteWishlist() throws InterruptedException {
		String username = excelReader.getData("MyAccount Tests", 5, 94);
		String password = excelReader.getData("MyAccount Tests", 5, 95);
		
		logInTests(username, password);
		myAccountPage.clickMyWishlistsButton();
		myWishlistsPage.clickDeleteWishlist();
		Thread.sleep(2000);
		myWishlistsPage.assertWishlistIsDeleted(deleted);
		
	}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

}
