package ToolsQA.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsTabPage {
	WebDriver driver;
	public ElementsTabPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(@class,'accordion')]//div[1]//span[1]//div[1]//div[2]//div[2]//*[name()='svg']")
	WebElement expandCollapseElementstab;
	
	@FindBy(xpath="//span[contains(text(),'Text ')]")
	WebElement textBoxItem;
	
	@FindBy(xpath="//h1[contains(text(),'Text ')]")
	WebElement textBoxText;
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement fullNameTextbox;
	
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement emailTextbox;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement currentAddressTextbox;
	
	@FindBy(xpath="//textarea[@id='permanentAddress']")
	WebElement permanentAddressTextbox;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//p[@id='name']")
	WebElement validateNameText;
	
	@FindBy(xpath="//p[@id='email']")
	WebElement validateEmailText;
	
	@FindBy(xpath="//p[@id='currentAddress']")
	WebElement validateCurrentAddressText;
	
	@FindBy(xpath="//p[@id='permanentAddress']")
	WebElement validatePermanentAddressText;
	
	
	public void clickOnExpandCollapseElementsTab() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(expandCollapseElementstab));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", expandCollapseElementstab);
		expandCollapseElementstab.click();
		wait.until(ExpectedConditions.visibilityOf(expandCollapseElementstab));
		expandCollapseElementstab.click();
	}
	
	public void clickOnTextBoxItem() {
		textBoxItem.click();
	}
	
	public String checkTextBoxText() {
		String strmsg=textBoxText.getText();
		return strmsg;
	}
	
	public void enterFullName(String fullname) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fullNameTextbox);
		fullNameTextbox.sendKeys(fullname);
	}
	
	public void enterEmail(String Email) {
		emailTextbox.sendKeys(Email);
	}
	
	public void enterCurrentAddress(String CurrentAddress) {
		currentAddressTextbox.sendKeys(CurrentAddress);
	}
	
	public void enterPermanentAddress(String PermanantAddress) {
		permanentAddressTextbox.sendKeys(PermanantAddress);
	}
	
	public void clickOnSubmitButton() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
		submitButton.click();
	}
	
	public String validateNameTextMsg() {
		String strmsg=validateNameText.getText();
		return strmsg;
	}
	
	public String validateEmailTextMsg() {
		String strmsg=validateEmailText.getText();
		return strmsg;
	}
	
	public String validateCurrentAddressTextMsg() {
		String strmsg=validateCurrentAddressText.getText();
		return strmsg;
	}
	
	public String validatePermanentAddressTextMsg() {
		String strmsg=validatePermanentAddressText.getText();
		return strmsg;
	}
	
}

