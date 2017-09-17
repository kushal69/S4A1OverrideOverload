package com;

public class MethodOverloading {
	
	// Overloaded Method
	public int add (int valueOne , int valueTwo){
		int result = valueOne + valueTwo;
		return result;
	}
	
	// Overloaded Method
	public int add (int valueOne , int valueTwo, int valueThree){
		int result = valueOne + valueTwo + valueThree;
		return result;
	}

	// Main Function
	public static void main(String[] args) {
		MethodOverloading overloading = new MethodOverloading();
		System.out.println("Addition Result of 2 values " + overloading.add(100, 300));
		System.out.println("Addition Result of 3 values " + overloading.add(100, 300, 400));
	}

}
