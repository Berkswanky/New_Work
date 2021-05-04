package com.mainObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	public static By locationBtn = By.id("city");
	public static By SearchBtn = By.id("srIconwpr");
	public static By SearchBox = By.xpath("//input[@id='srchbx']");
	public static By Fitness = By.xpath("//span[@class='hotkeys-text' and text()='Fitness']");
	public static By FreeListing = By.xpath("//a[@class='button']");
	public static By location = By.xpath("//a[@class='lng_autosg tcon'][normalize-space()='Kolkata']");
	public static By customerCareBtn=By.xpath("//a[@class='cscare ']");
	public static By socialBtn=By.xpath("//a[@class='jdscl ']");

	public static WebElement getLocationBtn(WebDriver driver) {
		return driver.findElement(locationBtn);
	}

	public static WebElement getSearchBtn(WebDriver driver) {
		return driver.findElement(SearchBtn);
	}

	public static WebElement getSearchBox(WebDriver driver) {
		return driver.findElement(SearchBox);
	}

	public static WebElement getFitness(WebDriver driver) {
		return driver.findElement(Fitness);
	}

	public static WebElement getFreeListing(WebDriver driver) {
		return driver.findElement(FreeListing);
	}

	public static WebElement chooseLocation(WebDriver driver) {
		return driver.findElement(location);
	}
	
	public static WebElement getCustomerCareBtn(WebDriver driver) {
		return driver.findElement(customerCareBtn);
	}
	
	public static WebElement getSocialBtn(WebDriver driver) {
		return driver.findElement(socialBtn);
	}
	

}
