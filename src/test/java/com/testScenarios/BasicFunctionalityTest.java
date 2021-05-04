package com.testScenarios;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.baseUI.BaseUI;
import com.mainObjectFunctions.CustomerCarePageFunction;
import com.mainObjectFunctions.FreeListingFunctions;
import com.mainObjectFunctions.SocialPageFunctions;
import com.utils.DriverSetup;
import com.utils.ExtentReportFile;
import com.utils.GetPropertiesFile;

public class BasicFunctionalityTest extends BaseUI {

	public static WebDriver driver;
	public static Properties prop = GetPropertiesFile.getPropertiesInstance();
	public static String browser;
	public static String filename;
	public static String path;
	public static ExtentReports report;
	public static ExtentTest logger;

	@BeforeClass
	public void driverConfig() {
		browser = prop.getProperty("browser");
		driver = DriverSetup.getWebDriver(browser);
		report = ExtentReportFile.getReportInstance();

	}

	@Test(priority = 0, groups = { "Regression" })
	public static void verifyHomeTitle() {
		logger = report.createTest("Title verification of the Home page");
		try {
			String expectedTitle = getTitle(driver);
			logger.log(Status.INFO, "Get page title");

			String actualTitle = "Justdial - Local Search, Social, News, Videos, Shopping";
			Assert.assertEquals(expectedTitle, actualTitle);
			logger.log(Status.PASS, "Titled verified successfully");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
	}

	@Test(priority = 1, groups = { "Regression" })

	public static void navigateToFreeListing() {
		logger = report.createTest("Title verification of the Free Listing Page");
		FreeListingFunctions.navigateToFreeListingPage(driver);
		try {
			String expectedTitle = getTitle(driver);
			logger.log(Status.INFO, "Get Free Listing page title");

			String actualTitle = "Free Listing - Just Dial - List In Your Business For Free";
			Assert.assertEquals(expectedTitle, actualTitle);
			logger.log(Status.PASS, "Titled verified successfully");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		FreeListingFunctions.navigateBackToHomePageFromFreeListingPage(driver);
	}

	@Test(priority = 2, groups = { "Regression" })

	public static void navigateToCustomerCare() {
		logger = report.createTest("Title verification of the CustomerCare Page");
		CustomerCarePageFunction.navigateToCustomerCare(driver);
		try {
			String expectedTitle = getTitle(driver);
			logger.log(Status.INFO, "Get Customer Care page title");

			String actualTitle = "Justdial Customer Support - Customer Care for Clients";
			Assert.assertEquals(expectedTitle, actualTitle);
			logger.log(Status.PASS, "Titled verified successfully");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		CustomerCarePageFunction.navigateBackToHomePageFromCustomerCare(driver);
	}

	@Test(priority = 3, groups = { "Regression" })

	public static void navigateToSocial() {
		logger = report.createTest("Title verification of the Social Page");
		SocialPageFunctions.navigateToSocial(driver);
		try {
			String expectedTitle = getTitle(driver);
			logger.log(Status.INFO, "Get Social page title");

			String actualTitle = "Latest Videos and Articles - JD Social";
			Assert.assertEquals(expectedTitle, actualTitle);
			logger.log(Status.PASS, "Titled verified successfully");
		} catch (Exception e) {
			reportFail(e.getMessage());
		}
		SocialPageFunctions.navigateBackToHomePageFromSocial(driver);
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
		report.flush();
	}

}
