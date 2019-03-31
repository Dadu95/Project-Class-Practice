package com.app.corejava.interview;

import java.util.Scanner;
/**
 * 
 * @author RS RATHOUR
 * this class is returning Reverse Order Of Given String
 */
public class ReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println("Your Reverse String is : "+sb);
		}
	}


