package week3.day1;

import java.util.Arrays;

public class Anagram {
	
        public static void main(String[] args) {
  		
		//Assigning strings
		String text1= "stops";
		String text2="potss";
		
	   //condition to check the length of both strings
		if (text1.length()==text2.length()) { 
		
		//Converting string to char array
		char[] charArray= text1.toCharArray();
		char[] charArray1= text2.toCharArray();
		
		//sorting the array
		Arrays.sort(charArray1);
		Arrays.sort(charArray);

		//printing the sorted character array
		System.out.println("after sorting name1: "+Arrays.toString(charArray));
		System.out.println("after sorting name1: "+Arrays.toString(charArray1));
		
		if (Arrays.equals(charArray, charArray1)) {
			System.out.println("The given strings are anagram");
		} 
		else {
			System.out.println("The given strings are not an Anagram");
			

		}
		
	}
	}
}
