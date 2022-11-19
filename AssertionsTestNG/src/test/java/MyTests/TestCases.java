package MyTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases {
	//hard Assertion:hard validation:if a hard assertion is getting failed immediately testcase will be marked as fail and test case will be terminated.
	//Soft assertion:if a Soft  assertion is getting faild:test case will be marked as passed as well as next lines will be executed
//AssertAll():to mark the testcase as failed if any softassertion is getting failed.
	@Test
public void test1() {
	SoftAssert softAssert1=new SoftAssert();
	System.out.println("Open Browser");
	//Assert.assertEquals(true, true);
	//Assert.assertEquals(false, true);//hard assertion
	//This is HardAssertion:HardAssertion is getting  failed its means next corresponding line wont be executed.
	//Immediately test case will be terminated.
	System.out.println("Enter Username");
	System.out.println("Enter Password");
	System.out.println("Click on sign in button");
	//Assert.assertEquals(false, true);////Hard Assertion
	//Assert.assertEquals(false, true);
	
	System.out.println("Validate Home Page");//after this code will terminate becoz of hard assertion.
	//Assert.assertEquals(false, true);//Hard Assertion//so putting hard assertion is wrong here 
	//becoz home page is not visible but it doesnt mean we should terminate the program.becoz of hard assertion below corresponding line will not be executed.
	
	//so for timebeing home page title is missing not an issue we should not terminate it so we should put soft assertion instead of hard assert.so for that before @Test create object of soft assert.
softAssert1.assertEquals(true, false,"Home t it  le title is missing");//soft Assert so after   validate home page is getting failed program will not get terminate
	
	//and it will print the below lines.but ideally the test case got pass but it should be failed and it should nbe marked as fail.so how to slove this problem.
	System.out.println("go to deals page");
	System.out.println("Create deals ");
	//softAssert1.assertEquals(true, false,"not able to create deal");
	System.out.println("go to contact page");
	System.out.println("Create a contact ");
	//softAssert1.assertEquals(true, false,"not able to create contact");
	
	//so to mark testcase fail if we are putting softAssert.assertEquals(true,false)
	//we need to put one line'.
softAssert1.assertAll();//All assertion will be stored in softassert object so   softAssert.assertAll(); will perform assert in softAssert object then it will check how many error are there so 3 testcase are getting failed so then it will mark testcase fail.
//so three assertion will get failed.

}
@Test
public void test2() {
	SoftAssert softAssert2=new SoftAssert();
	
	System.out.println("logout");
	//softAssert2.assertEquals(true, false,"logout failed");
	//softAssert2.assertAll();
}


}
