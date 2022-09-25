package Java;

public class StaticJavaCode {
int id;
String name;
static String clgnme="JSPM";

public StaticJavaCode(int i,String n){
	id=i;
	name=n;
	
}

void display() {
	
	System.out.println(id+""+name+""+clgnme);
}
}
