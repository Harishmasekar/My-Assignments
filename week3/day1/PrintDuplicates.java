package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

	  // Define array with duplicates
    int[] num = {2, 5, 7, 7, 5, 9, 2, 3};


    public static void main(String[] args) {
    	
        // Create object of PrintDuplicates to access array
        PrintDuplicates pd = new PrintDuplicates();
        int[] numbers = pd.num;

        // Sort the array
        Arrays.sort(numbers);
        System.out.println("Duplicate values in the array:");

        // Iterate through array and find duplicates
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
            	
        // To avoid printing same duplicate multiple times
                if (i == 0 || numbers[i] != numbers[i - 1]) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
