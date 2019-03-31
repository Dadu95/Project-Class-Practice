package com.app.projectclass.questions;

import java.util.Scanner;

/**
 * 
 * @author Rakesh 
 * this class is arranging all char first and all special char at last
 */
public class ArragingCharacter {
	static String moveSpecialCharAtLast(String str) {
		// take the length of String
		int len = str.length();
		// regular expression of checking char is special char or not
		String regExp = "[a-zA-Z0-9\\s+]";
		String res1 = "", res2 = "";
		// traversing string
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			// checking char of i is special char or not
			if (String.valueOf(ch).matches(regExp)) {
				res1 += ch;
			} else {
				res2 += ch;
			}
		}
		return res1 + res2;
	}

	public static void main(String[] args) {
		System.out.println("Enter Your String : ");
		String str = new Scanner(System.in).next();
		System.out.println("Result is : "+moveSpecialCharAtLast(str));
	}

}
