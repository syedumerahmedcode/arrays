package com.umer.middlefunction;

import java.util.Arrays;

public class MiddleFunctionService {

	/**
	 * Write a function called middle that takes a list and returns a new list that
	 * contains all but the first and last elements.
	 * 
	 * myArray = [1, 2, 3, 4] middle(myArray) # [2,3]
	 * 
	 * @param inputArray
	 * @return
	 */
	public int[] findMiddleOfTheArray(int[] inputArray) {
		return Arrays.copyOfRange(inputArray, 1, inputArray.length - 1);
	}

}
