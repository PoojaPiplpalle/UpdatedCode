package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

//if we want to check how many testcase gets faled at runtime and by implemeting this we dont need to add retryAnalyzer to each testcase.
public class MyTransformer implements IAnnotationTransformer {

	
	public void transform(ITestAnnotation annotation,Class testclass,Constructor testconstrutor,Method testmethod) {
	//in this particular method we have to tell where exactly RetryAnalyzer
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
		
	}
}

//now Rytclick on Project and create testng.xml file and there add litenser class.
//1.First create MyTests1 class contains all test cases which we want to faiil after 3 retrial.
//2.Create RetryAnalyzer which implements IRetryAnalyzer whch overide retry method which contains logic.
//3.Create MyTransformer classs which implemets IAnnotationTransformer ovveride transform() method through annotation we are proving where exactly are RetryAnalyzer class.
//4.Create testng.xml and add listner class and give path MyTransformer class becoz listener is present here in the class.
//So if we have 100 tcs out of 100 70 got passes and 30 got failed so MyTransformer listener read these 30 testcases at runtime and listener will call transform() Method and then will go to RetryAnalyzer class check the limit so for each testcases which got failed will execute 3 times