package com.utils;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	
	static WebDriver driver;

	/******************* ASSIGNING THE DRIVER *******************/

	public static WebDriver getWebDriver(String bname) {
		
		Properties prop = GetPropertiesFile.getPropertiesInstance();
		String url = prop.getProperty("websiteURL");

		if (bname.equalsIgnoreCase("CHROME")) {
			// calling the setChromeDriver()
			driver = setChromeDriver();
		} else if (bname.equalsIgnoreCase("EDGE")) {
			// calling the setEdgeDriver()
			driver = setEdgeDriver();
		} else if (bname.equalsIgnoreCase("FIREFOX")) {
			// calling the setEdgeDriver()
			driver = setGeckoDriver();
		} else {
			System.out.println("Invalid Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		return driver;
	}

	/******************* SETTING THE CHROMEDRIVER *******************/

	public static WebDriver setChromeDriver() {
		// Setting the chromeDriver's path
		String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	/******************* SETTING THE EDGEDRIVER *******************/

	public static WebDriver setEdgeDriver() {
		// Setting the Driver's path
		String edgeDriverpath = System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", edgeDriverpath);
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	
	public static WebDriver setGeckoDriver() {
		String geckoDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		return driver = new FirefoxDriver();
	}


}
