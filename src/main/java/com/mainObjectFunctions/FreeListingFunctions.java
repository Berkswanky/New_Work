package com.mainObjectFunctions;

import java.io.PrintStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mainObjectRepository.BasePage;
import com.mainObjectRepository.FreeListingPage;
import com.utils.FreeListingOutputExcel;

public class FreeListingFunctions {

	public static WebDriverWait wait;
	public static JavascriptExecutor jse;
	public static PrintStream outputFile;
	
	public static void clickFreeListing(WebDriver driver) {
		
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(FreeListingPage.getListing(driver)));
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", FreeListingPage.getListing(driver));
	}
	
	public static void navigateToFreeListingPage(WebDriver driver) {
		BasePage.getFreeListing(driver).click();
	}
	
	public static String getTitleOfFreeListingPage(WebDriver driver) {
		return (driver.getTitle());
	}
	
	public static void navigateBackToHomePageFromFreeListingPage(WebDriver driver) {
		FreeListingPage.getFreeListingBtnToHome(driver).click();
	}

	public static void companyName(WebDriver driver, String readExcelData) {
		
		FreeListingPage.getCompanyName(driver).sendKeys(readExcelData);
		
	}

	public static void firstName(WebDriver driver, String readExcelData) {
		
		FreeListingPage.getFirstName(driver).sendKeys(readExcelData);
	}
	
	public static void lastName(WebDriver driver, String readExcelData) {
		
		FreeListingPage.getLastName(driver).sendKeys(readExcelData);
	}

	public static void mobileNumber(WebDriver driver, String readExcelData) {
		
		FreeListingPage.getMobileNumber(driver).sendKeys(readExcelData);
	}

	public static void landlineNumber(WebDriver driver, String readExcelData) {
		
		FreeListingPage.getLandLineNumber(driver).sendKeys(readExcelData);
	}
	public static String freeListingMsg() {
		return "Successfully navigated to FreeListing page";
	}
	
	public static void formSubmit(WebDriver driver) {
		
		
		FreeListingPage.submit(driver).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String errorMessage = FreeListingPage.getErrorMessage(driver).getText();
		System.out.println("The error message is: " + errorMessage);
		FreeListingOutputExcel.WriteToExcel(errorMessage);
	}
	
	public static String urlAfterSubmit(WebDriver driver) {
		return driver.getCurrentUrl();
	}

}
