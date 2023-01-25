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
		// If we were to only solve it using arrays, then we need to loop through the entire array once and store highest and second highest numbers in two variables.
		// However, since we do not have any restrictions on using other classes, we are using Collections class.
		
		// First we create a duplicate of the input array.
		Integer[] arr = inputArray;
		
		// Next, we sort the array in descending order.
		Arrays.sort(arr, Collections.reverseOrder());
		
		// Now, because the array is sorted in descending order, the first element in the array is the biggest number. 
		int first = arr[0];
		
		// Second number is initialized to null. Why? Because the input array can contain duplicates so we cannot just blindly take the value at index 1.
		Integer second = null;
		
		// We iterate through the length of the array and look out for first number which is different from the first number.
		// Since, the array is sorted in descending order ... to be continued.
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != first) {
				second = arr[index];
				break;
			}
		}
		return first + " " + second;
	}
}
