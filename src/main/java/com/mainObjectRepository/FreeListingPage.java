package com.mainObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FreeListingPage {

	public static By Listing = By.xpath("//a[@class='button' and @id = 'h_flist']");
	public static By CompanyName = By.xpath("//input[@id='fcom' and @type='text']");
	public static By FirstName = By.xpath("//input[@class='jd_rule' and @placeholder = 'First Name']");
	public static By LastName = By.xpath("//input[@id='lname' and @placeholder = 'Last Name']");
	public static By MobileNumber = By.xpath("//input[@class='flmi jd_rule' and @placeholder='Mobile No']");
	public static By LandlineNumber = By.xpath("//input[@class='fli jd_rule lndlninpt' and @placeholder= 'Landline Number']");
	public static By Submit = By.xpath("//button[@class='bbtn subbtn' and text()='Submit']");
	public static By Error = By.xpath("//*[@id=\"fmb0Err\"]");
	public static By freeListingBtnToHome=By.xpath("//span[@class='lgnjdhdr']");
	
	
	public static WebElement getListing(WebDriver driver) {
		
		return driver.findElement(Listing);
	}

	public static WebElement getCompanyName(WebDriver driver) {
		
		return driver.findElement(CompanyName);
	}

	public static WebElement getFirstName(WebDriver driver) {
	
		return driver.findElement(FirstName);
	}

	public static WebElement getLastName(WebDriver driver) {
		
		return driver.findElement(LastName);
	}
	
	public static WebElement getMobileNumber(WebDriver driver) {
		
		return driver.findElement(MobileNumber);
	}

	public static WebElement getLandLineNumber(WebDriver driver) {
		
		return driver.findElement(LandlineNumber);
	}

	public static WebElement submit(WebDriver driver) {
		
		return driver.findElement(Submit);
	}
	
	public static WebElement getErrorMessage(WebDriver driver) {
		
		return driver.findElement(Error);
	}
	
	public static WebElement getFreeListingBtnToHome(WebDriver driver) {
		return driver.findElement(freeListingBtnToHome);
	}
	
}
