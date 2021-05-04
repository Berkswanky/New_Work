package com.mainObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FitnessPage {

	public static By Gym = By.xpath("//span[@title='Gym']");

	public static WebElement getGym(WebDriver driver) {
		
		return driver.findElement(Gym);
	}
}
