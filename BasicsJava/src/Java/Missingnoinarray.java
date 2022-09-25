package Java;

public class Missingnoinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {-1,0,1,2,3,4,5};
int sum=0;
for(int i=0;i<a.length;i++) {
	
	sum=sum+a[i];//
	
	 
}
System.out.println("sum of array element:"+sum);

int sum1=0;
for (int j=-1;j<=6;j++) {
	sum1=sum1+j;
	
	
}
System.out.println(sum1);
System.out.println("missing no is :"+(sum1-sum));
	}

}
