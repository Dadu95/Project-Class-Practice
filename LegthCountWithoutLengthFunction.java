package com.app.corejava.interview;

import java.util.Scanner;

public class LegthCountWithoutLengthFunction {

	public static void main(String[] args) {

		System.out.println("Enter any String : ");
		String S = new Scanner(System.in).next();
		int count = 0;
		char[] str = S.toCharArray();
		for (char c : str) {
			count++;
		}
		System.out.println("Length of String is : " + count);
	}

}
