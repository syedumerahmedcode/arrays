package com.umer.main;

import com.umer.averagetemperature.AverageTemperatureService;
import com.umer.missingnumber.MissingNumberService;

public class Execute {

	public static void main(String[] args) {
		System.out.println("Calling Average temperature calculation service");
		AverageTemperatureService averageTemperatureService=new AverageTemperatureService();
//		averageTemperatureService.calculateAverageTemperature();
		System.out.println();
		
		MissingNumberService missingNumberService=new MissingNumberService();
		int[] intArray= {1,2,3,4,5,6,7,8,9,10,11,12,13,15};
		missingNumberService.findMissingNumber(intArray);
		

	}

}
