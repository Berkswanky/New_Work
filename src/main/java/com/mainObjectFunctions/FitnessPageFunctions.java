package com.mainObjectFunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mainObjectRepository.FitnessPage;


public class FitnessPageFunctions {

	public static void clickGymLink(WebDriver driver) {
		
		WebDriverWait wait;
		JavascriptExecutor jse;
		
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(FitnessPage.getGym(driver)));
		jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", FitnessPage.getGym(driver));
	}

}
