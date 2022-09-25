package Java;

public class finalixeexample {
public void finalize() {
	
	System.out.println("called");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalixeexample s=new finalixeexample();
		s=null;
		System.gc();
	}

}
