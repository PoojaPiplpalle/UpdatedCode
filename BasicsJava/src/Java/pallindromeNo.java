package Java;

public class pallindromeNo {
	
	public static void isPallindrime(int num)
	{
		int r=0;
		int sum=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
			
		}
		if(t==sum) {
			
			System.out.println("pallindore");
		}
		
		else {
			
			System.out.println("Not Pllaonfrp,");
		}
	}
	public static void main(String[] args) {
		isPallindrime(455);

	}

}

