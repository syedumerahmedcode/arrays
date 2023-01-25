package com.umer.bestscore;

import java.util.Arrays;
import java.util.Collections;

public class BestScoreService {

	/**
	 * Best Score
	 * 
	 * Given an array, write a function to get first, second best scores from the
	 * array.
	 * 
	 * Array may contain duplicates.
	 * 
	 * Example
	 * 
	 * myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0} 
	 * firstSecond(myArray) // 90 87
	 * 
	 * @param inputArray
	 * @return
	 */
	public String firstSecond(Integer[] inputArray) {
		// If we were to only solve it using arrays, then we need to loop through the
		// Entries of the array once and store highest and second highest numbers in two
		// variables.
		
		// However, since we do not have any restrictions on using other classes, we are
		// using Collections class.

		// First we create a duplicate of the input array.
		Integer[] tempArray = inputArray;

		// Next, we sort the array in descending order.
		Arrays.sort(tempArray, Collections.reverseOrder());

		// Now, because the array is sorted in descending order, the first element in
		// the array is the biggest number.
		int firstNumber = tempArray[0];

		// Second number is initialized to null. Why? Because the input array can
		// contain duplicates so we cannot just blindly take the value at index 1.
		Integer secondNumber = null;

		// We iterate through the length of the array and look out for first number
		// which is different from the first number.		
		// Since, the array is sorted in descending order, we should look for the first
		// number which is different from first number.		
		// Why? So that we can avoid duplicates.
		for (int index = 0; index < tempArray.length; index++) {
			if (tempArray[index] != firstNumber) {
				secondNumber = tempArray[index];
				// Now that we have found the second number, there is no need to loop through
				// any further and hence, we break out of the loop.
				break;
			}
		}
		// Finally, the first and second highest number is returned as a string.
		return firstNumber + " " + secondNumber;
	}
}
