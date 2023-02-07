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
	 * @param arr
	 * @return
	 */
	public int[] removeDuplicatesForSortedElements(int[] arr) {
		// https://www.geeksforgeeks.org/java-program-to-remove-duplicate-elements-from-the-array/
		int result = removeDuplicates(arr, arr.length);
		int[] newArray = new int[result];
		// Here, we loop through input array again but we only go till the length as
		// indicated by the place holder from the helper method.
		for (int i = 0; i < result; i++) {
			newArray[i] = arr[i];
		}
		return newArray;
	}

	private int removeDuplicates(int[] a, int n) {

		// If n is 0 or 1 then return n as this is a boundary condition.
		if (n == 0 || n == 1) {
			return n;
		}
		// Here j will act as a place holder for how many distinct elements are present
		// in the array.
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			// While looping through all the elements, we check if current element is
			// different from next element
			// If yes, we add it at the place holder location and increment the place holder
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		// Finally, we capture the last element.
		a[j++] = a[n - 1];
		// return the place holder
		return j;
	}

	public void removeDuplicatesFromUnsortedArray(int[] a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		// adding elements to LinkedHashSet
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);

		// Print the elements of LinkedHashSet   
		System.out.print("Filtered array which does not contain any dupliacte elements: "+set);

	}
}
