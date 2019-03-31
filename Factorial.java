package com.app.corejava.interview;

import java.util.Scanner;
/**
 * 
 * @author RS RATHOUR
 * this class is finding factorial value of given number
 */
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is : " + fact);

	}

}
