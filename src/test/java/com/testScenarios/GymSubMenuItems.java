package com.testScenarios;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.baseUI.BaseUI;
import com.mainObjectFunctions.FitnessPageFunctions;
import com.mainObjectFunctions.GymPageFunctions;
import com.utils.DriverSetup;
import com.utils.ExtentReportFile;
import com.utils.GetPropertiesFile;
import com.utils.ScreenShot;

public class GymSubMenuItems extends BaseUI{

	public static WebDriver driver;
	public static Properties prop = GetPropertiesFile.getPropertiesInstance();
	public static String browser;
	public static String filename;
	public static ExtentReports report;
	public static ExtentTest logger;
	public static String path;
	
	@BeforeClass
	public void driverConfig() {
		browser = prop.getProperty("browser");
		driver = DriverSetup.getWebDriver(browser);
		report = ExtentReportFile.getReportInstance();

	}
	
	    @Test(priority = 0 , groups = { "Smoke" })
		public static void clickFitnessLink() {
			logger = report.createTest("Fitness Link Text Functionality");
			try {
				logger.log(Status.INFO, "Click on Fitness Link Text");
				clickFitnessLink(driver);
				logger.log(Status.PASS, "Successfully clicked on Fitness Link Text");
				path = ScreenShot.takePassSnapShotGym(driver);
				logger.addScreenCaptureFromPath(path);
			} catch (Exception e) {
				logger.log(Status.FAIL, "Cannot click on Fitness Link Text");
				reportFail(e.getMessage());
			}
		}
	    
	    @Test(priority = 1 , groups = { "Smoke" })
	    public static void clickGymLink() {
	    	
	    	logger = report.createTest("Gym Link Text Functionality");
	    	try {
	    		logger.log(Status.INFO, "Click on Gym Link Text");
	    		FitnessPageFunctions.clickGymLink(driver);
	    		logger.log(Status.PASS, "Successfully clicked on Gym Link Text");
				path = ScreenShot.takePassSnapShotGym(driver);
				logger.addScreenCaptureFromPath(path);
	    	}
	    	catch (Exception e) {
	    		logger.log(Status.FAIL, "Cannot click on Gym Link Text");
	    		reportFail(e.getMessage());
			}
	    	
	    }
	    
	    @Test(priority = 2 , groups = { "Regression" })
		public static void subItems() {
			logger = report.createTest("Gym Sub-Menu Items");
			try {
				logger.log(Status.INFO, "Get Sub-Menu Items");
				GymPageFunctions.searchReults(driver);
				logger.log(Status.PASS, "Successfully got the Gym Sub Menu Items");
				path = ScreenShot.takePassSnapShotGym(driver);
				logger.addScreenCaptureFromPath(path);
			} catch (Exception e) {
				logger.log(Status.FAIL, "Cannot get Gym Sub Menu Items");
				reportFail(e.getMessage());
			}
		}
	   
	    @Test(priority = 3 , groups = { "Regression" })
	    public static void backToHome() {
	    	logger = report.createTest("Back to Home Page");
	    	try {
	    		logger.log(Status.INFO, "Going back to Home Page");
	    		GymPageFunctions.toHomePage(driver);
	    		logger.log(Status.PASS, "Successfully  back to Home Page");
				path = ScreenShot.takePassSnapShotGym(driver);
				logger.addScreenCaptureFromPath(path);
	    	}
	    	catch (Exception e) {
				logger.log(Status.FAIL, "Did not go back to Home Page");
				reportFail(e.getMessage());
			}
	    }
	    
	    @AfterClass
		public static void tearDown() {
			driver.quit();
			report.flush();
		}
}
