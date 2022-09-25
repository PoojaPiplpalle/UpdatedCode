package Java;

import java.util.HashSet;
import java.util.Set;

public class stringduplicatelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name[]= {"java","c","java"};
Set<String> store=new HashSet<String>();

for(String names:name) {
	if(store.add(names)==false)
	{
		
		System.out.println("duplicate element is "+names);
	}
	
	
}
	}

}
