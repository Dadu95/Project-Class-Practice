package com.app.corejava.interview;
/**
 * 
 * @author RS RATHOUR
 * this class is printing Pyramid pattern
 */
public class Pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

		System.out.println("--------------------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" " + k);
			}
			System.out.println();
		}

		System.out.println("-------------------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + "*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + "*");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" " + "*");
			}
			System.out.println();
		}

	}
}
