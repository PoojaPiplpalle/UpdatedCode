package Java;

public class stringlenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Pooja";
//System.out.println(s.length());
	String s1="Is ams gems of peron";
	System.out.println(s1.length());
	System.out.println(s1.charAt(6));
	System.out.println(s1.indexOf("am"));
	System.out.println(s1.indexOf('p'));
	System.out.println(s1.indexOf("Poojs"));
	System.out.println(s1.trim());//remove only before and after space.
	System.out.println(s1.substring(0,9));
	System.out.println(s1.replace(" ", ""));
	System.out.println(s1.indexOf('s',s1.indexOf('s',s1.indexOf('s')+1)+1));//third occurnce
	String s2="Hi";
	String s3=" "+"Rani";
	
	System.out.println(s2.concat(s3));
	
	System.out.println(s2.concat("ch"));

}
}