package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {//IRetryAnalyzer is interface which is coming from testng	
int counter=0;
int Retrylimit=3;// how many time my fail test case will execute means giving threee chances.

//we have one method retry method which we have to override from IRetryAnalyzer.
public boolean retry(ITestResult result) {//ITestResult interface is there and ref is result

if(counter<Retrylimit) {
	
	counter++;
	return true;
}
return false;
}
}

