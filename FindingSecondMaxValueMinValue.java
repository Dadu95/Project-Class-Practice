package com.app.projectclass.questions;

import java.util.Arrays;

/**
 * 
 * @author Rakesh 
 * this class is finding Second Max Value and Second Min Value From Array
 */
public class FindingSecondMaxValueMinValue {

	public static void main(String[] args) {
		int arr[] = { 10, 4, 8, 28, 1, 7 };
		Arrays.parallelSort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[1]) {
				System.out.println("Second Min Value is : " + arr[i]);
			}
			if (arr[i] == arr[arr.length - 2]) {
				System.out.println("Second Max Value is : " + arr[i]);
			}

		}
		System.out.println("----------- Another Way -----------");
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[0]) {
				max = arr[i - 1];
			}
			//will get sorted element
			//System.out.println(arr[i]);
		}
		System.out.println("Second Min Value is : " + arr[1]);
		System.out.println("Second Max Value is : " + max);
	}

}
