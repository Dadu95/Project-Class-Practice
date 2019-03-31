package com.app.corejava.interview;

import java.util.Scanner;
/**
 * 
 * @author RS RATHOUR
 * this class is checking weather number is Palindrome or not
 */
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Digit : ");
		int num = sc.nextInt();
		int reverseDigit = 0, originalDigit, remindar;
		originalDigit = num;
		while (num != 0) {
			remindar = num % 10;
			reverseDigit = reverseDigit * 10 + remindar;
			num /= 10;
		}
		if (originalDigit == reverseDigit) {
			System.out.println("Digit is a Palindrome");
		} else {
			System.out.println("Digit is a Not Palindrome");
		}
	}

}
