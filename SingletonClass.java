package com.app.corejava.interview;
/**
 * 
 * @author RS RATHOUR
 * this class is return single Instance
 */
public class SingletonClass {
	private static SingletonClass singleInstance;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (singleInstance == null) {
			singleInstance = new SingletonClass();
		}
		return singleInstance;
	}

	public static void main(String[] args) {
		new SingletonClass();
		SingletonClass st = SingletonClass.getInstance();
		System.out.println("Object 1 : " + st);

		new SingletonClass();
		SingletonClass st2 = SingletonClass.getInstance();
		System.out.println("Object 2 : " + st2);
	}

}
