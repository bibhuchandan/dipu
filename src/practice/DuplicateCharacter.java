package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacter {
	static void dupcharCount(String inputString){
		char[] charCount = inputString.toCharArray();
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		for(Character c:charCount) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
	
		Set<Character> set=hm.keySet();
		for(Character ch:set) {
			if(hm.get(ch)>1) {
				System.out.println(ch+"-----"+hm.get(ch));
			}
		}
		
		
	}
public static void main(String[] args) {
	dupcharCount("this is dipu");
}
}
