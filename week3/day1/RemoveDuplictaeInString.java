package week3.day1;

public class RemoveDuplictaeInString {
	
	 public static void main(String[] args) {
	        String text = "We learn Java basics as part of java sessions in java week1";

	        String[] words = text.split(" "); // Split the text into words

	     // Remove duplicate by replacing it with empty
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].equalsIgnoreCase(words[j])) {
	                    words[j] = ""; 
	                }
	            }
	        }

	        // Print the result
	        System.out.println("Result after removing duplicates:");
	        for (String word : words) {
	            if (!word.equals("")) {
	                System.out.print(word + " ");
	            }
	        }
	    }
}
