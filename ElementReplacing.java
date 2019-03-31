package com.app.corejava.interview;

/**
 * 
 * @author RS RATHOUR 
 * this class is replacing specific element from array
 */

public class ElementReplacing {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int ele : arr) {
			System.out.println("Elements : " + ele);
		}
		System.out.println("After Replacing Elements : ");
		for (int rep : arr) {
			if (rep == 4) {
				rep = 8;
			}
			System.out.println("Elements : " + rep);
		}
	}

}
