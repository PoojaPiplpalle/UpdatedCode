package Java;

public class Codilitypart1 {
	public void solution(int[] A, int K) {
	    // write your code in Java SE 8


		 int [] B =new int [A.length];

		    for(int l=0;K>l;K--){
		        int j=0;
		        for(int i=0;i<A.length;i++){
		            if(i==0){
		                B[j]=A[A.length-1];
		                j++;
		            }
		            else{
		                B[j]=A[i-1];
		                j++;
		            }
		        } 
		        for(int i= 0;i<A.length;i++){
		            A[i]=B[i];
		        }

		    }
		    System.out.println(B.toString());

		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Codilitypart1 s=new Codilitypart1();
		int a[]= {1,2,3,4};
		s.solution(a,1);
	}

}
