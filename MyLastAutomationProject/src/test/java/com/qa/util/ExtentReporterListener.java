package com.qa.util;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporterListener implements IReporter {
	private ExtentReports extent;

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {
		extent = new ExtentReports(outputDirectory + File.separator
				+ "Extent.html", true);

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
			}
		}

		extent.flush();
		extent.close();
	}

	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());

				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
				} else {
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				}

				extent.endTest(test);
			}
		}
	}

	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
}
//This listener will create an ExtentReports report called ExtentReportTestNG.html in the default TestNG output folder test-output. This report lists all passed tests, then all failed tests and finally all tests that were skipped during execution. There’s no need to add specific ExtentReports log statements to your tests.
//Listener is defined as interface that modifies the default TestNG's behavior. As the name suggests Listeners "listen" to the event defined in the selenium script and behave accordingly. It is used in selenium by implementing Listeners Interface. It allows customizing TestNG reports or logs. There are many types of TestNG listeners available.
//Types of Listeners in TestNG
/*There are many types of listeners which allows you to change the TestNG's behavior.

Below are the few TestNG listeners:

IAnnotationTransformer ,
IAnnotationTransformer2 ,
IConfigurable ,
IConfigurationListener ,
IExecutionListener,
IHookable ,
IInvokedMethodListener ,
IInvokedMethodListener2 ,
IMethodInterceptor ,
IReporter,
ISuiteListener,
ITestListener .
Above Interface are called TestNG Listeners. These interfaces are used in selenium to generate logs or customize the TestNG reports.

In this tutorial, we will implement the ITestListener.

ITestListener has following methods

OnStart- OnStart method is called when any Test starts.
onTestSuccess- onTestSuccess method is called on the success of any Test.
onTestFailure- onTestFailure method is called on the failure of any Test.
onTestSkipped- onTestSkipped method is called on skipped of any Test.
onTestFailedButWithinSuccessPercentage- method is called each time Test fails but is within success percentage.
onFinish- onFinish method is called after all Tests are executed.*/