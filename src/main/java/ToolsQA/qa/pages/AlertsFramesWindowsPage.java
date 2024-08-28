package ToolsQA.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsFramesWindowsPage {
	
	WebDriver driver;
	public AlertsFramesWindowsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Browser Windows']")
	WebElement browserWindows;
	
	@FindBy(xpath="//button[text()='New Tab']")
	WebElement newTab;
	
	@FindBy(xpath="//h1[text()='This is a sample page']")
	WebElement newTabMessage;
	
	@FindBy(xpath="//button[text()='New Window']")
	WebElement newWindow;
	
	@FindBy(xpath="//button[text()='New Window Message']")
	WebElement newWindowMessage;
	
	@FindBy(xpath="//body[contains(text(),'Knowledge increases by sharing but not by saving.')]")
	WebElement newWindowTextMessage;
	
	@FindBy(xpath="//span[text()='Alerts']")
	WebElement alertsTab;
	
	@FindBy(xpath="//h1[text()='Alerts']")
	WebElement alertsHeadingText;
	
	@FindBy(xpath="//button[@id='alertButton']")
	WebElement clickMeFirst;
	
	@FindBy(xpath="//button[@id='timerAlertButton']")
	WebElement clickMeSecond;
	
	@FindBy(xpath="//button[@id='confirmButton']")
	WebElement clickMeThird;
	
	@FindBy(xpath="//button[@id='promtButton']")
	WebElement clickMeFourth;
	
	@FindBy(xpath="//span[text()='Frames']")
	WebElement framesTab;
	
	@FindBy(xpath="//h1[text()='Frames']")
	WebElement framesHeadingText;
	
	@FindBy(xpath="//iframe[@id='frame1']")
	WebElement frame1;
	
	@FindBy(xpath="//h1[text()='This is a sample page']")
	WebElement frameTextMsg;
	
	@FindBy(xpath="//iframe[@id='frame2']")
	WebElement frame2;
	
	@FindBy(xpath="//span[text()='Nested Frames']")
	WebElement nestedFramesTab;
	
	@FindBy(xpath="//h1[text()='Nested Frames']")
	WebElement nestedFramesHeadingText;
	
	@FindBy(xpath="//body[text()='Parent frame']")
	WebElement nestedMainFrameText;
	
	@FindBy(xpath="//iframe[@srcdoc='<p>Child Iframe</p>']")
	WebElement nestedChildFrame;
	
	@FindBy(xpath="//span[text()='Modal Dialogs']")
	WebElement modalDailogs;
	
	@FindBy(xpath="//h1[text()='Modal Dialogs']")
	WebElement modalDailogsHeadingText;
	
	@FindBy(xpath="//button[text()='Small modal']")
	WebElement smallModal;
	
	@FindBy(xpath="//div[text()='This is a small modal. It has very less content']")
	WebElement smallModalText;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement closeButton;
	
	@FindBy(xpath="//button[text()='Large modal']")
	WebElement largeModal;
	
	@FindBy(xpath="//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')]")
	WebElement  largeModalText;
	
	public void clickOnBrowserWindowsTab() {
		browserWindows.click();
	}
	
	public void clickOnNewTab() {
		newTab.click();
		Set<String> windHandles=driver.getWindowHandles();
		Iterator<String> it= windHandles.iterator();
		//String parentid=it.next();
		String childid=it.next();
	    driver.switchTo().window(childid);
		//driver.switchTo().window(parentid);
	}

	public String checkNewTabMessage() {
	  String str=newTabMessage.getText();
	  return str;
	}	
		
	public void ClickOnNewWindow() {
		newWindow.click();
		Set<String> windHandles=driver.getWindowHandles();
		Iterator<String> it= windHandles.iterator();
		//String parentid=it.next();
		String childid=it.next();
	    driver.switchTo().window(childid);
	}
	
	public void clickNewWindowMsg() {
		newWindowMessage.click();
		Set<String> windHandles=driver.getWindowHandles();
		Iterator<String> it= windHandles.iterator();
	//	String parentid=it.next();
		String childid=it.next();
	    driver.switchTo().window(childid);
	}
	
	public String checkNewWindowMessage() throws InterruptedException {
		  Thread.sleep(5000);
		  String str=newWindowTextMessage.getText();
		  return str;
	}	
	
	public void clickOnAlertsTab() {
		alertsTab.click();
	}
	
	public String checkAlertsHeadingText() {
		String str=alertsHeadingText.getText();
		return str;
	}
	
	public void clickOnClickMeFirstbutton() {
		clickMeFirst.click();
	}
	
	public void clickOnOkButtonOnAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void clickOnCancelButtonOnAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public void sendTextInAlertTextbox() {
		driver.switchTo().alert().sendKeys("Alert is shown");
	}
	
	public void clickOnClickMeSecondButton() {
		clickMeSecond.click();
	}
	
	public void clickOnClickMeFourthButton() {
		clickMeFourth.click();
	}

	public void clickOnClickMeThirdButton() {
		clickMeThird.click();	
	}
	
	public void clickOnFramesTab() {
		framesTab.click();
	}
	
	public String checkFramesHeadingText() {
		String str=framesHeadingText.getText();
		return str;
	}
	
	public void switchToFrame1() {
		driver.switchTo().frame(frame1);
	}
	
	public String checkStringInFrame1() {
		String str =frameTextMsg.getText();
		return str;
	}
	
	public void switchToFrame2() {
		driver.switchTo().frame(frame2);
	}
	
	public void clickOnNestedFramesTab() {
		nestedFramesTab.click();
	}
	
	public String checkNestedFramesHeadingText() {
		String str =nestedFramesHeadingText.getText();
		return str;
	} 
	
	public String checkNestedMainFrameText() {
		String str=nestedMainFrameText.getText();
		return str;
	}
	
	public void switchToChildFrame() {
		driver.switchTo().frame(nestedChildFrame);
	}
	
	public void clickOnModalDailogsTab() {
		modalDailogs.click();
	}
	
	public String checkModalDailogsHeadingText() {
		String str=modalDailogsHeadingText.getText();
		return str;
	}
	
	public void clickOnSmallModal() throws InterruptedException {
		smallModal.click();
		Thread.sleep(3000);
	}
	
	public String checkSmallModalText() {
		String str=smallModalText.getText();
		return str;
	}
	
	public void clickCloseButton() {
		closeButton.click();
	}
	
	public void clickOnLargeModal() {
		largeModal.click();
	}
	
	public String checkLargeModalText() {
		String str=largeModalText.getText();
		return str;
	}
}
