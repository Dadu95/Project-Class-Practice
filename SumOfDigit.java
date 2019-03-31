package com.app.corejava.interview;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		System.out.println("Enter Any Digit : ");
		long digit = new Scanner(System.in).nextLong();
		int lastDigit, sum = 0;
		while (digit != 0) {
			lastDigit = (int) (digit % 10);
			sum = sum + lastDigit;
			digit /= 10;
		}
		System.out.println("Sum Of Digit : " + sum);
	}

}
