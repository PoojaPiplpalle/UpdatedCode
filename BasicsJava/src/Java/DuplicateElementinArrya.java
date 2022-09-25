package Java;

public class DuplicateElementinArrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name[]= {"Java","Java","cat","Java"};
for(int i=0;i<name.length;i++) {
	for(int j=i+1;j<name.length;j++) {
		
	if(name[i]==name[j]) {
		System.out.println("Duplciate element:"+name[i]);
	}	
	}
	
}
	}

}
