package com.app.corejava.interview;

public class MethodOverloading {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static float add(int a, double b) {
		return (float) (a + b);
	}

	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(10, 20, 30));
		System.out.println(add(10, 20.5));

	}

}
