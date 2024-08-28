package ToolsQA.qa.Testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ToolsQA.qa.Base.BaseClass;
import ToolsQA.qa.pages.ElementsTabPage;
import ToolsQA.qa.pages.HomePage;
import junit.framework.Assert;

public class ElementsTabTest extends BaseClass{
	WebDriver driver;
	HomePage homePageObj;
	ElementsTabPage ElementsTabPageObj;
	
	@BeforeMethod
	public void setUP() throws FileNotFoundException {
		//loadTestPropertiesFile();
		driver=InitializeBrowserOpenURL("Chrome");
		this.propTestData = this.loadTestPropertiesFile();
		
	}
	@Test(priority=1)
	public void verifyElementsTabIsExpandingAndCollapsing() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnElementBox();
		ElementsTabPageObj= new ElementsTabPage(driver);
		ElementsTabPageObj.clickOnExpandCollapseElementsTab();
		String actualText= "Please select an item from left to start practice.";
		String expectedText=homePageObj.checkMessagePleaseSelectAnItemFromLeftToStartPractice();
		Assert.assertEquals(expectedText,actualText);
	}	
	
	@Test(priority=2)
	public void verifyTextBoxItemIsClickable() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnElementBox();
		ElementsTabPageObj= new ElementsTabPage(driver);
		ElementsTabPageObj.clickOnTextBoxItem();
		String actualText="Text Box";
		String expectedText=ElementsTabPageObj.checkTextBoxText();
		Assert.assertEquals(expectedText, actualText);
	}
	@Test(priority=3)
	public void verifyToEnterValueInTextbox() throws InterruptedException {
		ElementsTabPageObj= new ElementsTabPage(driver);
		homePageObj= new HomePage(driver);
		homePageObj.clickOnElementBox();
		ElementsTabPageObj.clickOnTextBoxItem();
		ElementsTabPageObj.enterFullName(propTestData.getProperty("FULLNAME"));
		ElementsTabPageObj.enterEmail(propTestData.getProperty("EMAIL"));
		ElementsTabPageObj.enterCurrentAddress(propTestData.getProperty("CURRENT_ADDRESS"));
		ElementsTabPageObj.enterPermanentAddress(propTestData.getProperty("PERMANENT_ADDRESS"));
		ElementsTabPageObj.clickOnSubmitButton();
		String actualName=ElementsTabPageObj.validateNameTextMsg();
		//System.out.println("@@@@@@@@!!!!!!!!!"+actualName);
		String expectedName="Name:Ram Bhor";
		//Assert.assertEquals(actualName.contains(expectedName),"Expected output is not displayed");
		Assert.assertEquals(expectedName, actualName);
		
		String actualEmail=ElementsTabPageObj.validateEmailTextMsg();
		String expectedEmail="Email:rambhor@gmail.com";
		Assert.assertEquals(expectedEmail, actualEmail);
		
		String actualCurrentAddress=ElementsTabPageObj.validateCurrentAddressTextMsg();
		System.out.println("!!!!!!!!!!!!!!!!!!@@@@@@@"+actualCurrentAddress);
		String expectedCurrentAddress="Current Address :Mumbai, Maharashtra,India";
		Assert.assertEquals(expectedCurrentAddress, actualCurrentAddress);
		
		String actualPermanentAddress=ElementsTabPageObj.validatePermanentAddressTextMsg();
		System.out.println("!!!!!!!!!!!!!!!!!!@@@@@@@"+actualPermanentAddress);
		String expectedPermanentAddress="Permananet Address :Thane,Mumbai, Maharashtra,India";
		Assert.assertEquals(expectedPermanentAddress, actualPermanentAddress);
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
