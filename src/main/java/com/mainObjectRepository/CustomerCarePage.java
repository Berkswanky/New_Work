package com.mainObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerCarePage {
	
	public static By customerCareBtnToHome=By.xpath("//span[@class='jdtext-icon header_sprite pl-10']");
	
	public static WebElement getCustomerCareBtnToHome(WebDriver driver) {
		return driver.findElement(customerCareBtnToHome);
	}
	

}
