package ToolsQA.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ToolsQA.qa.Utils.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties propTestData;
	public Properties configTestData;
	
	public Properties loadTestPropertiesFile() throws FileNotFoundException  {
		propTestData=new Properties();
		File propTestDataFile=new File(System.getProperty("user.dir")+"/src/main/java/ToolsQA/qa/Testdata/testdata.properties");
		try {
			FileInputStream fis= new FileInputStream(propTestDataFile);
			propTestData.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propTestData;
		
		/*configTestData= new Properties();
		File configTestDataFile = new File(System.getProperty("user.dir")+"/src/main/java/ToolsQA/qa/config/config.properties");
		try {
			FileInputStream fis1= new FileInputStream(configTestDataFile);
			configTestData.load(fis1);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
	
	public Properties loadConfigPropertiesFile() throws FileNotFoundException  {
		configTestData= new Properties();
		File configTestDataFile = new File(System.getProperty("user.dir")+"/src/main/java/ToolsQA/qa/config/config.properties");
		try {
			FileInputStream fis1= new FileInputStream(configTestDataFile);
			configTestData.load(fis1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return configTestData;
	}
	
	
	
	public WebDriver InitializeBrowserOpenURL(String browser) {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//String browser = "Chrome";
		if(browser=="Chrome") {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(configTestData.getProperty("URL"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_WAIT_TIME));
		}
			return driver;
		}
	public void selectRandomdateFromDatePicker() {
		
		List<WebElement> dateElements = driver.findElements(By.xpath("//div[@class='react-datepicker__month-container']"));
		//System.out.println(dateElements+"!!!!!!!!@@@@");
		Random random=new Random();
		int randomIndex=random.nextInt(dateElements.size());
		//System.out.println(randomIndex+"!!!!!!!!!!!@@@@@@");
		WebElement randomDate=dateElements.get(randomIndex);
		//System.out.println(randomDate+"!!!!@#@#@#");
		randomDate.click();
	}
	
	public void selectRandomTimeFromTimePicker() {
		List<WebElement> timeElements=driver.findElements(By.xpath("//div[@class='react-datepicker__time-box']"));
		Random random=new Random();
		int randomIndex=random.nextInt(timeElements.size());
		WebElement randamTime=timeElements.get(randomIndex);
		randamTime.click();
	}
}

