package practice;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	/*System.out.println("enter the number which you want to insert");
	String number = new Scanner(System.in).nextLine();
	char[] ch = number.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
	System.out.print(ch[i]);
	}*/
	 String str = "Welcome to Beginnersbook";
     String reversed = reverseString(str);
     System.out.println("The reversed string is: " + reversed);
 }

 public static String reverseString(String str)
 {
     if (str.isEmpty())
         return str;
     //Calling Function Recursively
     return reverseString(str.substring(1));

	
	
}
}
