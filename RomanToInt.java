package homework_d1;

import java.util.Scanner;

public class RomanToInt {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Roman number: ");
		String romainCharacter = scanner.nextLine();

		System.out.println("Result: " + romanToInt(romainCharacter));

	}

	// Time complexity: O(1)
	public static int translateCharacter(char character) {
		switch (character) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

	
	// Time complexity: O(n) => n = the length of input "string"
	public static int romanToInt(String string) {
		int sum = 0;
		int currentCharacter = translateCharacter(string.charAt(0));

		for (int i = 1; i < string.length(); i++) {
			int nextCharacter = translateCharacter(string.charAt(i));

			if (currentCharacter < nextCharacter) {
				sum -= currentCharacter;	// smaller before larger: subtract (-) smaller
			} else {
				sum += currentCharacter;	// largest to smallest: add (+) them up
			}

			currentCharacter = nextCharacter;
		}

		sum += currentCharacter;

		return sum;
	}
}
