package com.umer.main;

import java.util.Arrays;

import com.umer.averagetemperature.AverageTemperatureService;
import com.umer.bestscore.BestScoreService;
import com.umer.findpair.FindingPairService;
import com.umer.isunique.IsUniqueService;
import com.umer.maxproduct.MaxProductService;
import com.umer.middlefunction.MiddleFunctionService;
import com.umer.missingnumber.MissingNumberService;
import com.umer.permutation.PermutationService;
import com.umer.rotatematrix.RotateMatrixService;
import com.umer.searchinarray.SearchInArrayService;
import com.umer.sumdiagonal.SumOfDiagonalElementsService;

public class Execute {

	public static void main(String[] args) {

		System.out.println("Calling Average temperature calculation service");
		AverageTemperatureService averageTemperatureService = new AverageTemperatureService();
		averageTemperatureService.calculateAverageTemperature();
		System.out.println();
		

		MissingNumberService missingNumberService = new MissingNumberService();
		int intArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51,
				52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75, 76, 77, 78,
				79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
		missingNumberService.findMissingNumber(intArray);
		
		int myArray[] = {1,2,3,4,6};
		final int actualMissingNumber = missingNumberService.findMissingNumber(myArray, 6);
		System.out.println("The missing number for the given array is: "+actualMissingNumber);

		FindingPairService findingPairService = new FindingPairService();
		int[] intArrayForPairs = { 2, 7, 11, 15 };
		final int[] result = findingPairService.twoSum(intArrayForPairs, 22);
		System.out.println(Arrays.toString(result));

		SearchInArrayService searchInArrayService = new SearchInArrayService();
		int[] intSearch = { 1, 2, 3, 4, 5, 6 };
		final int numberToFind = 6;
		int answer = searchInArrayService.searchInArray(intSearch, numberToFind);
		if (answer >= 0) {
			System.out.println("Value is found at the index of " + answer);
		} else {
			System.out.println(answer + " value is not found.");

		}

		MaxProductService maxProductService = new MaxProductService();
		int[] intMaxProductArray = { 20, 10, 30, 40, 50, 60 };
		String maxProduct = maxProductService.findMaxProduct(intMaxProductArray);
		System.out.println(maxProduct);

		IsUniqueService isUniqueService = new IsUniqueService();
		int[] intIsUniqueArray = { 20, 10, 30, 40, 50, 60 };
		System.out.println("Is the given array unique: " + isUniqueService.isUnique(intIsUniqueArray));
		int[] intIsUniqueAnotherArray = { 20, 10, 30, 40, 50, 10 };
		System.out.println("Is the given array unique: " + isUniqueService.isUnique(intIsUniqueAnotherArray));

		PermutationService permutationService = new PermutationService();
		int[] firstArray = { 1, 2, 3, 4, 5 };
		int[] secondArray = { 5, 4, 3, 2, 1 };
		boolean areArrayPermutationsOfEachOther = permutationService.permutation(firstArray, secondArray);
		System.out.println("Are given arrays permutations of each other: " + areArrayPermutationsOfEachOther);

		int[] anotherFirstArray = { 1, 2, 3, 4, 5 };
		int[] anotherSecondArray = { 7, 4, 3, 2, 1 };
		areArrayPermutationsOfEachOther = permutationService.permutation(anotherFirstArray, anotherSecondArray);
		System.out.println("Are given arrays permutations of each other: " + areArrayPermutationsOfEachOther);

		RotateMatrixService matrixService = new RotateMatrixService();
		int[][] matrixToRotate = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		if (matrixService.rotateGivenMatrixOrImage(matrixToRotate)) {
			System.out.println("The matrix OR IMAGE was rotated 90 degrees clockwise.");
			System.out.println(Arrays.deepToString(matrixToRotate));
		} else {
			System.out.println("Failed to rotate the matrix or IMAGE 90 degrees clockwise.");
		}

		MiddleFunctionService middleFunctionService = new MiddleFunctionService();
		int[] inoutArrayForMiddleFunction = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		final int[] middleOfTheArray = middleFunctionService.findMiddleOfTheArray(inoutArrayForMiddleFunction);
		System.out.println(Arrays.toString(middleOfTheArray));

		SumOfDiagonalElementsService sumOfDiagonalElementsService = new SumOfDiagonalElementsService();
		int[][] inputArrayToFindSumOfDiagonalElementsOf = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int resultingSumOfDiagonalElements = sumOfDiagonalElementsService
				.findSumOfDiagonalElements(inputArrayToFindSumOfDiagonalElementsOf);
		System.out.println("The sum of diagonal elemnts for th given nxn array is: " + resultingSumOfDiagonalElements);

		BestScoreService bestScoreService = new BestScoreService();
		Integer[] inputArrayToFindBestScores = { 84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0 };
		String firstAndSecondBestScores = bestScoreService.determineFirstAndSecondBestScore(inputArrayToFindBestScores);
		System.out.println("The first and second best scores are: " + firstAndSecondBestScores);

	}

}
