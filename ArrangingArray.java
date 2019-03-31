package com.app.projectclass.questions;

import java.util.Arrays;

/**
 * 
 * @author Rakesh this class is going to arrange element to ascending order
 */

public class ArrangingArray {

	public ArrangingArray() {
	}

// method is return sort array
	public int[] sortingArray(int arr[]) {
		int len = arr.length;
		int temp;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// using sorting method
		/*
		 * int arr[] = { 1, 0, 0, 1, 0, 1, 0, 0 };
		 * 
		 * Arrays.parallelSort(array); for(int arr : array) { System.out.print(arr+" ");
		 * }
		 * 
		 */

		// without sorting method

		int arr[] = { 1, 0, 0, 1, 0, 1, 0, 0 };
		ArrangingArray arrange = new ArrangingArray();
		int b[] = arrange.sortingArray(arr);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
