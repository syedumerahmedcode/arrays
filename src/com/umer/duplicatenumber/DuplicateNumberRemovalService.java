package com.umer.duplicatenumber;

import java.util.LinkedHashSet;

public class DuplicateNumberRemovalService {

	/**
	 * Write a function to find the duplicate number on given integer array.
	 * Assumption: The input array is in sorted order.
	 * 
	 * Example
	 * 
	 * removeDuplicates({1, 1, 2, 2, 3, 4, 5}) Output : [1, 2, 3, 4, 5]
	 * 
	 * @param sortedInputArray
	 * @return
	 */
	public int[] removeDuplicatesForSortedElements(int[] sortedInputArray) {
		int result = removeDuplicates(sortedInputArray, sortedInputArray.length);
		int[] newArray = new int[result];
		// Here, we loop through input array again but we only go till the length as
		// indicated by the place holder from the helper method.
		for (int i = 0; i < result; i++) {
			newArray[i] = sortedInputArray[i];
		}
		return newArray;
	}

	private int removeDuplicates(int[] sortedInputArray, int arrayLength) {

		// If array length is 0 or 1 then return n as this is a boundary condition.
		if (arrayLength == 0 || arrayLength == 1) {
			return arrayLength;
		}
		// Here placeholderForUniqueElements will act as a place holder for how many distinct elements are present
		// in the array.
		int placeholderForUniqueElements = 0;
		for (int i = 0; i < arrayLength - 1; i++) {
			// While looping through all the elements, we check if current element is
			// different from next element
			// If yes, we add it at the place holder location and increment the place holder
			if (sortedInputArray[i] != sortedInputArray[i + 1]) {
				sortedInputArray[placeholderForUniqueElements++] = sortedInputArray[i];
			}
		}
		// Finally, we capture the last element.
		sortedInputArray[placeholderForUniqueElements++] = sortedInputArray[arrayLength - 1];
		// return the place holder
		return placeholderForUniqueElements;
	}

	public void removeDuplicatesFromUnsortedArray(int[] unsortedInputArray) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		// adding elements to LinkedHashSet
		for (int index = 0; index < unsortedInputArray.length; index++)
			set.add(unsortedInputArray[index]);

		// Print the elements of LinkedHashSet   
		System.out.print("Filtered array which does not contain any dupliacte elements: "+set);

	}
}
