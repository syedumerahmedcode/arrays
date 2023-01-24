package com.umer.sumdiagonal;

public class SumOfDiagonalElementsService {

	/**
	 * Given 2D array calculate the sum of diagonal elements.
	 * 
	 * Example
	 * 
	 * myArray2D= {{1,2,3},{4,5,6},{7,8,9}};  
	 * 
	 * sumDiagonal(myArray2D) # 15
	 * 
	 * @param inputArray
	 * @return
	 */
	public int sumDiagonal(int[][] inputArray) {
		int sum = 0;
		for (int index = 0; index < inputArray.length; index++) {
			sum += inputArray[index][index];
		}
		return sum;
	}

}
