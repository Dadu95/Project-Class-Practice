package com.app.corejava.interview;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author RS RATHOUR
 * this class is count Occurrence of each character
 */
public class CharOccurance {
	static void charCount(String str) {
		HashMap<Character, Integer> hM = new HashMap<Character, Integer>();
		char[] strArray = str.toCharArray();
		for (char c : strArray) {
			if (hM.containsKey(c)) {
				hM.put(c, hM.get(c) + 1);
			} else {
				hM.put(c, 1);
			}
		}
		for (Map.Entry<Character,Integer> entry : hM.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "Rakesh Singh Rathour";
		charCount(str);
	}

}
