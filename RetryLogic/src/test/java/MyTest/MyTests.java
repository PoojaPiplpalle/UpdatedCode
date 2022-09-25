package MyTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)//Analyzer is package
public void test1() {
	Assert.assertEquals(false, true);
	
}
@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
public void test2() {
	
	Assert.assertEquals(false, true);
}
}
//We have one more interface RetryAnnotationTransformer and it contains one method Transform() method.
//and we have to override that method.
