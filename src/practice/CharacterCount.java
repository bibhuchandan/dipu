package practice;

import java.util.HashMap;

public class CharacterCount {
	
	public static void charCount(String inputString) {
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		char[] ch1=inputString.toCharArray();
		for(char ch:ch1) {
			if(hm.containsKey(ch)) {
			
				hm.put(ch,hm.get(ch)+1);
			}
			else {
				hm.put(ch,1);
			}
		}
		System.out.print("occurences of the character:"+hm);
		
	}
public static void main(String[] args) {
	CharacterCount.charCount("i am a bad boy");
	
	
}
}
