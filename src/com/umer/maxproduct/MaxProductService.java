package com.umer.maxproduct;

public class MaxProductService {

	/**
	 * How to find maximum product of two integers in the array where all elements
	 * are positive.
	 * 
	 * Example
	 * 
	 * int[] intArray = {10,20,30,40,50}; maxProduct(intArray) // (40,50)
	 * 
	 * @param inputArrayOfPositiveNumbers
	 * @return
	 * @throws Exception
	 */
	public String findMaxProduct(int[] inputArrayOfPositiveNumbers) {
		int maxProduct = 0;
		String pairWithMaximumProduct = "";
		for (int firstIndex = 0; firstIndex < inputArrayOfPositiveNumbers.length; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < inputArrayOfPositiveNumbers.length; secondIndex++) {
				final int productOfNumbersAtIndices = inputArrayOfPositiveNumbers[firstIndex]
						* inputArrayOfPositiveNumbers[secondIndex];
				if (productOfNumbersAtIndices > maxProduct) {
					maxProduct = productOfNumbersAtIndices;
					pairWithMaximumProduct = Integer.toString(inputArrayOfPositiveNumbers[firstIndex]) + ","
							+ Integer.toString(inputArrayOfPositiveNumbers[secondIndex]);
				}
			}
		}
		return pairWithMaximumProduct;
	}
}
