package com.mainObjectFunctions;

import org.openqa.selenium.WebDriver;

import com.mainObjectRepository.BasePage;
import com.mainObjectRepository.CustomerCarePage;

public class CustomerCarePageFunction {
	
	public static void navigateToCustomerCare(WebDriver driver) {
		BasePage.getCustomerCareBtn(driver).click();
	}
	
	public static String getTitleOfCustomerCare(WebDriver driver) {
		return (driver.getTitle());
	}
	public static String customerCareMsg() {
		return "Successfully navigated to JD Customer care page";
	}
	
	public static void navigateBackToHomePageFromCustomerCare(WebDriver driver) {
		CustomerCarePage.getCustomerCareBtnToHome(driver).click();
	}

}
