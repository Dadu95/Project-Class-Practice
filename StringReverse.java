package com.app.projectclass.questions;

/**
 * 
 * @author Rakesh 
 * this class is for reverse string
 */
public class StringReverse {
	public static void main(String[] args) {
		String str = "Programming Language";
		StringBuilder reverseString = new StringBuilder();
		String[] words = str.split(" ");
		for (String word : words) {
			String reverseWord = new StringBuilder(word).reverse().toString();
			reverseString.append(reverseWord + " ");
		}
		System.out.println(reverseString.toString().trim());
	}
}
