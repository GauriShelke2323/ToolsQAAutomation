package ToolsQA.qa.Testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ToolsQA.qa.Base.BaseClass;
import ToolsQA.qa.pages.AlertsFramesWindowsPage;
import ToolsQA.qa.pages.HomePage;
import junit.framework.Assert;

public class AlertsFramesWindowsTest extends BaseClass {
	WebDriver driver;
	HomePage homePageObj;
	AlertsFramesWindowsPage alertsObj;

	@BeforeMethod
	public void setUp() throws FileNotFoundException {
		this.propTestData = this.loadTestPropertiesFile();
		this.configTestData= this.loadConfigPropertiesFile();
		driver=InitializeBrowserOpenURL("Chrome");
	}
	
	
	@Test(priority=1)
	public void verifyBrowserWindowsTabIsClickable() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnBrowserWindowsTab();
	}
	
	@Test(priority=2)
	public void verifyNewTabIsOpening() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnBrowserWindowsTab();
		alertsObj.clickOnNewTab();
		String expectedMsg="This is a sample page";
		String actualMsg=alertsObj.checkNewTabMessage();
		Assert.assertEquals(expectedMsg, actualMsg);
	}
	
	@Test(priority=3)
	public void verifyNewWindowIsOpening() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnBrowserWindowsTab();
		alertsObj.ClickOnNewWindow();
		String expectedMsg="This is a sample page";
		String actualMsg=alertsObj.checkNewTabMessage();
		Assert.assertEquals(expectedMsg, actualMsg);
	}
	
	@Test(priority=4)
	public void verifyNewWindowMessageIsOpening() throws InterruptedException {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnBrowserWindowsTab();
		alertsObj.clickNewWindowMsg();
		String expectedMsg="Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.";
		String actualMsg=alertsObj.checkNewWindowMessage();
		Assert.assertEquals(expectedMsg, actualMsg);
	}
	@Test(priority=5)
	public void verifyAlertsIsClickable() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnAlertsTab();
		String expectedText="Alerts";
		String actualText=alertsObj.checkAlertsHeadingText();
		Assert.assertEquals(expectedText, actualText);
	}
	@Test(priority=6)
	public void verifyFirstAlert() throws InterruptedException {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnAlertsTab();
		alertsObj.clickOnClickMeFirstbutton();
		Thread.sleep(3000);
		alertsObj.clickOnOkButtonOnAlert();	
	}
	
	@Test(priority=7)
	public void verifySecondAlert()throws InterruptedException {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnAlertsTab();
		alertsObj.clickOnClickMeSecondButton();
		Thread.sleep(6000);
		alertsObj.clickOnOkButtonOnAlert();
	}
	
	@Test(priority=8)
	public void verifyThirdAlert()throws InterruptedException {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnAlertsTab();
		alertsObj.clickOnClickMeThirdButton();
		alertsObj.clickOnOkButtonOnAlert();
		Thread.sleep(2000);
		alertsObj.clickOnClickMeThirdButton();
		alertsObj.clickOnCancelButtonOnAlert();
	}
	@Test(priority=9)
	public void verifyFourthAlert()throws InterruptedException {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnAlertsTab();
		alertsObj.clickOnClickMeFourthButton();
		Thread.sleep(2000);
		alertsObj.sendTextInAlertTextbox();
		alertsObj.clickOnOkButtonOnAlert();
		Thread.sleep(2000);
		alertsObj.clickOnClickMeFourthButton();
		Thread.sleep(2000);
		alertsObj.sendTextInAlertTextbox();
		alertsObj.clickOnCancelButtonOnAlert();	
	}
	
	@Test(priority=10)
	public void verifyFramesIsClickable() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnFramesTab();
		String expectedText="Frames";
		String actualText=alertsObj.checkFramesHeadingText();
		Assert.assertEquals(expectedText, actualText);
	}
	
	@Test(priority=11)
	public void verifyToSwitchToFrame1() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnFramesTab();
		alertsObj.switchToFrame1();
		String expectedText="This is a sample page";
		String actualText = alertsObj.checkStringInFrame1();
		Assert.assertEquals(expectedText, actualText);
	}
	
	@Test(priority=12)
	public void verifyToSwitchToFrame2() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnFramesTab();
		alertsObj.switchToFrame2();
		String expectedText="This is a sample page";
		String actualText = alertsObj.checkStringInFrame1();
		Assert.assertEquals(expectedText, actualText);
	}
	
	@Test(priority=13)
	public void verifyNestedFramesTabIsClickable() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnNestedFramesTab();
		String expectedText="Nested frames";
		String actualText = alertsObj.checkNestedFramesHeadingText();
		Assert.assertEquals(expectedText, actualText);
	}
	@Test(priority=14)
	public void verifyToSwitchToNestedMainFrame() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnNestedFramesTab();
		alertsObj.switchToFrame1();
		String expectedText="Parent frame";
		String actualText = alertsObj.checkNestedMainFrameText();
		Assert.assertEquals(expectedText, actualText);
	}
	
	@Test(priority=15)
	public void verifyToSwitchToNestedFrame() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnNestedFramesTab();
		alertsObj.switchToFrame1();
		alertsObj.switchToChildFrame();
	}
	
	@Test(priority=16)
	public void verifyModalDialogIsClickable() {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnModalDailogsTab();
		String expectedText="Modal Dialogs";
		String actualText = alertsObj.checkModalDailogsHeadingText();
		Assert.assertEquals(expectedText, actualText);
	}
	
	@Test(priority=17)
	public void verifySmallModalIsClickable() throws InterruptedException {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnModalDailogsTab();
		alertsObj.clickOnSmallModal();
		String expectedText="This is a small modal. It has very less content";
		String actualText = alertsObj.checkSmallModalText();
		Assert.assertEquals(expectedText, actualText);
		alertsObj.clickCloseButton();
	}
	
	@Test(priority=18)
	public void verifyLargeModalIsClickable() throws InterruptedException {
		homePageObj = new HomePage(driver);
		homePageObj.clickOnAlertsFramesWindowsbox();
		alertsObj =new AlertsFramesWindowsPage(driver);
		alertsObj.clickOnModalDailogsTab();
		alertsObj.clickOnLargeModal();
		String expectedText ="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ";
		String actualText = alertsObj.checkLargeModalText();
		System.out.println("!!!!!!!@"+actualText);
		System.out.println("!!!!!!!@@@@@@@"+expectedText);
		Assert.assertEquals(expectedText, actualText);
		Thread.sleep(3000);
		alertsObj.clickCloseButton();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}
}
