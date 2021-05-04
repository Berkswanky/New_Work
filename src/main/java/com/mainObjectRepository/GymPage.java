package com.mainObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GymPage {

	public static By Items = By.xpath("//*[@id=\"mnintrnlbnr\"]/ul");
	
	public static List<WebElement> getItems(WebDriver driver) {
		
		return driver.findElements(Items);
	}
}
