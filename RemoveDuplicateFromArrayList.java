package com.app.corejava.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		// removing Duplicate from ArrayList
		List<String> withDuplicate = Arrays.asList("Rakesh", "Archna", "Prince", "Archna", "Samiran", "Dileep",
				"Rakesh");
		System.out.println("With Duplicate List " + withDuplicate);
		// Converting List into Set
		HashSet<String> hS = new HashSet<String>(withDuplicate);
		System.out.println("HashSet Values : " + hS);

		// Converting HashSet Into ArrayList
		List<String> hSToList = new ArrayList<String>(hS);
		System.out.println("WithOut Duplicate : " + hSToList);
	}

}
