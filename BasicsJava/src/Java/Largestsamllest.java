package Java;

import java.util.Arrays;

public class Largestsamllest {

	public static void main(String[] args) {
		int number[]= {1,2,3,4,5};
		int largest=number[0];
		int smallest=number[0];
		for (int i=1;i<number.length;i++) {
			if(number[i]>largest) {
				
				largest=number[i];
			}
			else if(number[i]<smallest) {
				
				smallest=number[i];
			}
			
		}
		System.out.println("elements are:"+Arrays.toString(number));
		System.out.println("largest:"+largest);
		System.out.println("smallest:"+smallest);
	}

}
