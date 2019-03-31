package com.app.projectclass.questions;

public class FinallyBlock {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println("Before Try");
		try {
			
			int c = a/b;
			System.out.println(c);
		}catch( ArithmeticException e){
			int c = b/a;
			System.out.println(c);
		}
		finally {
			System.out.println("Finally");
		}
		System.out.println("After Finally");
	}

}
