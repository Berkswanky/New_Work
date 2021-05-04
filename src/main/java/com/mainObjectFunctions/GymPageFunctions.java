package com.mainObjectFunctions;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mainObjectRepository.GymPage;
import com.utils.GymOutputExcel;

public class GymPageFunctions {

	public static WebDriverWait wait;
	public static JavascriptExecutor jse;
	public static PrintStream outputFile;

	public static void searchReults(WebDriver driver) {

		List<WebElement> items = GymPage.getItems(driver);
		int totalItems = items.size();
		List<String> options = new ArrayList<String>();

		for (int i = 0; i < totalItems; i++) {

			String item = items.get(i).getText();
			System.out.println(item);

			options.add(item);
			// System.out.println(options);

		}
		try {
			GymOutputExcel.WriteToExcel(options);
		} catch (Exception e) {
			System.out.println();
		}
//		
	}

	public static void toHomePage(WebDriver driver) {

		driver.navigate().back();
		driver.navigate().back();
	}
}
