package ToolsQA.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetsPage {

	public WebDriver driver;
	
	public WidgetsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Accordian']")
	WebElement accordianTab;
	
	@FindBy(xpath="//h1[text()='Accordian']")
	WebElement accordianHeadingText;
	
	@FindBy(xpath="//div[@id='section1Heading']")
	WebElement header1;
	
	@FindBy(xpath="//div[@id='section2Heading']")
	WebElement header2;
	
	@FindBy(xpath="//div[@id='section3Heading']")
	WebElement header3;
	
	@FindBy(xpath="//div[@id='section1Content']")
	WebElement section1Content;
	
	@FindBy(xpath="//div[@id='section2Content']")
	WebElement section2Content;
	
	@FindBy(xpath="//div[@id='section3Content']")
	WebElement section3Content;
	
	@FindBy(xpath="//span[text()='Auto Complete']")
	WebElement autoComplete;
	
	@FindBy(xpath="//h1[text()='Auto Complete']")
	WebElement autoCompleteHeader;
	
	@FindBy(xpath="//input[@id='autoCompleteMultipleInput']")
	WebElement multiColorTextBox;
	
	@FindBy(xpath="//input[@id='autoCompleteSingleInput']")
	WebElement singlecolorTextBox;
	
	@FindBy(xpath="//div[text()='Black']")
	WebElement selectBlackColor;
	
	@FindBy(xpath="//div[text()='Voilet']")
	WebElement selectVoiletColor;
	
	@FindBy(xpath="//div[text()='Blue']")
	WebElement selectBlueColor;
	
	@FindBy(xpath="//div[@id='react-select-3-option-2']")
	WebElement selectAquaColor;
	
	@FindBy(xpath="//div[@id='react-select-3-option-1']")
	WebElement selectMagentaColor;
	
	@FindBy(xpath="//span[text()='Date Picker']")
	WebElement selectDatPickerTab;
	
	@FindBy(xpath="//input[@id='datePickerMonthYearInput']")
	WebElement clickDatePicker;
	
	@FindBy(xpath="//input[@id='dateAndTimePickerInput']")
	WebElement timePicker;
	
	@FindBy(xpath="//span[text()='Slider']")
	WebElement sliderTab;
	
	@FindBy(xpath="//input[@class='range-slider range-slider--primary']")
	WebElement Slider;
	
	@FindBy(xpath="//span[@class='range-slider__wrap']/input[@value='25']")
	WebElement sliderHandle;
	
	@FindBy(xpath="//input[@id='sliderValue']")
	WebElement sliderBoxValue;
	
	@FindBy(xpath="//span[text()='Progress Bar']") 
	WebElement progressBarTab;
	
	@FindBy(xpath="//h1[text()='Progress Bar']")
	WebElement progressBarHeaderText;
	
	@FindBy(xpath="//button[@id='startStopButton']")
	WebElement startStopBtn;
	
	@FindBy(xpath="//div[@role='progressbar']")
	WebElement progressBar;
	
	@FindBy(xpath="//button[@id='resetButton']")
	WebElement resetBtn;
	
	@FindBy(xpath="//span[text()='Tabs']")
	WebElement Tabs;
	
	@FindBy(xpath="//h1[text()='Tabs']")
	WebElement tabHeaderText;
	
	@FindBy(xpath="//a[@id='demo-tab-origin']")
	WebElement originTab;
	
	@FindBy(xpath="//a[@id='demo-tab-use']")
	WebElement useTab;
	
	@FindBy(xpath="//a[@id='demo-tab-what']")
	WebElement whatTab;
	
	@FindBy(xpath="//button[@id='toolTipButton']")
	WebElement buttonToolTip;
	
	@FindBy(xpath="//div[text()='You hovered over the Button']")
	WebElement toolTipText;
	
	@FindBy(xpath="//span[text()='Tool Tips']")
	WebElement toolTipsTab;
	
	@FindBy(xpath="//p[text()='Practice Tool Tips']")
	WebElement toolTipsHeaderText;
	
	@FindBy(xpath="//input[@id='toolTipTextField']")
	WebElement textBox;
	
	@FindBy(xpath="//div[text()='You hovered over the text field']")
	WebElement textBoxHoveredText;
	
	@FindBy(xpath="//span[text()='Select Menu']")
	WebElement selectMenuTab;
	
	@FindBy(xpath="//h1[text()='Select Menu']")
	WebElement menuHeaderText;
	
	@FindBy(xpath="//div[text()='Select Option']")
	WebElement selectDropdown1;
	
	@FindBy(xpath="//div[text()='Group 1, option 2']")
	WebElement Options1;
	
	@FindBy(xpath="//div[text()='Select Title']")
	WebElement selectTitle;
	
	@FindBy(xpath="//div[text()='Mrs.']")
	WebElement OptionMrs;
	
	@FindBy(xpath="//select[@id='oldSelectMenu']")
	WebElement selectOldStyleDropdown;
	
	@FindBy(xpath="//div[text()='Select...']")
	WebElement selectMultiSelectDropdown;
	
	@FindBy(xpath="//div[text()='Blue']")
	WebElement selectBlue;
	
	@FindBy(xpath="//div[text()='Green']")
	WebElement selectGreen;
	
	@FindBy(xpath="//div[text()='Red']")
	WebElement selectRed;
	
	@FindBy(xpath="//select[@id='cars']")
	WebElement carsDropdown;
	
	
	public void clickOnAccordianTab() {
		accordianTab.click();
	}
	
	public String accordianHeadingText() {
		String str=accordianHeadingText.getText();
		return str;
	}
	
	public void clickOnHeader1ToOpenClose() {
		header1.click();
	}
	
	public String checkSection1text() {
		String str=section1Content.getText();
		return str;	
	}
	
	public void clickOnHeader2ToOpenClose() {
		header2.click();
	}
	
	public String checkSection2text() {
		String str=section2Content.getText();
		return str;	
	}
	
	public void clickOnHeader3ToOpenClose() {
		header3.click();
	}
	
	public String checkSection3text() {
		String str=section3Content.getText();
		return str;	
	}
	
	public void clickOnAutoCompleteTab() {
		autoComplete.click();
	}
	
	public String checkAutoCompleteText() {
		String str= autoCompleteHeader.getText();
		return str;
	}
	
	
	public void selectBlackColor(String color) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
		WebElement elementWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='autoCompleteMultipleInput']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",multiColorTextBox);
		wait.until(ExpectedConditions.elementToBeClickable(elementWait));
		multiColorTextBox.sendKeys(color);
		selectBlackColor.click();
	}

	public void selectVoiletColor(String color) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement colorWait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='autoCompleteMultipleInput']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",multiColorTextBox);
		wait.until(ExpectedConditions.elementToBeClickable(colorWait));
		multiColorTextBox.sendKeys(color);
		selectVoiletColor.click();
	}
	
	public void selectBlueColor(String color) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement elementWait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='autoCompleteMultipleInput']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", multiColorTextBox);
		wait.until(ExpectedConditions.elementToBeClickable(elementWait));
		Thread.sleep(3000);
		multiColorTextBox.sendKeys(color);
		selectBlueColor.click();
	}
	
	public void selectSingleAquaColor(String color) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement elementWait= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='autoCompleteSingleInput']")));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", singlecolorTextBox);
		wait.until(ExpectedConditions.elementToBeClickable(elementWait));
		singlecolorTextBox.sendKeys(color);
		selectAquaColor.click();
	}
	
	public void selectSingleMagentaColor(String color) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement elementwait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='autoCompleteSingleInput']")));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",singlecolorTextBox);
		wait.until(ExpectedConditions.elementToBeClickable(elementwait));
		singlecolorTextBox.sendKeys(color);
		selectMagentaColor.click();
	}
	
	public void clickOnSelectDatePickerTab() {
		selectDatPickerTab.click();
	}
	
	public void clickOnSelectDatePicker() {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",clickDatePicker);
		clickDatePicker.click();
	}
	
	public void clickOnTimePicker() {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",timePicker);
		timePicker.click();
	}
	
	public void clickOnSliderTab() {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",sliderTab);
		sliderTab.click();
	}
	
	public void sliderBarTest() throws InterruptedException {
		//int xwidth=sliderSource.getSize().width;
		//System.out.println("!!!!!!!!!!@@@@@@@@"+xwidth);
		//System.out.println("!!!!!!!!!!@@@@@@@@"+sliderSource);
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='range-slider range-slider--primary']")));
		Thread.sleep(3000);
		Actions action= new Actions(driver);
		int sliderWidth=Slider.getSize().getWidth();
		int handleWidth=sliderHandle.getSize().getWidth();
		//int moveToXOffset=(sliderWidth - handleWidth)/2;
		//int moveToXOffset=-sliderWidth/2;
		int moveToXOffset=sliderWidth/2;
		System.out.println("!!!!@@@@@@"+sliderWidth);
		System.out.println("!!!!@@@@@@"+handleWidth);

		action.clickAndHold(sliderHandle).moveByOffset(moveToXOffset, 0).release().build().perform();
		//action.dragAndDropBy(Slider,69,0);
	}
	
	public String checkSliderValue() {
		String sliderValue=sliderBoxValue.getText();
		return sliderValue;
	}
	public void scrollDownWindow() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");
	}
	
	public void clickOnProgressBarTab() {
		progressBarTab.click();
	}
	
	public String checkProgressBarText() {
		String str=progressBarHeaderText.getText();
		return str;
	}
	
	public void clickOnStartOfProgressBar() {
		startStopBtn.click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		Boolean progresStatus=wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "100"));
		if(progresStatus==true) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='resetButton']"))).click();
		}
	}
	
	public void checkProgressBarResume() {
		startStopBtn.click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "50"));
		//if(progresStatus==true) {
			startStopBtn.click();
//	}
	}
	
	public void clickOnTabsTab() {
		Tabs.click();
	}
	
	public String checkTabsHeader() {
		String str= tabHeaderText.getText();
		return str;
	}
	
	public void clickOnTabOrigin() {
		originTab.click();
	}
	
	public void clickOnTabUse() {
		useTab.click();
	}
	
	public void clickOnTabWhat() {
		whatTab.click();
	}
	
	public void clickOnToolTipsTab() {
		toolTipsTab.click();
	}
	
	public String checkToolTipsHeaderText() {
		String str=toolTipsHeaderText.getText();
		return str;
	}
	
	public void clickOnToolTipButton() {
		Actions action= new Actions(driver);
		action.moveToElement(buttonToolTip).perform();
	}
	
	public String checkToolTipText() {
		String str=toolTipText.getText();
		return str;
	}
	
	public void hoverOverTextBox(String text) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",textBox);
		textBox.sendKeys(text);
		//Actions action = new Actions(driver);
		//action.moveToElement(textBox).sendKeys(text);
	}
	
	public String checkHoveredTextOfTextbox() {
		String str= textBoxHoveredText.getText();
		return str;
	}
	
	public void clickOnSelectMenuTab() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",selectMenuTab);
		selectMenuTab.click();
	}
	
	public String checkSelectMenuHeaderText() {
		String str=menuHeaderText.getText();
		return str;
	}
	
	public void clickOnFirstDropdown() {
		selectDropdown1.click();
	}
	
	public void selectOptionFromDropdown() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",Options1);
		wait.until(ExpectedConditions.elementToBeClickable(Options1));
		Options1.click();
	}
	
	public void clickOnSelectOneDropdown() {
		selectTitle.click();
	}
	
	public void clickOnMrsFromDropdownOption() {
		OptionMrs.click();
	}
	
	public void clickOnOldStyleSelectMenu() {
		Select selDrop=new Select(selectOldStyleDropdown);
		selDrop.selectByVisibleText("Indigo");
	}
	
	
	public void selectBlueFromMultiSelectDropdown(String Color) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",selectBlue);
		selectMultiSelectDropdown.sendKeys(Color);
		selectBlue.click();
	}
	
	public void selectGreenFromMultiSelectDropdown(String Color) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",selectGreen);
		selectMultiSelectDropdown.sendKeys(Color);
		selectGreen.click();
	}
	
	public void selectRedFromMultiSelectDropdown(String Color) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",selectRed);
		selectMultiSelectDropdown.sendKeys(Color);
		selectRed.click();
	}
	
	public void selectFromCarsDropdown() {
		Select selDrop= new Select(carsDropdown);
		selDrop.selectByVisibleText("Audi");
	}
	
}
