package practice;

import java.util.Scanner;

public class wordCount {
	public static void wordCoun(String inputString) {
		
	}
public static void main(String[] args) {
	System.out.println("enter the desired string");
	String number=new Scanner(System.in).nextLine();
	String[] words = number.split(" ");
	for(String w:words) {
	System.out.println(w);
	}
	System.out.println("number of words in the string"+words.length);
}
}
