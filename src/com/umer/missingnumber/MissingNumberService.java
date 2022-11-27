package com.umer.missingnumber;

public class MissingNumberService {

	public void findMissingNumber(int[] intArray) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i : intArray) {
			sum1 += i;
		}
		int numberOfElements = intArray.length + 1;
		/*
		 * 
		 * Mathematical formula: Sum of number series from 1,2,3,4,..., (n-2),(n-1),n
		 * =>n*(n+1)/2
		 * 
		 */

		sum2 = numberOfElements * (numberOfElements + 1) / 2;
		int difference = sum2 - sum1;
		System.out.println("Missing number is " + difference);

	}

}
