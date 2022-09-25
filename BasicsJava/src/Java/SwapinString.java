package Java;

public class SwapinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello";
String s1="Worlds";
s=s+s1; 
System.out.println(s);
s1=s.substring(0,s.length()-s1.length());
System.out.println(s1);
s=s.substring(s1.length());
System.out.println(s);
	}

}
