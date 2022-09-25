package Java;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(ISPrimeno(10));
	}
public static boolean ISPrimeno(int num) {
	if(num<=1) {
		return false;
		
	}
	
if(num%2==0) {
			
			return false;
		}
		

	
	return true;	
	
}
}
