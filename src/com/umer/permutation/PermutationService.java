package com.umer.permutation;

public class PermutationService {
	/**
	 * our are given two integer arrays. Write a program to check if they are
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
	 * @param array1
	 * @param array2
	 * @return
	 */
	public boolean permutation(int[] array1, int[] array2) {
		// Check if the length is same or not. If there are not of equal length, then
		// the arrays are not permutations of each other.
		if (array1.length != array2.length) {
			return false;
		}
		// Here, we check if the sum and the product of the arrays are same or not.
		// If both of these values are equal, then the given arrays are permuations of
		// each other.

		int sum1 = 0;
		int sum2 = 0;
		int product1 = 1;
		int product2 = 1;

		for (int i = 0; i < array2.length; i++) {
			sum1 += array1[i];
			sum2 += array2[i];

			product1 *= array1[i];
			product2 *= array2[i];
		}
		if (sum1 == sum2 && product1 == product2) {
			return true;
		} else {
			return false;
		}
	}
}
