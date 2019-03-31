package com.app.projectclass.questions;

import java.util.Scanner;

/**
 * 
 * @author RS RATHOUR 
 * this class is replacing first half string to last string in given String
 */
public class ReplaceFirstHalfToLastString {

	public static void main(String[] args) {
		System.out.println("Enter Any String : ");
		String name = new Scanner(System.in).next();
		String first = null, last = null;
		int length = name.length(), mid = length / 2;
		StringBuffer result = new StringBuffer();
		char midChar = (char) name.indexOf(name.charAt(mid));
		if (((mid%2) == 0)){
			System.out.println("Your String Chrater length is Even ");
			last = name.substring(mid, length);
			first = name.substring(0, mid);			
			result = result.append(last).append(first);	

		} else if((mid%2) != 0){
			System.out.println("Your String Chrater length is Odd ");
			last = name.substring(mid+1, length);
			first = name.substring(0, mid);
			result = result.append(last).append(name.charAt(midChar)).append(first);

		}
		System.out.println("Final Result : " + result);
	}

}
