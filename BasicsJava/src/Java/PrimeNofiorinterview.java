package Java;

public class PrimeNofiorinterview {

	
	public static boolean isprimeNo(int num) {
		
		if(num<=1) {
			return false;
		}
		
	
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			return false;
			
		}
		
		
	}
	return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(PrimeNofiorinterview.isprimeNo(4));
	}

}
