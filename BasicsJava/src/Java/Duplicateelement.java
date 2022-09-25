package Java;

import java.util.HashSet;
import java.util.Set;

public class Duplicateelement {

	public static void main(String[] args) {
		
String names[]= {"java","c","Ruby","Python","java"};
for(int i=0;i<names.length;i++) {
	
	for(int j=i+1;j<names.length;j++) {
		
		if(names[i].equals(names[j])) {
			
			System.out.println("duplicate elements is:"+names[i]);
			
		}
	}
	
	
}

Set<String> store=new HashSet<String>();//it store unique value.

for(String name:names) {
	
	
	if(store.add(name)==false) {
		
		System.out.println("duplicate elemnet:"+name);
		
		
	}
}

	}

}
