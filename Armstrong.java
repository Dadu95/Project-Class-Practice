package com.app.corejava.interview;
/**
 * 
 * @author RS RATHOUR
 * this class is finding number is Armstrong or not
 */
public class Armstrong {

	public static void main(String[] args) {
		int count = 0, a, temp;
		int n = 153;
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			count = count + (a * a * a);
		}
		if (temp == count) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
	}

}
