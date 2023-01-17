package com.umer.findpair;

public class FindingPairService {

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
	 * @param nums   the array of numbers to search through.
	 * @param target The number which should the sum of two numbers.
	 * @return The indices of the numbers in the array. If no pairs is found, then
	 *         an IllegalArgumentException is thrown which says "No solution found".
	 */
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No solution found");
	}

}
