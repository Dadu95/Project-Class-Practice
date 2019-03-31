package com.app.corejava.interview;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Number for Upto Series : ");
		int num = Sc.nextInt();
		int F1 = 0, F2 = 1, fibonacci;
		System.out.print(F1 + " " + F2);
		for (int i = 1; i <= num; i++) {
			fibonacci = F1 + F2;
			System.out.print(" " + fibonacci);
			F1 = F2;
			F2 = fibonacci;
		}
	}

}
