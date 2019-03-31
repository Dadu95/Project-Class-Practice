package com.app.projectclass.questions;

import java.util.Scanner;

/**
 * 
 * @author RS RATHOUR 
 * this class is replacing character with their occurrence in string
 * 
 */
public class ReplaceCharWithOcuurence {

	public static void main(String[] args) {
		System.out.println("Enter any String : ");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		System.out.println("Entered String is : " + string);
		System.out.println("-----------------------------------------");
		System.out.println("Enter Character from String : ");
		char chr = sc.next().charAt(0);
		System.out.println("-----------------------------------------");
		System.out.println("Your Entered Char is : " + chr);
		System.out.println("-----------------------------------------");
		char[] strArray = string.toCharArray();
		int count = 0;
		System.out.print("Your Final Result is : ");
		for (char i = 0; i < strArray.length; i++) {
			if (strArray[i] == chr) {
				count++;
				String S = Integer.toString(count);
				char[] C = S.toCharArray();
				for (char ch : C) {
					strArray[i] = ch;
				}
			}
			System.out.print(strArray[i]);
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("Occurrence of " + chr + " is : " + count);

	}
}
