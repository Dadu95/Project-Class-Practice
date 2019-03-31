package com.app.projectclass.questions;

import java.util.Arrays;

/**
 * 
 * @author Rakesh 
 * this class is going to rotate array 2 times
 */
public class ArrayRotate {

	// method is going to array rotate left side
	static void leftRotate(int[] arr, int n) {
		System.out.println("Before Rotation Array is : ");
		System.out.println(Arrays.toString(arr));
		int temp;
		for (int i = 1; i <n ; i++) {
			temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println("After Rotation by " + n + " Position Array is : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------------------");
	}

	// method is going to array rotate right side
	static void rightRotate(int[] arr, int n) {
		System.out.println("Before Rotation Array is : ");
		System.out.println(Arrays.toString(arr));
		int temp;
		for (int i = 0; i <n-1; i++) {
			temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
		System.out.println("======= Right Rotation =======");
		System.out.println("After Rotation by " + n + " Position Array is : ");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		leftRotate(new int[] { 1, 2, 3, 4, 5 }, 3);
		rightRotate(new int[] { 1, 2, 3, 4, 5 }, 3);

	}
}