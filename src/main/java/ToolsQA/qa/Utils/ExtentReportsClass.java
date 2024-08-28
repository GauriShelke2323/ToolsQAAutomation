package ToolsQA.qa.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsClass {
	
	public static ExtentReports generateExtentReport() throws IOException {
		ExtentReports extentReport= new ExtentReports();
		System.out.println("!!!!!!!!@@@@@@@@@  Extent report is generated........!!!!!!");
		File extentReportFile=new File(System.getProperty("user.dir") + File.separator + "test-output" + File.separator + "ExtentReports" + File.separator + "extentReport.html");
		System.out.println(extentReportFile+"!!!!!!!!!!!!!!!");
		
		
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(extentReportFile);
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("Tools QA testcases Report");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setTimeStampFormat("dd/MM/yy hh:mm:ss");
		
		extentReport.attachReporter(sparkReporter);
		//BaseClass baseclassObj= new BaseClass();
		
		Properties configProp=new Properties();
		File configPropFile= new File(System.getProperty("user.dir")+"\\src\\main\\java\\ToolsQA\\qa\\config\\config.properties");
		FileInputStream fis=null;
		try {
			 fis= new FileInputStream(configPropFile);
			 configProp.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Details to print on Reports
		extentReport.setSystemInfo("Application URL", configProp.getProperty("URL"));
		extentReport.setSystemInfo("Browser Name", configProp.getProperty("BrowserName"));
		extentReport.setSystemInfo("OS Name", System.getProperty("os.name"));
		return extentReport;
		
	}

}
