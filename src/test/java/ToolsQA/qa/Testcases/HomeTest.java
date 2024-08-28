package ToolsQA.qa.Testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ToolsQA.qa.Base.BaseClass;
import ToolsQA.qa.pages.HomePage;
import junit.framework.Assert;

public class HomeTest extends BaseClass{
	
	WebDriver driver;
	HomePage homePageObj;
	
	@BeforeMethod
	public void setUP() throws FileNotFoundException {
		this.propTestData = this.loadTestPropertiesFile();
		this.configTestData= this.loadConfigPropertiesFile();
		driver=InitializeBrowserOpenURL("Chrome");
	}
	@Test(priority=1)
	public void verifyElementsBoxIsClikable() throws InterruptedException {
	
		homePageObj= new HomePage(driver);
		homePageObj.clickOnElementBox();
		String expectedText= "Please select an item from left to start practice.";
		String actualText=homePageObj.checkMessagePleaseSelectAnItemFromLeftToStartPractice();
		Assert.assertEquals(expectedText,actualText);
		
	}	
	
	@Test(priority=2)
	public void verifyformsBoxIsClickable() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnformsBox();
		String expectedText= "Please select an item from left to start practice.";
		String actualText=homePageObj.checkMessagePleaseSelectAnItemFromLeftToStartPractice();
		Assert.assertEquals(expectedText,actualText);
	}
	
	@Test(priority=3)
	public void verifyalertsFramesWindowsBoxIsClickable() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		String expectedText= "Please select an item from left to start practice.";
		String actualText=homePageObj.checkMessagePleaseSelectAnItemFromLeftToStartPractice();
		Assert.assertEquals(expectedText,actualText);
	}
	
	@Test(priority=4)
	public void verifyWidgetsBoxIsClickable() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		String expectedText= "Please select an item from left to start practice.";
		String actualText=homePageObj.checkMessagePleaseSelectAnItemFromLeftToStartPractice();
		Assert.assertEquals(expectedText,actualText);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
