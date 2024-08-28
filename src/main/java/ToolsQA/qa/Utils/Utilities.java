package ToolsQA.qa.Utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utilities {
	public static final int IMPLICIT_WAIT=10;
	public static final int PAGE_WAIT_TIME=5;
	
	public static String captureScreenshot(WebDriver driver, String testName) {
		
		File srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationScreenshotPath = System.getProperty("user.dir")+"\\Screenshot\\"+testName+".png";
		try {
			FileHandler.copy(srcScreenshot, new File(destinationScreenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destinationScreenshotPath;
	}
	
}
