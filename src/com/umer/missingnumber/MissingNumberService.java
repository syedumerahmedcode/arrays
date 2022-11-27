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

}
