package com.umer.main;

import com.umer.averagetemperature.AverageTemperatureService;

public class Execute {

	public static void main(String[] args) {
		System.out.println("Calling Average temperature calculation service");
		AverageTemperatureService averageTemperatureService=new AverageTemperatureService();
		averageTemperatureService.calculateAverageTemperature();
		System.out.println();
		

	}

}
