package com.umer.isunique;

public class IsUniqueService {

	/**
	 * Write a program to check if an array is unique or not.
	 * 
	 * Example
	 * 
	 * int[] intArray = {1,2,3,4,5,6}; isUnique(intArray) // true
	 * 
	 * @param intArray
	 * @return
	 */
	public boolean isUnique(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i+1; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
