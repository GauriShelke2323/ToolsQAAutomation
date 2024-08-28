package ToolsQA.qa.Testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ToolsQA.qa.Base.BaseClass;
import ToolsQA.qa.pages.FormsTabPage;
import ToolsQA.qa.pages.HomePage;
import junit.framework.Assert;

public class FormsTabTest extends BaseClass {
	WebDriver driver;
	HomePage homePageObj; 
	FormsTabPage FormsTabPageObj;
	
	@BeforeMethod
	public void setUP() throws FileNotFoundException {
		//loadTestPropertiesFile();
		this.propTestData = this.loadTestPropertiesFile();
		this.configTestData= this.loadConfigPropertiesFile();
		driver=InitializeBrowserOpenURL("Chrome");
	}
	
	@Test(priority=1)
	public void verifyFormsBoxIsClickable() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnformsBox();
		FormsTabPageObj = new FormsTabPage(driver);
		FormsTabPageObj.clickOnPracticeForm();
		String actualHeading=FormsTabPageObj.checkPracticeFormHeading();
		String expectedHeading="Practice Form";
		Assert.assertEquals(expectedHeading, actualHeading);
	}
	@Test(priority=2)
	public void verifyToRegisterStudent() throws InterruptedException {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnformsBox();
		FormsTabPageObj = new FormsTabPage(driver);
		FormsTabPageObj.clickOnPracticeForm();
		FormsTabPageObj.enterTextInFirstName(propTestData.getProperty("FIRSTNAME"));
		FormsTabPageObj.enterTextInLastName(propTestData.getProperty("LASTNAME"));
		FormsTabPageObj.enterTextInUserEmail(propTestData.getProperty("EMAIL"));
		FormsTabPageObj.selectGenderMale();
		FormsTabPageObj.selectGenderOther();
		FormsTabPageObj.selectGenderFemale();
		FormsTabPageObj.enterMobileNumber(propTestData.getProperty("MOBILE"));
		FormsTabPageObj.selectDate();
		selectRandomdateFromDatePicker();
		FormsTabPageObj.selectSubject(propTestData.getProperty("SUBJECTSENGLISH"));
		FormsTabPageObj.selectSubjectComputerScience(propTestData.getProperty("SUBJECTCOMPSCI"));
		FormsTabPageObj.selectSubjectCommerce(propTestData.getProperty("SUBJECTCOMMERCE"));
		FormsTabPageObj.selectHobbySports();
		FormsTabPageObj.selectHobbyReading();
		FormsTabPageObj.selectHobbyMusic();
		FormsTabPageObj.selectPictureToUpload();
		FormsTabPageObj.enterCurrentAddress(propTestData.getProperty("CURRENT_ADDRESS"));
		FormsTabPageObj.selectStateFromDropdown();
		FormsTabPageObj.selectCityFromDropdown();
		FormsTabPageObj.clickOnSubmit();	
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
