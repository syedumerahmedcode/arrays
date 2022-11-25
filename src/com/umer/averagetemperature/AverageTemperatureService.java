package com.umer.averagetemperature;

import java.util.Scanner;

public class AverageTemperatureService {

	public void calculateAverageTemperature() {
		Scanner console = new Scanner(System.in);
		System.out.print("How may days' temperature should be calculated: ");
		int numberOfDays = console.nextInt();
		int sum = 0;
		for (int i = 0; i <= numberOfDays; i++) {
			System.out.print("Day "+i+"'s high temperature: ");
			int next=console.nextInt();
			sum+=next;
		}
		double average =sum/numberOfDays;
		System.out.println();
		System.out.println("Average Temp = "+average);
	}

}
