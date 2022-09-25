package Java;

import java.io.IOException;

public class Exampleont {

	void m() throws IOException{
		throw new IOException("Exception");
		
	}
	void n() throws IOException{
		m();
		
	}
	void k() {
	try {
		n();
		
	}
	catch(IOException e) {
		System.out.println("exception handled");
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exampleont s=new Exampleont();
		s.k();
		System.out.println("normal flow");
	}

}
