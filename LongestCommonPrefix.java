package homework_d1;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] words = { "flower", "flow", "flight" };
		String[] words2 = { "dog", "racecar", "car" };

		System.out.println(longestCommonPrefix(words));

	}


	public static String longestCommonPrefix(String[] string) {
		
		if (string.length == 0 || string == null) { 
			return "";
		}
		
		Arrays.sort(string); // not sure about bigO of this function sort?! depends on the number of string in the array??? O(n)????
		
		String first = string[0];
		String last = string[string.length - 1];

		// Variable to keep track of the length of the common prefix
		int index = 0;

		while (index < first.length() && index < last.length()) {
			
			//If the characters at the current index are the same for both strings, index++.
			if (first.charAt(index) == last.charAt(index)) { 
				index++;
			} else {
				break;
			}
		}
		
		// return a substring of the first string up to 'index'.
		return first.substring(0, index);
	}

}
