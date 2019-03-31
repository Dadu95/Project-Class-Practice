package com.app.projectclass.questions;

import java.util.Scanner;

/**
 * 
 * @author RS RATHOUR this class is finding pair of enter number
 */
public class PairFind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Array Element : ");
		int numOfArray = sc.nextInt();
		int[] arrayEle = new int[numOfArray];
		System.out.println("Enter Element of Array : ");
		for (int i = 0; i < arrayEle.length; i++) {
			arrayEle[i] = sc.nextInt();
		}
		System.out.println("Enter any Number from ArrayElement : ");
		int num = new Scanner(System.in).nextInt();
		for (int i = 0; i <= arrayEle.length; i++) {
			for (int j = i + 1; j <= arrayEle.length - 1; j++) {
				int sum = arrayEle[i] + arrayEle[j];
				if (sum == num) {
					System.out.println("Pair is : " + arrayEle[i] + " , " + arrayEle[j]);
				}
			}
		}

	}

}
