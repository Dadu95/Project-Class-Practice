package com.app.projectclass.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 
 * @author Rakesh 
 * this class is finding common element from two arrays
 */
public class FindCommonElement {

	public static void main(String[] args) {
		int[] array1 = { 4, 7, 3, 9, 2 };
		int[] array2 = { 3, 2, 12, 9, 40, 32, 4 };
		System.out.println("---------- Using Simple two For Loop ---------");
		System.out.print("Common Elememts is : ");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.print(array1[i]+" ");
				}
			}
			
		}
		System.out.println();
		// using List and HashSet from Collection
		System.out.println("---------- Using HashSet and List ---------");
		List<Integer> arr1 = Arrays.asList(4, 7, 3, 9, 2);
		List<Integer> arr2 = Arrays.asList(3, 2, 12, 9, 40, 32, 4);
		
		HashSet<Integer> hashSet = new HashSet<Integer>(arr1);
		hashSet.retainAll(arr2);
		System.out.println("Common Element is : "+hashSet);
	}

}
