package com.umer.averagetemperature;

import java.util.Scanner;

public class AverageTemperatureService {

	public void calculateAverageTemperature() {
		Scanner console = new Scanner(System.in);
		System.out.print("How may days' temperature should be calculated: ");
		int numberOfDays = console.nextInt();
		int[] temperatures = new int[numberOfDays];
		// record temperatures and find average
		int sum = 0;
		for (int currentDay = 0; currentDay <= numberOfDays - 1; currentDay++) {
			System.out.print("Day " + (currentDay + 1) + "'s high temperature: ");
			temperatures[currentDay] = console.nextInt();
			sum += temperatures[currentDay];
		}
		double average = sum / numberOfDays;

		// count number of days which are above average
		int aboveAverageTemperatureDays = 0;
		for (int currentDay = 0; currentDay <= temperatures.length - 1; currentDay++) {
			if (temperatures[currentDay] > Math.ceil(average)) {
				// current day's temperature is above average
				aboveAverageTemperatureDays++;
			}
		}
		System.out.println();
		System.out.println("Average Temp = " + average);
		System.out.println();
		System.out.println("number of days on which the temparature is above average is " + aboveAverageTemperatureDays
				+ " days.");
	}

}
