package com.mainObjectFunctions;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mainObjectRepository.CarWashPage;
import com.utils.CarWashExcel;

public class CarWashFunctions {

	public static WebDriverWait wait;
	public static JavascriptExecutor jse;
	public static PrintStream outputFile;

	public static String getTitle(WebDriver driver) {
		return (driver.getTitle());
	}

	/***********************************
	 * Cancel the Section Window Tag
	 *****************************************/
	public static void clickTheCancel(WebDriver driver) {

		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//section[@id='best_deal_div']"))));
		CarWashPage.getCancelBtn(driver).click();
		;

	}

	/***********************************
	 * Get all the Company Names and Phone numbers
	 *****************************************/
	public static void searchReults(WebDriver driver) {

		List<Double> ratingList = new ArrayList<>();
		List<Integer> voteList = new ArrayList<>();
		List<String> nameList = new ArrayList<>();
		List<String> phoneNumbers = new ArrayList<>();

		List<WebElement> ratings = null;
		List<WebElement> votes = null;
		List<WebElement> names = null;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			long lastHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();

			while (true) {
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
				ratings = CarWashPage.getComapanyRating(driver);
				votes = CarWashPage.getComapanyVotes(driver);
				names = CarWashPage.getCompanyNames(driver);

				Thread.sleep(3000);

				long newHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
				if (newHeight == lastHeight) {
					break;
				}
				lastHeight = newHeight;

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int k = 1;
		for (int i = 0; i < ratings.size(); i++) {
			double rating = Double.parseDouble(ratings.get(i).getText());
			String split[] = votes.get(k).getText().split(" ");
			int vote = Integer.parseInt(split[0]);
			k = k + 2;
			if (rating > 4.0 && vote > 20) {
				ratingList.add(rating);
				nameList.add(names.get(i).getText());
				voteList.add(vote);
				String phoneNumber = CarWashPage.phoneNumberScrapper(
						driver.findElements(By.xpath("//ul[@class='rsl col-md-12 padding0']/li[@class='cntanr']" + "["
								+ (i + 1) + "]" + "//p[@class='contact-info ']//span//span")));

				phoneNumbers.add(phoneNumber);
			}
		}
		int n = 0;
		if (ratingList.size() > 5) {
			n = 5;
		} else {
			n = ratingList.size();
		}

		String str[] = new String[n];
		String phone[] = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = nameList.get(i);
			phone[i] = phoneNumbers.get(i);
			
			System.out.println(nameList.get(i) + "     " + phoneNumbers.get(i));
			System.out.println();

		}
		for (int i = 0; i < n; i++) {
			str[i] = nameList.get(i);
			phone[i] = phoneNumbers.get(i);
			CarWashExcel.WriteToExcel(str, phone, n);

		}

	}

	/***********************************
	 * Navigate to the Main page
	 *****************************************/
	public static void goBack(WebDriver driver) {

		driver.navigate().back();
		driver.navigate().back();
	}
}
