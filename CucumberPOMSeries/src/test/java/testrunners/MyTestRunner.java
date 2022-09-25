package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/test/resources/AppFeatures"},
		features = {"src/test/resources/parallel"},
		//glue = {"stepdefinitions", "appshooks"},--When stepdef files and hooks files are present in these folder
				glue = {"parallel"},
		
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				}
		//"timeline:test-output-thread/"--Using this we will be able to see how many thread were participated in parallel execution and thread count u can see in test-output-thread folder in index.html report which is created by adding "timeline:test-output-thread/" plugin 
		//check in the screeshott which  have taken from window.
		)

public class MyTestRunner {

}
