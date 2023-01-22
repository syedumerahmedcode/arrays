package com.umer.permutation;

public class PermutationService {
	private static final int ONE = 1;
	private static final int ZERO = 0;

	/**
	 * Our method is given two integer arrays. Write a program to check if they are
	 * permutation of each other.
	 * 
	 * Example
	 * 
	 * int[] array1 = {1,2,3,4,5}; int[] array2 = {5,1,2,3,4}; permutation(array1,
	 * array2)
	 * 
	 * Output
	 * 
	 * true
	 * 
	 * @param firstArray
	 * @param secondArray
	 * @return
	 */
	public boolean permutation(int[] firstArray, int[] secondArray) {
		// Check if the length is same or not. If there are not of equal length, then
		// the arrays are not permutations of each other.
		if (firstArray.length != secondArray.length) {
			return false;
		}
		// Here, we check if the sum and the product of the arrays are same or not.
		// If both of these values are equal, then the given arrays are permutations of
		// each other.

		int sumOfFirstArray = ZERO;
		int sumOfSecondArray = ZERO;
		int productOfFirstArray = ONE;
		int productOfSecondArray = ONE;

		for (int index = 0; index < secondArray.length; index++) {
			sumOfFirstArray += firstArray[index];
			sumOfSecondArray += secondArray[index];

			productOfFirstArray *= firstArray[index];
			productOfSecondArray *= secondArray[index];
		}
		if (sumOfFirstArray == sumOfSecondArray && productOfFirstArray == productOfSecondArray) {
			return true;
		} else {
			return false;
		}
	}
}
