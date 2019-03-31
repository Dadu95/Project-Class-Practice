package com.app.corejava.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author RS RATHOUR this class is find duplicate object from List using Set
 */

public class RemoveDuplicateObject {

	public static void main(String[] args) {
		List<String> duplicateList = Arrays.asList("Rakesh", "Archna", "Samiran", "Prince", "Neha", "Saurabh", "Dileep",
				"Rakesh", "Archna", "Prince");
		// Printing Duplicate List
		for (String dupList : duplicateList) {
			System.out.println("With Duplicate Element : " + dupList);
		}

		Set<String> notDuplicateSet = new HashSet<String>();
		// Removing Duplicate
		/*
		 * System.out.println("--------------------------------------------"); for
		 * (String ele : duplicateList) { if (notDuplicateSet.add(ele)) {
		 * System.out.println("Without Duplicate Element : " + ele); } }
		 */

		// Finding Duplicate
		System.out.println("--------------------------------------------");
		for (String eleF : duplicateList) {
			if (!notDuplicateSet.add(eleF)) {
				System.out.println("These are Duplicate Element : " + eleF);
			}
		}
	}
}
