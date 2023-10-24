package homework_d1;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 2, 0, 0, 1, 2, 2, 1 }; // size 9 => O(9)

		int[] sortedArray = sortArray(numbers);

		System.out.println("Result: " + Arrays.toString(sortedArray));
	}
	
	// Time complexity O(n) => number of operations grows linearly depends on number of elements in the array numbers

	public static int[] sortArray(int[] numbers) {
		int start = 0;
		int end = numbers.length - 1;
		int index = 0;

		while (index <= end && start < end) {

			// Swap the current element with the element at the 'start' index => O(1)
			if (numbers[index] == 0) {
				numbers[index] = numbers[start];
				numbers[start] = 0;
				index++;
				start++;
				
			// Swap the current element with the element at the 'end' index  => O(1)
			} else if (numbers[index] == 2) { 
				numbers[index] = numbers[end];
				numbers[end] = 2;
				end--;
				
			} else { // O(1)
				index++; 
			}
		}
		return numbers;
	}
}
