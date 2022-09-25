package Java;

public class OccurenceofString{
	public static void main(String[] args){
		int[] a= {3,2,4,1};
		getMaxValue(a);
		getMinValue(a);
		avg(a);
		System.out.println(getMaxValue(a));	
		System.out.println(getMinValue(a));	
		System.out.println(	avg(a));	
		
		
}
	
public	static int getMaxValue(int[] number){
	int maxvalue=number[0];
	for(int i=1;i<number.length;i++) {
		
		if(number[i]>maxvalue) {
			
			maxvalue=number[i];
		}
	}
	
	return maxvalue;
		
		
	}
	public static int getMinValue(int[] number) {
		int minvalue=number[0];
		for(int i=1;i<number.length;i++) {
			if(number[i]<minvalue) {
				minvalue=number[i];
				
			}
		
		}
		return minvalue;
	}
	public static int avg(int[] no) {
		int sum=0;
		 int length = no.length;
		for(int i=0;i<length;i++) {
			sum+=no[i];
		}
		int average=sum/length;
		return average;
		}
	
	}