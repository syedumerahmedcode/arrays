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
	 * @param myArray
	 * @param sum
	 * @return
	 */
	public String pairSum(int[] myArray, int sum) {
		String result = "";
		for (int firstIndex = 0; firstIndex < myArray.length; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < myArray.length; secondIndex++) {
				if (myArray[firstIndex] + myArray[secondIndex] == sum) {
					result += myArray[firstIndex] + ":" + myArray[secondIndex] + " ";
				}
			}
		}
		return result;
	}

}
