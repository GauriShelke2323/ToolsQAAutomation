package ToolsQA.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Elements']")
	WebElement elementBox; 
	
	@FindBy(xpath="//div[contains(text(),'Please select an item from')]")
	WebElement textPleaseSelect;
	
	@FindBy(xpath="//h5[text()='Forms']")
	WebElement formsBox;
	
	@FindBy(xpath="//h5[text()='Alerts, Frame & Windows']")
	WebElement alertsFramesWindowsbox;
	
	@FindBy(xpath="//h5[text()='Widgets']")
	WebElement widgetsBox;
	
	@FindBy(xpath="//h5[text()='Interactions']")
	WebElement interactionsItem;
	
	
	
	public void clickOnElementBox() throws InterruptedException {
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementBox);
		elementBox.click();
	}
	
	public String checkMessagePleaseSelectAnItemFromLeftToStartPractice() {
		String strMsg=textPleaseSelect.getText();
		return strMsg;
	}
	
	public void clickOnformsBox() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", formsBox);
		formsBox.click();
	}

	public void clickOnAlertsFramesWindowsbox() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", alertsFramesWindowsbox);
		alertsFramesWindowsbox.click();
	}

	public void clickOnWidgetsBox() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", widgetsBox);
		widgetsBox.click();
		
	}
	public void clickOnInteractionsItem() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", interactionsItem);
		interactionsItem.click();
	}

	
	
}
