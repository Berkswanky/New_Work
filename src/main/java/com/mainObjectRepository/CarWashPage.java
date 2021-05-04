package com.mainObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CarWashPage {
	
	public static By CompanyRatings = By.xpath("//span[@class='green-box']");
	public static By CompanyVotes = By.xpath("//span[@class='rt_count lng_vote']");
	public static By CompanyNames = By.xpath("//span[@class='lng_cont_name']");
	public static By Ratings = By.xpath("//a[@class=' ']");
	public static By cancelbtn = By.xpath("//section[@id='best_deal_div']//section[@class='jpbg']//span[@class='jcl'][contains(text(),'X')]");
	
	
	public static List<WebElement> getComapanyRating(WebDriver driver) {
		
		return driver.findElements(CompanyRatings);
	}

	public static List<WebElement> getComapanyVotes(WebDriver driver) {

		return driver.findElements(CompanyVotes);
	}

	public static List<WebElement> getCompanyNames(WebDriver driver) {

		return driver.findElements(CompanyNames);
	}
	

	public static WebElement getRating(WebDriver driver) {

		return driver.findElement(Ratings);
	} 	
	
	public static WebElement getCancelBtn(WebDriver driver) {
		return driver.findElement(cancelbtn);
		
	}
	
/*********************************** Phone Number Scrapper *****************************************/
	public static String phoneNumberScrapper(List<WebElement> webElements) {
		StringBuffer stb = new StringBuffer();
		for (WebElement element : webElements) {
			String s[] = element.getAttribute("class").split("-");
			switch (s[1]) {
			case "dc":
				stb.append("+");
				break;
			case "fe":
				stb.append("(");
				break;
			case "hg":
				stb.append(")");
				break;
			case "ba":
				stb.append("-");
				break;
			case "acb":
				stb.append("0");
				break;
			case "yz":
				stb.append("1");
				break;
			case "wx":
				stb.append("2");
				break;
			case "vu":
				stb.append("3");
				break;
			case "ts":
				stb.append("4");
				break;
			case "rq":
				stb.append("5");
				break;
			case "po":
				stb.append("6");
				break;
			case "nm":
				stb.append("7");
				break;
			case "lk":
				stb.append("8");
				break;
			case "ji":
				stb.append("9");
				break;
			default:
				stb.append("x");
				break;
			}
		}
		return stb.toString();
	}
}
