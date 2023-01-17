package com.umer.findpair;

public class FindingPairService {

	private static final String NO_SOLUTION_FOUND = "No solution found";

	/**
	 * Write a program to find all pairs of integers whose sum is equal to a given
	 * number.
	 * 
	 * Examples
	 * 
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
	 * nums[1] == 9, we return [0, 1]
	 * 
	 * 
	 * Input: nums = [3,2,4], target = 6 Output: [1,2]
	 * 
	 * @param inputOfNumbers the array of numbers to search through.
	 * @param numberToFind   The number which should the sum of two numbers.
	 * @return The indices of the numbers in the array. If no pairs is found, then
	 *         an IllegalArgumentException is thrown which says "No solution found".
	 */
	public int[] twoSum(int[] inputOfNumbers, int numberToFind) {
		for (int firstIndex = 0; firstIndex < inputOfNumbers.length; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < inputOfNumbers.length; secondIndex++) {
				if (inputOfNumbers[firstIndex] + inputOfNumbers[secondIndex] == numberToFind) {
					return new int[] { firstIndex, secondIndex };
				}
			}
		}
		throw new IllegalArgumentException(NO_SOLUTION_FOUND);
	}

}
