package com.training.Enums;
 
enum directions{
	North, South, East, West; //enums are used in making preset option instead of getting user inputs
								//it has predefined options to choose from 
								//just like drop down menu or select you gender kind of thing 
}
public class testEnums {
	public static void main(String[] args) {
		System.out.println(directions.East);
		System.out.println(directions.North);
		System.out.println(directions.South);
		System.out.println(directions.West);
	}
}
