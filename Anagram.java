package com.app.projectclass.questions;

import java.util.Arrays;
/**
 * 
 * @author Rakesh
 * this class check weather two string is Anagrams or Not
 */

public class Anagram {
	public static boolean isAnagram(String S1, String S2) {
		char[] arrayStr1 = S1.toCharArray();
		char[] arrayStr2 = S2.toCharArray();
		Arrays.sort(arrayStr1);
		Arrays.sort(arrayStr2);
		return Arrays.equals(arrayStr1, arrayStr2);

	}

	public static void main(String[] args) {
		//String S1 = "Mother in law";
		//String S2 = "Hitler woman";

		//String S1 = "Silent Cat";
		//String S2 = "Listen Act";
		
		String S1 = "Jar";
		String S2 = "raJ";
		
		System.out.println("String is Anagram : "+isAnagram(S1, S2));
		System.out.println("New Statements");

	}

}
