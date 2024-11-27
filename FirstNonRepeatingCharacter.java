package Test;

import java.util.LinkedHashMap;
import java.util.Map;

	public class FirstNonRepeatingCharacter {
	    public static char findFirstNonRepeatingCharacter(String str) {
	        // Create a LinkedHashMap to store characters and their counts
	        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

	        // Iterate through the string and count occurrences of each character
	        for (char ch : str.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }

	        // Find the first character with a count of 1
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() == 1) {
	                return entry.getKey();
	            }
	        }

	        // Return a placeholder if no non-repeating character is found
	        return '\0'; // null character
	    }

	    public static void main(String[] args) {
	        String input = "swiss";
	        char result = findFirstNonRepeatingCharacter(input);

	        if (result != '\0') {
	            System.out.println("The first non-repeating character is: " + result);
	        } else {
	            System.out.println("No non-repeating character found.");
	        }
	    }
	}


