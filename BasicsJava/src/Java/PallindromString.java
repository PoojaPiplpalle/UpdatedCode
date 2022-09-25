package Java;

import java.util.Scanner;

public class PallindromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String org=str;
		String rev="";
		int length=str.length();
for(int i=length-1;i>=0;i--) {
	
	rev=rev+str.charAt(i); 
}
System.out.println(rev);
	
if(str.equals(rev)) {
System.out.println("pallidrpme");	
}
else {
	System.out.println("not pallindroe");	
	
}
}
}
