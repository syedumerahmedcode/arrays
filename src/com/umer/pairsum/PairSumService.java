package com.umer.pairsum;

public class PairSumService {
	/**
	 * Write a function to find all pairs of an integer array whose sum is equal to
	 * a given number.
	 * 
	 * Example
	 * 
	 * pairSum({2, 4, 3, 5, 6, -2, 4, 7, 8, 9},7) Output : "2:5 4:3 3:4 -2:9 "
	 * 
	 * @param inputArrayToFindPairsIn
	 * @param sumToMatch
	 * @return
	 */
	public String pairSum(int[] inputArrayToFindPairsIn, int sumToMatch) {
		String result = "";
		for (int firstIndex = 0; firstIndex < inputArrayToFindPairsIn.length; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < inputArrayToFindPairsIn.length; secondIndex++) {
				if (inputArrayToFindPairsIn[firstIndex] + inputArrayToFindPairsIn[secondIndex] == sumToMatch) {
					result += inputArrayToFindPairsIn[firstIndex] + ":" + inputArrayToFindPairsIn[secondIndex] + " ";
				}
			}
		}
		return result;
	}

}
