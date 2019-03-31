package com.app.projectclass.questions;

import java.util.Scanner;

/**
 * 
 * @author Rakesh 
 * this class is finding the missing element from array list
 */
public class FindingMissingValue {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sumOfArray = 0;
		int totalSum = 0;
		
		for (int i = 1; i <= 10; i++) {
			totalSum += i;
		}
		//System.out.println(totalSum);
		for (int i = 0; i < arr.length; i++) {
			sumOfArray += arr[i];
		}
		//System.out.println(sumArray);
		
		int missingValue = totalSum - sumOfArray;
		System.out.println("Missing Value is : " + missingValue);
	}

}
