package HashMapConcept;

import java.util.HashMap;

public class FreecrmData {
public static HashMap<String, String> getUserLoginInfo() {
	HashMap<String,String> userMap=new HashMap<String,String>();
	userMap.put("Costumer", "Poojaranip14@gmail.com_Premamadhav1@");//value is user name and password so seperated by ":"
	userMap.put("admin", "Arpit@gmail.com_krishna123");
	
	return userMap;
}
public static HashMap<Integer, String> monthmap() {
	HashMap<Integer,String> MonthMap=new HashMap<Integer,String>();
	MonthMap.put(1, "Month");
	MonthMap.put(2, "Jan");
	MonthMap.put(3, "Feb");
	MonthMap.put(4, "Mar");
	MonthMap.put(5, "Apr");
	return MonthMap;
}

}
