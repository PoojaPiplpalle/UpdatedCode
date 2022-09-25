package Java;

import java.util.Scanner;

public class pallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String a="waw waw waw";
		System.out.println(a.length());
	String org_str=a;
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
				rev=rev+a.charAt(i);
	}
		System.out.println(rev);
		if(org_str.equals(rev)) {
			
			System.out.println("Pallindrome");
		}
		else {
			
			System.out.println("Not");
		}
	}


}
