package com.umer.searchinarray;

public class SearchInArrayService {

	/**
	 * Write a program to to check if an array contains a number in Java.
	 * 
	 * int[] intArray = {1,2,3,4,5,6}; searchInArray(intArray, 6); // 5
	 * 
	 * @param intArray      The input array to look through.
	 * @param valueToSearch The number to search in the array.
	 * @return 0 or positive number if the number is found. Otherwise, -1 is
	 *         returned.
	 */
	public int searchInArray(int[] intArray, int valueToSearch) {
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == valueToSearch) {
				return i;
			}
		}
		return -1;
	}
}
