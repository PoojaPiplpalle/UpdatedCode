package Java;

public class Occurenceofsamecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Java is good";
System.out.println(s.length());
int Totalcount=s.length();
System.out.println(s.replace("a", ""));
int countafterreplacinga=s.replace("a", "").length();
int count=Totalcount-countafterreplacinga;
System.out.println(count);
	}

}
