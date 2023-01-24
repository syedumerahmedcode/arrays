package com.umer.middlefunction;

import java.util.Arrays;

public class MiddleFunctionService {

	/**
	 * Write a function called middle that takes a list and returns a new list that
	 * contains all but the first and last elements.
	 * 
	 * myArray = [1, 2, 3, 4] middle(myArray) # [2,3]
	 * 
	 * @param arr
	 * @return
	 */
	public int[] middle(int[] arr) {
		return Arrays.copyOfRange(arr, 1, arr.length - 1);
	}

}
