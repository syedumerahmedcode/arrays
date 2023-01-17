package com.umer.searchinarray;

public class SearchInArrayService {

	/**
	 * Write a program to to check if an array contains a number in Java.
	 * 
	 * int[] intArray = {1,2,3,4,5,6}; searchInArray(intArray, 6); // 5
	 * 
	 * @param inputOfNumbers The input array to look through.
	 * @param numberToFind   The number to search in the array.
	 * @return 0 or positive number if the number is found. Otherwise, -1 is
	 *         returned.
	 */
	public int searchInArray(int[] inputOfNumbers, int numberToFind) {
		for (int currentIndex = 0; currentIndex < inputOfNumbers.length; currentIndex++) {
			if (inputOfNumbers[currentIndex] == numberToFind) {
				return currentIndex;
			}
		}
		return -1;
	}
}
