import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Sampletest {

	 @Test
	 public void test1() throws IOException {
		datadriven d= new datadriven();
		ArrayList<String> data=d.getData("purchase");
	
		//System.out.println(data.get(0));
		String firstname=data.get(1);
		//System.out.println(firstname);
		String lastname=data.get(2);
		//System.out.println(lastname);
		String DOB=data.get(3);
		//System.out.println(DOB);
		
		test(firstname,lastname,DOB);

	 }
	
	public static void test(String firstname,String lastname,String Dob) {
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(Dob);
	} 
		
		
	
	
}



