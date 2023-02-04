package com.umer.missingnumber;

public class MissingNumberService {

	public void findMissingNumber(int[] intArray) {
		int sumFromArrayElements = 0;
		int sumUsingMathematicalNumberSeriesFormula = 0;
		for (int i : intArray) {
			sumFromArrayElements += i;
		}
		int numberOfElements = intArray.length + 1;

		/*
		 * 
		 * Mathematical formula: Sum of number series from 1,2,3,4,..., (n-2),(n-1),n
		 * =>n*(n+1)/2
		 * 
		 */

		sumUsingMathematicalNumberSeriesFormula = numberOfElements * (numberOfElements + 1) / 2;
		int difference = sumUsingMathematicalNumberSeriesFormula - sumFromArrayElements;
		System.out.println("Missing number is " + difference);

	}

	/**
	 * Write a function to find the missing number in a given integer array of 1 to
	 * 100.
	 * 
	 * Example
	 * 
	 * myArray = {1,2,3,4,6} missingNumber(myArray, 6) // 5
	 * 
	 * @param inputArray
	 * @param totalCount
	 * @return
	 */
	public int findMissingNumber(int[] inputArray, int totalCount) {
		int expectedSum = 0;
		int actualSum = 0;
		for (int i = 0; i <= totalCount; i++) {
			expectedSum += i;
		}
		for (int i = 0; i < inputArray.length; i++) {
			actualSum += inputArray[i];
		}
		System.out.println(expectedSum);

		return expectedSum - actualSum;
	}

}
