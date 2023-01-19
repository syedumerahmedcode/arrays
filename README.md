# arrays

## Table of content

- [Introduction](#introduction)
- [When to use arrays](#when-to-use-arrays)
- [Out Of Scope](#out-of-scope)
- [Average Temperature Calculation](#average-temperature-calculation)
- [Find missing number](#find-missing-number)
- [Finding Pairs](#finding-pairs)
- [Search in array](#search-in-array)
- [Project structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Prerequisities](#prerequisities)
- [Commands](#commands)
- [Contribution](#contribution)
- [References](#references)
- [Contact Information](#contact-information)

## Introduction

- To be defined.

## When to use arrays

- To be defined.

## Out Of Scope

Since this is an beginner project in which the focus is just to learn some basic usages of an array, testing is out of scope of this project.

## Average Temperature Calculation

We write a Service called _AverageTemperatureService_ which takes number of days and the temperature on that day from the user as input and based on these values not only calculates the average temperature throughout this range but also the number of days on which the temperature recorded is above than the average temperature.

## Find missing number

We write a service called _MissingNumberService_ which takes an integer array containing a number series from _1 till n_ as input and finds out the one missing number in the series. 

It is assumed that the number series is an ascending series which starts from 1 till n but it only skips one number till n. In other words, it does not skip multiple numbers till n. 

First of all, we loop through the array using a for loop in which we calculate _sumFromArrayElements_ and _numberOfElements_. 

```java

		int sumFromArrayElements = 0;
		int sumUsingMathematicalNumberSeriesFormula = 0;
		for (int i : intArray) {
			sumFromArrayElements += i;
		}
		int numberOfElements = intArray.length + 1;

```

Next, we use the Mathematical formula: 
_Sum of number series from 1,2,3,4,..., (n-2),(n-1),n => n*(n+1)/2_
and then simply find the difference as shown below:

```java

		/*
		 * 
		 * Mathematical formula: Sum of number series from 1,2,3,4,..., (n-2),(n-1),n
		 * =>n*(n+1)/2
		 * 
		 */

		sumUsingMathematicalNumberSeriesFormula = numberOfElements * (numberOfElements + 1) / 2;
		int difference = sumUsingMathematicalNumberSeriesFormula - sumFromArrayElements;
		System.out.println("Missing number is " + difference);

```
Using this approach, we can find the one missing number in the series without having to loop through the array multiple times.  

## Finding pairs

We write a service called _FindingPairService_ which takes an integer array containing several random numbers and a target number which is equal to the sum of a pair of numbers.   

```text
* Examples
	 * 
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
	 * nums[1] == 9, we return [0, 1]
	 * 
	 * 
	 * Input: nums = [3,2,4], target = 6 Output: [1,2]
```

Here, we loop through the array from 0 till the length of the array and inside the for-loop, we loop through a smaller subset of the array, starting from _firstIndex + 1_ till the length of the array. Inside the inner loop, we check if the sum of value at firstIndex and the secondIndex is equal to target number. If yes, the corresponding indices are returned. If the sum is not equal to target, the loop continues.

If nothing is found, even after the outer loop finishes, the _IllegalArgumentException_ is thrown which indicates that no solution is found.

```java
	public int[] twoSum(int[] inputOfNumbers, int numberToFind) {
		for (int firstIndex = 0; firstIndex < inputOfNumbers.length; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < inputOfNumbers.length; secondIndex++) {
				if (inputOfNumbers[firstIndex] + inputOfNumbers[secondIndex] == numberToFind) {
					return new int[] { firstIndex, secondIndex };
				}
			}
		}
		throw new IllegalArgumentException(NO_SOLUTION_FOUND);
	}
```

## Search in array

We write a service called _SearchInArrayService_ which takes an integer array containing several numbers and a target number to search as input and checks if the array contains that number.   

```text
* 
	 * int[] intArray = {1,2,3,4,5,6}; searchInArray(intArray, 6); // 5
	 * 
```

We iterate over the complete array and for each index, we check if the value on this index is equal to the target value we are looking for. If this is the case, the index location is returned. If no match is found, -1 is returned.

```java
for (int currentIndex = 0; currentIndex < inputOfNumbers.length; currentIndex++) {
			if (inputOfNumbers[currentIndex] == numberToFind) {
				return currentIndex;
			}
		}
		return -1;
```


## Project structure

There are several packages, one for each problem, which contain the solution inside a _Service_ class. These service classes are instantiated and called from _main()_ inside the Execute class which can be found inside _com.umer.main_ package.

## Technologies Used

- Java 11.

## Prerequisities

- To be defined.

## Commands

In order to run the program, one needs to open the project in a suitable IDE(such as Eclipse, STS, VSCode 0or IntelliJ), navigate to the Execute class inside com.umer.main package. Once there, right click---> Run As ---> Java Application.

The program is written in such a way that most of the service currently uses hard-coded values and it does not take any input from the user. However, one can go inside the main() inside Execute class and change the input parameters as one sees fit.

## Contribution

Feature requests, issues, pull requests and questions are welcome.

## References

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv) 

