package com.app.corejava.interview;

import java.util.Scanner;
/**
 * 
 * @author RS RATHOUR
 * this class is finding factorial value of given number using recursive 
 */
public class FactorialRecursive {
	static int fact(int b) {
		if (b <= 1) {
			return 1;
		} else {
			return b * fact(b - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num = sc.nextInt();
		int result = fact(num);
		System.out.println("Factorial of "+num+" is : "+result);
			
		}
	}


