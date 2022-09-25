package TestngListenerConcept;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
		
	}
	
	public void onTestfailure(ITestResult result) {
		//if something is getting failed.
		System.out.println("Failed Test");
			//calling the method which is inside base class.
		failed(result.getMethod().getMethodName());
			
		
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
	
	
}
}



