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
	public static String takePassSnapShotBasicFunctionality(String name, WebDriver driver) {
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File destFile = new File(
				System.getProperty("user.dir") + "\\PassScreenShotsBasicFunctionality\\" + name+ DateUtils.getTimeStamp() + ".png");
		try { 
			//copy the screenshot to desired location using copyFile method
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return destFile.getPath();
		
	}
	
	
	public static String takePassSnapShotCarWash(String name,WebDriver driver) {
		{
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File destFile = new File(
					System.getProperty("user.dir") + "\\PassScreenShotsCarWash\\" + name+ DateUtils.getTimeStamp() + ".png");
			try { 
				//copy the screenshot to desired location using copyFile method
				FileUtils.copyFile(sourceFile, destFile);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			return destFile.getPath();
		
		}
	}
	
	public static String takePassSnapShotFreeListing(String name,WebDriver driver) {
		{
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File destFile = new File(
					System.getProperty("user.dir") + "\\PassScreenShotsFreeListing\\" + name+ DateUtils.getTimeStamp() + ".png");
			try { 
				//copy the screenshot to desired location using copyFile method
				FileUtils.copyFile(sourceFile, destFile);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			return destFile.getPath();
		
		}
	}
	
	public static String takePassSnapShotGym(String name,WebDriver driver) {
		{
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File destFile = new File(
					System.getProperty("user.dir") + "\\PassScreenShotsGym\\" +name+ DateUtils.getTimeStamp() + ".png");
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

