package com.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public static String takeSnapShot(WebDriver driver) {
		{
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File destFile = new File(
					System.getProperty("user.dir") + "\\FailScreenShot\\" + DateUtils.getTimeStamp() + ".png");
			try { 
				//copy the screenshot to desired location using copyFile method
				FileUtils.copyFile(sourceFile, destFile);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			return destFile.getPath();
		
		}
	}
	
	public static String takePassSnapShotCarWash(WebDriver driver) {
		{
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File destFile = new File(
					System.getProperty("user.dir") + "\\PassScreenShotsCarWash\\" + DateUtils.getTimeStamp() + ".png");
			try { 
				//copy the screenshot to desired location using copyFile method
				FileUtils.copyFile(sourceFile, destFile);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			return destFile.getPath();
		
		}
	}
	
	public static String takePassSnapShotFreeListing(WebDriver driver) {
		{
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File destFile = new File(
					System.getProperty("user.dir") + "\\PassScreenShotsFreeListing\\" + DateUtils.getTimeStamp() + ".png");
			try { 
				//copy the screenshot to desired location using copyFile method
				FileUtils.copyFile(sourceFile, destFile);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			return destFile.getPath();
		
		}
	}
	
	public static String takePassSnapShotGym(WebDriver driver) {
		{
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File destFile = new File(
					System.getProperty("user.dir") + "\\PassScreenShotsGym\\" + DateUtils.getTimeStamp() + ".png");
			try { 
				//copy the screenshot to desired location using copyFile method
				FileUtils.copyFile(sourceFile, destFile);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			return destFile.getPath();
		
		}
	}
}
