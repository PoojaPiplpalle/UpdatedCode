package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDuplicatewordsinstring("I m a stupid and stupid person person are good");
	}
public static void findDuplicatewordsinstring(String inputstring) {
	
	String []words=inputstring.split(" ");
	Map<String,Integer> wordcount=new HashMap<String,Integer>();
	for(String word:words) {
		
		if(wordcount.containsKey(word)) {
			
			wordcount.put(word, wordcount.get(word)+1);
		}
		else {
			
			wordcount.put(word, 1);//if the word is not availsbe in map
		}
		
	//	System.out.println(wordcount.get(word));
	}
	
	
	//extracting all keys of map.
	Set<String> wordsInstring=wordcount.keySet();
	
	for(String word:wordsInstring) {
		
		if(wordcount.get(word)>1)	{
			
			System.out.println(word+" "+wordcount.get(word));
		}
				
	}
}
}
