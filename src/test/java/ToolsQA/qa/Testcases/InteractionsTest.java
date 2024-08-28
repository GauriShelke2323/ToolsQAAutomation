package ToolsQA.qa.Testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ToolsQA.qa.Base.BaseClass;
import ToolsQA.qa.pages.HomePage;
import ToolsQA.qa.pages.InteactionsPage;
import junit.framework.Assert;

public class InteractionsTest extends BaseClass {
	
	WebDriver driver;
	HomePage homePageObj; 
	InteactionsPage intrPageObj;
	
	@BeforeMethod
	public void setUp() throws FileNotFoundException {
		this.propTestData = this.loadTestPropertiesFile();
		this.configTestData= this.loadConfigPropertiesFile();
		driver=InitializeBrowserOpenURL("Chrome");
	}

	@Test(priority=1)
	public void verifyInteractionItemIsClickable() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
	}
	@Test(priority=2)
	public void verifySortableTabIsClickable() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnSortableTab();
		String actualText=intrPageObj.checkSortableHeaderText();
		String expectedText="Sortable";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=3)
	public void verifyToSortList() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnSortableTab();
		intrPageObj.switchListElements();
	}
	
	@Test(priority=4)
	public void verifyToSortGrid() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnSortableTab();
		intrPageObj.clickOnGrid();
		intrPageObj.switchGridElements();
	}
	
	@Test(priority=5)
	public void verifySelectableTabIsClickable() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnSelectableTab();
		String actualText=intrPageObj.checkSelectableHeaderText();
		String expectedText="Selectable";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=6)
	public void verifyMultiSelectElements() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnSelectableTab();
		intrPageObj.selectMultipleElementsList();
	}
	@Test(priority=7)
	public void verifyMultiSelectElementsGrid() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnSelectableTab();
		intrPageObj.clickOnSelectableGrid();
		intrPageObj.selectMultipleElementsGrid();
	}
	
	@Test(priority=8)
	public void verifyResizeIsWorkingforBox1() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnResizableTab();
		intrPageObj.resizeBox1();
	}
	
	@Test(priority=9)
	public void verifyResizeIsWorkingForBox2() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnResizableTab();
		intrPageObj.resizeBox2();
	}
	@Test(priority=10)
	public void verifyDroppableTabIsClickable() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnDroppableTab();
		String actualText=intrPageObj.checkDroppableHeaderText();
		String expectedText="Droppable";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=11)
	public void verifyDragAndDrop() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnDroppableTab();
		intrPageObj.dragAndDropBox();
		String actualText=intrPageObj.checkDroppedText();
		String expectedText="Dropped!";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=12)
	public void verifyAcceptableFunctionality() throws InterruptedException {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnDroppableTab();
		intrPageObj.clickOnAcceptTab();
		intrPageObj.dragAndDropAcceptable();
		String actualText=intrPageObj.checkDroppedText();
		String expectedText="Dropped!";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=13)
	public void verifyNonAcceptableFunctionality() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnDroppableTab();
		intrPageObj.clickOnAcceptTab();
		intrPageObj.dragAndDropNonAcceptable();
		String actualText=intrPageObj.checkDropHereText();
		String expectedText="Drop here";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority=14)
	public void verifyToClickOnPreventPropagation() {
		homePageObj= new HomePage(driver);
		homePageObj.clickOnInteractionsItem();
		intrPageObj =  new InteactionsPage(driver);
		intrPageObj.clickOnDroppableTab();
		intrPageObj.clickOnPreventPropagation();
		intrPageObj.dragAndDropInnerDropBox();
	}
}
