package com.app.corejava.interview;
/**
 * 
 * @author RS RATHOUR
 * this class is printing all possible pattern
 */
public class AllPossiblePattern {
	public static void subString(String str, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				System.out.println(str.substring(i, j));
			}
		}

	}

	public static void main(String[] args) {
		String str = "ABCDE";
		subString(str, str.length());

	}

}
