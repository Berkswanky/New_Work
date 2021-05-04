package com.mainObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SocialPage {
	
	public static By socialBtnToHome=By.xpath("//i[@class='sclsprt newjdlogo']");
	
	public static WebElement getSocialBtnToHome(WebDriver driver) {
		return driver.findElement(socialBtnToHome);
	}
	

}
