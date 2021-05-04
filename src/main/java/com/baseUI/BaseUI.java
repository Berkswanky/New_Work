package com.baseUI;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mainObjectRepository.BasePage;
import com.utils.GetPropertiesFile;
import com.utils.ScreenShot;

public class BaseUI {
	public static Properties prop = GetPropertiesFile.getPropertiesInstance();// CREATING OBJECT OF PROPERTY FILE
	public static WebDriver driver;
	public static String exePath;
	public static String url = prop.getProperty("websiteURL");// GETTING THE URL FROM PROPERTY FILE
	public static String browsertype;
	public static ExtentTest logger;
	public static String path;
	public static WebDriverWait wait;
	public static JavascriptExecutor jse;
	

	
	public static String getTitle(WebDriver driver) {
		return (driver.getTitle());
	}
	
	public static void clickLocation(WebDriver driver) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(BasePage.getLocationBtn(driver)));
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", BasePage.getLocationBtn(driver));
		
	}
	
	public static void clickSearch(WebDriver driver) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(BasePage.getSearchBtn(driver)));
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", BasePage.getSearchBtn(driver));
		
	}
	
	public static boolean clickSearchBox(WebDriver driver) {
		return (BasePage.getSearchBox(driver).isEnabled());
	
		
	}
	
	public static void clickFitnessLink(WebDriver driver) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(BasePage.getFitness(driver)));
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", BasePage.getFitness(driver));
		
	}
	
	public static void clickFreeListingLink(WebDriver driver) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(BasePage.getFreeListing(driver)));
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", BasePage.getFreeListing(driver));
		
	}
	
	
	public static void selectLocation(WebDriver driver) {
		
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(BasePage.chooseLocation(driver)));
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", BasePage.chooseLocation(driver));
	}
	
	public static void enterService(WebDriver driver, String data) {
		
		BasePage.getSearchBox(driver).sendKeys(data);
	}

	public static void driverClose() {
		driver.quit();
	}

	// TO PRINT LOG MESSAGE FOR FAILURE
	public static void reportFail(String reportString) {
		logger.log(Status.FAIL, reportString);
		path = ScreenShot.takeSnapShot(driver);
		try {
			logger.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
