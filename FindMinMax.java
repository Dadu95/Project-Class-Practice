package com.app.corejava.interview;
/**
 * 
 * @author RS RATHOUR
 * this class is finding minimum and maximum value from given array
 */

public class FindMinMax {

	public static void main(String[] args) {
		int arr[] = { 5, 10, 2, 4, 32, 47, 1 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[0]) {
				max = arr[i];
			}
			if (arr[i] < arr[0]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum : " + min);
		System.out.println("Maixmum : " + max);
	}

}
