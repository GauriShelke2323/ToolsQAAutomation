package ToolsQA.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsTabPage {
	WebDriver driver;
	public FormsTabPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Practice Form']")
	WebElement practiceForm;
	
	@FindBy(xpath="//h1[text()='Practice Form']")
	WebElement practiceFormTextHeading;
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement userEmail;
	
	@FindBy(xpath="//label[text()='Male']")
	WebElement genderMale;
	
	@FindBy(xpath="//label[text()='Female']")
	WebElement genderFemale;
	
	@FindBy(xpath="//label[text()='Other']")
	WebElement genderOther;
	
	@FindBy(xpath="//input[@id='userNumber']")
	WebElement mobileNumber;
	
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	WebElement datePicker;
	
	@FindBy(xpath="//input[@id='subjectsInput']")
	WebElement subjects;
	
	@FindBy(xpath="//div[text()='English']")
	WebElement subjectEnglish;
	
	@FindBy(xpath="//div[text()='Computer Science']")
	WebElement subjectCompScience;
	
	@FindBy(xpath="//div[text()='Commerce']")
	WebElement subjectCommerce;
	
	@FindBy(xpath="//label[text()='Sports']")
	WebElement hobbiesSports;
	
	@FindBy(xpath="//label[text()='Reading']")
	WebElement hobbiesReading;
	
	@FindBy(xpath="//label[text()='Music']")
	WebElement hobbiesMusic;
	
	@FindBy(xpath="//input[@id='uploadPicture']")
	WebElement uploadPicture;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement currentAddress;

	@FindBy(xpath="//div[text()='Select State']")
	WebElement selectStateDropdown;
	
	@FindBy(xpath="//div[text()='NCR']//div[text()='NCR']")
	WebElement selectNCROption;
	
	@FindBy(xpath="//div[text()='Uttar Pradesh']")
	WebElement selectUttarPradeshOption;
	
	@FindBy(xpath="//div[text()='Haryana']")
	WebElement selectHaryanaOption;
	
	@FindBy(xpath="//div[text()='Rajasthan']")
	WebElement selectRajasthanOption;
	
	@FindBy(xpath="//div[text()='Select City']")
	WebElement selectCityDropdown;
	
	@FindBy(xpath="//div[text()='Agra']")
	WebElement selectAgraOption;
	
	@FindBy(xpath="//div[text()='Lucknow']")
	WebElement selectLucknowOption;
	
	@FindBy(xpath="//div[text()='Merrut']")
	WebElement selectMerrutOption;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submitButton;
	
	
	public void clickOnPracticeForm() {
		
		practiceForm.click();
	}
	
	public String checkPracticeFormHeading() {
		String strmsg=practiceFormTextHeading.getText();
		return strmsg;
	}
	
	public void enterTextInFirstName(String Firstname) {
		firstName.sendKeys(Firstname);
	}
	
	public void enterTextInLastName(String LastName) {
		lastName.sendKeys(LastName);
	}
	
	public void enterTextInUserEmail(String Email) {
		userEmail.sendKeys(Email);	
	}
	
	public void selectGenderMale() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", genderMale);
		genderMale.click();
	}
	
	public void selectGenderFemale() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",genderFemale);
		genderFemale.click();
	}
	
	public void selectGenderOther() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",genderOther);
		genderOther.click();
	}
	
	public void enterMobileNumber(String number) {
		mobileNumber.sendKeys(number);
	}
	
	public void selectDate() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",datePicker);
		datePicker.click();
	}
	
	public void selectSubject(String subject ) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
		WebElement elementWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='subjectsInput']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",subjects);
		wait.until(ExpectedConditions.elementToBeClickable(elementWait));
		subjects.sendKeys(subject);
		subjectEnglish.click();
	}
	
	public void selectSubjectComputerScience(String subject ) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
		WebElement elementWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='subjectsInput']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",subjects);
		wait.until(ExpectedConditions.elementToBeClickable(elementWait));
		Thread.sleep(3000);
		subjects.sendKeys(subject);
		subjectCompScience.click();
		
	}
	
	public void selectSubjectCommerce(String subject ) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
		WebElement elementWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='subjectsInput']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",subjects);
		wait.until(ExpectedConditions.elementToBeClickable(elementWait));
		Thread.sleep(3000);
		subjects.sendKeys(subject);
		subjectCommerce.click();
	}
	
	public void selectHobbySports() {
		hobbiesSports.click();
	}
	
	public void selectHobbyReading() {
		hobbiesReading.click();
	}
	
	public void selectHobbyMusic() {
		hobbiesMusic.click();
	}
	
	public void selectPictureToUpload() {
		String pictureFilePath="C:\\Users\\ajaym\\Downloads\\flower.jpg";
		uploadPicture.sendKeys(pictureFilePath);
		
	}
	
	public void enterCurrentAddress(String cAddress) {
		currentAddress.sendKeys(cAddress);
	}
	
	public void selectStateFromDropdown() {
		selectStateDropdown.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",selectUttarPradeshOption);
		selectUttarPradeshOption.click();
		//WebElement option = Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		//Cannot use select here as HTML tag is div in inspect element so we have to user customize option to select from dropdown
		//Select selectState= new Select(selectStateDropdown);
		//selectState.selectByValue("Haryana");
		
	}
	
	public void selectCityFromDropdown() {
		selectCityDropdown.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",selectAgraOption);
		selectAgraOption.click();
	
	}
	
	public void clickOnSubmit() {
		submitButton.click();
	}
}


