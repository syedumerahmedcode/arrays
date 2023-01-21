package com.umer.isunique;

public class IsUniqueService {

	/**
	 * Write a program to check if an array is unique or not.
	 * 
	 * Example
	 * 
	 * int[] intArray = {1,2,3,4,5,6}; isUnique(intArray) // true
	 * 
	 * @param inputArrayToCheck
	 * @return
	 */
	public boolean isUnique(int[] inputArrayToCheck) {
		for (int firstIndex = 0; firstIndex < inputArrayToCheck.length; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < inputArrayToCheck.length; secondIndex++) {
				if (inputArrayToCheck[firstIndex] == inputArrayToCheck[secondIndex]) {
					return false;
				}
			}
		}
		return true;
	}
}
