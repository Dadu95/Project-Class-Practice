package com.app.projectclass.questions;

import java.util.Scanner;
/**
 * 
 * @author Rakesh
 * this class is generating alphanumeric String with given length of number 
 */
public class GenerateAlphanumeric {
	public static String getAlphaNumeric(int n) {
		// combination of char choose from this string for generating alphanumeric
		String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
									+"0123456789"
									+"abcdefghijklmnopqrstuvxyz";
                						 
		StringBuilder sb = new StringBuilder(n);
		
		for(int i=0;i<n;i++) {
			 int index = (int)(alphaNumericString.length()* Math.random()); 
			 sb.append(alphaNumericString.charAt(index));
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Alphanumeric Length : ");
		int n = sc.nextInt();
		System.out.println("Entered Length : "+n);
		System.out.println(GenerateAlphanumeric.getAlphaNumeric(n));
	}

}
