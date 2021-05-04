package com.mainObjectFunctions;

import org.openqa.selenium.WebDriver;

import com.mainObjectRepository.BasePage;
import com.mainObjectRepository.SocialPage;

public class SocialPageFunctions {
	
	public static void navigateToSocial(WebDriver driver) {
		BasePage.getSocialBtn(driver).click();
	}
	
	public static String getTitleOfSocial(WebDriver driver) {
		return (driver.getTitle());
	}
	
	public static void navigateBackToHomePageFromSocial(WebDriver driver) {
		SocialPage.getSocialBtnToHome(driver).click();
	}

}
