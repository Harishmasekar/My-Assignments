package week3.day1;

public class ReverseOddWordsInString {
	
	
	  public static void main(String[] args) {
	        String test = "I am a software tester";

	        // Split the words into an array
	        String[] words = test.split(" ");

	        // Loop through the array
	        for (int i = 0; i < words.length; i++) {
	            if (i % 2 != 0) {  // If index is odd
	                
	            	
	        // Convert word to character array and reverse it
	        char[] chars = words[i].toCharArray();
	        for (int j = chars.length - 1; j >= 0; j--) {
	        System.out.print(chars[j]);
	                }
	            } else {
	                
	        // Even index word remains same
	         System.out.print(words[i]);
	            }
	            System.out.print(" "); // Add space after each word
	        }
	    }

}
