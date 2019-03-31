package com.app.projectclass.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author RS RATHOUR 
 * this class if finding max occurrence in the List
 */
public class MaxOccuranceWordInList {
	// this method is finding counting of occurrence of word in List
	public static void wordCount(String[] nameList) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for (String name : nameList) {
			if (hashMap.containsKey(name)) {
				hashMap.put(name, hashMap.get(name) + 1);
			} else {
				hashMap.put(name, 1);
			}
		}
		Map.Entry<String, Integer> firstEntry = hashMap.entrySet().iterator().next();
		String maxKey = firstEntry.getKey();
		int maxValue = firstEntry.getValue();
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
			int value = entry.getValue();
			if (value > maxValue) {
				maxValue = value;
				maxKey = entry.getKey();
			}
		}
		System.out.println("Max Occuurence Name Among List is a : " + maxKey);

	}

	public static void main(String[] args) {
		String[] nameList = { "Ramu", "Raju", "Sita", "Ramu", "Raju", "Gita", "Ramu", "Raju" };
		wordCount(nameList);
	}

}
