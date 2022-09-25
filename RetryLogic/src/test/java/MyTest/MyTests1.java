package MyTest;


import org.testng.Assert;
import org.testng.annotations.Test;

//If want to execute at runtime then add listener class in Testng.xml file and there in claass give the location
public class MyTests1 {
@Test
public void test1() {
	Assert.assertEquals(false, true);
	
}
@Test
public void test2() {
	
	Assert.assertEquals(false, true);
}

@Test
public void test3()
{
	Assert.assertEquals(true, true);	
}
}