package com.app.projectclass.questions;

/**
 * 
 * @author RS RATHOUR 
 * this class is finding Min and Max Value from integer array
 */
public class FindMinMaxValue {

	public static void main(String[] args) {

		int array[] = {25,21, 54, 10, 24, 87, 10, 354, 8 };
		int min = array[0];
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[0]) {
				max = array[i];

			}
			if (array[i] < array[0]) {
				min = array[i];

			}
		}
		System.out.println("Minimum Value is : " + min);
		System.out.println("Maximum Value is : " + max);

	}

}
