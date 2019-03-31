package com.app.projectclass.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author Rakesh 
 * this class is performing union Operation between two Arrays
 */
public class UnionOperationBwTwoArray {

	public static void main(String[] args) {
			
		List<Integer> list1 = Arrays.asList(1, 4, 6, 8, 9);
		List<Integer> list2 = Arrays.asList(4, 7, 8, 3, 7);
		
		Set<Integer> hashSet = new LinkedHashSet<Integer>(list1);
		hashSet.addAll(list2);
		
		System.out.println("Union Of list1 and list2 is : "+hashSet);
		

	}

}
