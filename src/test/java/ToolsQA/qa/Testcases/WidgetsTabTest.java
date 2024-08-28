package ToolsQA.qa.Testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ToolsQA.qa.Base.BaseClass;
import ToolsQA.qa.pages.HomePage;
import ToolsQA.qa.pages.WidgetsPage;
import junit.framework.Assert;

public class WidgetsTabTest extends BaseClass{
	
	WebDriver driver;
	HomePage homePageObj;
	WidgetsPage widgetsPageObj;
	
	@BeforeMethod
	public void setUp() throws FileNotFoundException {
		
		this.propTestData = this.loadTestPropertiesFile();
		this.configTestData= this.loadConfigPropertiesFile();
		driver=InitializeBrowserOpenURL("Chrome");
		
	}
	
	@Test(priority=1)
	public void verifyAccordianTabIsClickable() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnAccordianTab();
		String actualText=widgetsPageObj.accordianHeadingText();
		String expectedText="Accordian";
		Assert.assertEquals(expectedText, actualText);
	}
	
	@Test(priority=2)
	public void verifyHeader1OpenAndClose() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnAccordianTab();
		String expectedText="Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		String actualText=widgetsPageObj.checkSection1text();
		Assert.assertEquals(expectedText, actualText);
		widgetsPageObj.clickOnHeader1ToOpenClose();
		
	}
	
	@Test(priority=3)
	public void verifyHeader2OpenAndClose() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnAccordianTab();
		widgetsPageObj.clickOnHeader2ToOpenClose();
		String expectedText="Contrary to popular belief, Lorem Ipsum is not simply random text.";
		String actualText=widgetsPageObj.checkSection2text();
		Assert.assertEquals(expectedText, actualText);	
		widgetsPageObj.clickOnHeader2ToOpenClose();	
	} 
	
	@Test(priority=4)
	public void verifyHeader3OpenAndClose() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnAccordianTab();
		widgetsPageObj.clickOnHeader1ToOpenClose();
		widgetsPageObj.clickOnHeader3ToOpenClose();
		String expectedText="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.";
		String actualText=widgetsPageObj.checkSection3text();
		Assert.assertEquals(actualText.contains(expectedText),"Text is not matching");
		widgetsPageObj.clickOnHeader3ToOpenClose();
	} 
	
	
	@Test(priority=5)
	public void verifyToClickOnAutoComplete() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnAutoCompleteTab();
		String expectedText="Auto Complete";
		String actualText=widgetsPageObj.checkAutoCompleteText();
		Assert.assertEquals(expectedText, actualText);
	}
	
	@Test(priority=6)
	public void verifyToSelectMultiColor() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnAutoCompleteTab();
		widgetsPageObj.selectBlackColor("C");
		widgetsPageObj.selectVoiletColor("O");
		widgetsPageObj.selectBlueColor("B");
	}
	
	@Test(priority=7)
	public void verifyToSelectSingleColor() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnAutoCompleteTab();
		widgetsPageObj.selectSingleAquaColor("A");
	}
	
	@Test(priority=8)
	public void verifySelectSingleColorAgain() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnAutoCompleteTab();
		widgetsPageObj.selectSingleAquaColor("A");
		widgetsPageObj.selectSingleMagentaColor("M");
	}
	
	@Test(priority=9)
	public void verifySelectDatePickerTab() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnSelectDatePickerTab();
		widgetsPageObj.clickOnSelectDatePicker();
		//Thread.sleep(3000);
		selectRandomdateFromDatePicker();
		widgetsPageObj.clickOnTimePicker();
		Thread.sleep(3000);
		selectRandomdateFromDatePicker();
		selectRandomTimeFromTimePicker();
	}
	
	@Test(priority=10)
	public void verifyToClickOnSliderTab() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnSliderTab();
		//widgetsPageObj.scrollDownWindow();
		widgetsPageObj.sliderBarTest();
		String actualValue=widgetsPageObj.checkSliderValue();
		Assert.assertEquals(actualValue, "50");
	}
	
	@Test(priority=11)
	public void verifyToClickOnProgressBarTab() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnProgressBarTab();
		String expectedString= "Progress bar";
		String actualString= widgetsPageObj.checkProgressBarText();
		Assert.assertEquals(expectedString, actualString);
	}
	
	@Test(priority=12)
	public void verifyProgressBarStatus() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnProgressBarTab();
		widgetsPageObj.clickOnStartOfProgressBar();
		
	}
	
	@Test(priority=13)
	public void verifyProgressBarResume() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnProgressBarTab();
		widgetsPageObj.checkProgressBarResume();
	}
	
	@Test(priority=14)
	public void verifyToClickOnTabsTab() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnTabsTab();
		String expectedText="Tabs";
		String actualText=widgetsPageObj.checkTabsHeader();
		Assert.assertEquals(expectedText, actualText);
	}
	
	@Test(priority=15)
	public void verifyToClickOnAllTabs() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnTabsTab();
		widgetsPageObj.clickOnTabOrigin();
		Thread.sleep(3000);
		widgetsPageObj.clickOnTabUse();
		Thread.sleep(3000);
		widgetsPageObj.clickOnTabWhat();
	}
	
	@Test(priority=16)
	public void verifyToClickOnToolTipTab() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnToolTipsTab();
		String actualText=widgetsPageObj.checkToolTipsHeaderText();
		String expectedText="Practice Tool Tips";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=17)
	public void verifyToCheckHoveredTextOnbutton() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnToolTipsTab();
		widgetsPageObj.clickOnToolTipButton();
		String actualText=widgetsPageObj.checkToolTipText();
		String expectedText="You hovered over the Button";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=18)
	public void verifyToCheckHoveredTextForTextbox() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnToolTipsTab();
		Thread.sleep(3000);
		widgetsPageObj.hoverOverTextBox("Test");
		String actualText=widgetsPageObj.checkHoveredTextOfTextbox();
		String expectdText="You hovered over the text field";
		Assert.assertEquals(actualText, expectdText);
	}
	
	@Test(priority=19)
	public void verifyToMenuTabIsClickable() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnSelectMenuTab();
		String actualText=widgetsPageObj.checkSelectMenuHeaderText();
		String expectedText="Select Menu";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=20)
	public void verifyToSelectFromFirstDropdown() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnSelectMenuTab();
		widgetsPageObj.clickOnFirstDropdown();
		widgetsPageObj.selectOptionFromDropdown();
	}
	
	@Test(priority=21)
	public void verifyToSelectFromSecondDropdown() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnSelectMenuTab();
		widgetsPageObj.clickOnFirstDropdown();
		widgetsPageObj.selectOptionFromDropdown();
		widgetsPageObj.clickOnSelectOneDropdown();
		widgetsPageObj.clickOnMrsFromDropdownOption();
	}
	
	@Test(priority=22)
	public void verifyToSelectFromThirdDropdown() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnSelectMenuTab();
		widgetsPageObj.clickOnFirstDropdown();
		widgetsPageObj.selectOptionFromDropdown();
		widgetsPageObj.clickOnSelectOneDropdown();
		widgetsPageObj.clickOnMrsFromDropdownOption();
		widgetsPageObj.clickOnOldStyleSelectMenu();
	}
	
	@Test(priority=23)
	public void verifyToSelectFromMultiSelectDropdown() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnSelectMenuTab();
		widgetsPageObj.clickOnFirstDropdown();
		widgetsPageObj.selectOptionFromDropdown();
		widgetsPageObj.clickOnSelectOneDropdown();
		widgetsPageObj.clickOnMrsFromDropdownOption();
		widgetsPageObj.clickOnOldStyleSelectMenu();
		//widgetsPageObj.clickOnMultiSelectDropdown();
		widgetsPageObj.selectBlueFromMultiSelectDropdown("b");
		widgetsPageObj.selectGreenFromMultiSelectDropdown("g");
		widgetsPageObj.selectRedFromMultiSelectDropdown("r");
	}
	
	@Test(priority=24)
	public void verifyToSelectFromStandardMultiSelect() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnWidgetsBox();
		widgetsPageObj = new WidgetsPage(driver);
		widgetsPageObj.clickOnSelectMenuTab();
		widgetsPageObj.selectFromCarsDropdown();
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
