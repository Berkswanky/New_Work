package com.utils;

/* ********************************************************
 *TO CREATE THE PASS EXTENT REPORT FOR ALL TEST CASES
 * ********************************************************
 **/
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportFile {

public static ExtentReports report;
	
	//GENERATE THE PASS EXTENT REPORT
	public static ExtentReports getReportInstance() {

		//if (report == null) {

			String reportName = DateUtils.getTimeStamp() + ".html";
			//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./TestReport/extent" + reportName);
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"//TestReport//" + reportName);
			report = new ExtentReports();
			report.attachReporter(htmlReporter);
		//}

		return report;
	}
}
