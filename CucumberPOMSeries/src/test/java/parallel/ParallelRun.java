package parallel;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/parallel"},
		glue = {"parallel"},//this parallel is the package name since stepdef file and applicationhook file is present in it.
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				}
		//"timeline:test-output-thread/"--Using this we will be able to see how many thread were participated in parallel execution and thread count u can see in test-output-thread folder in index.html report which is created by adding "timeline:test-output-thread/" plugin 
		//check in the screeshott which  have taken from window.
		)

public class ParallelRun extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)//This parallel annotation means all the scenarios will be executed in parallel mode with the help of data provider 
	public Object[][] scenarios(){
		
		return super.scenarios();
		//This method will return a two dimensional object array of all  the scenario
	}
}
