package com.app.projectclass.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Rakesh 
 * this class is finding Occurrence of all Vowels
 */

public class VowelOccurance {
	static void charCount(String str) {
		HashMap<Character, Integer> hM = new HashMap<Character, Integer>();
		char[] chrArray = str.toCharArray();

		for (char c : chrArray) {
			if (c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
				|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			{
				if (hM.containsKey(c)) {
					hM.put(c, hM.get(c) + 1);
				} else {
					hM.put(c, 1);
				}
			} 
		}
		// this loop is checking when not found consonent 
		if(hM.size()==0) {
			System.out.println("No Vowel Found In This Sentence ");
		}


		for (Map.Entry<Character, Integer> entry : hM.entrySet()) {
			System.out.println("Volwel " + entry.getKey() + " is Occur => "
										 + entry.getValue() + " Time ");
		}

	}

	

	public static void main(String[] args) {
		System.out.println("Enter Any Sentence : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Your Sentence is : " + str);
		System.out.println("---------------------------------------------");
		charCount(str);
	}
}
