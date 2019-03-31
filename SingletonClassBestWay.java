package com.app.corejava.interview;

/**
 * 
 * @author RS RATHOUR 
 * this class is will return Single Instance and this Best way to SingleTon Class
 */

public final class SingletonClassBestWay {

	private static SingletonClassBestWay instance = null;

	private SingletonClassBestWay() {
		System.out.println("I am Private Constructor");
	}

	public static SingletonClassBestWay getInstance() {
		if (instance == null) {
			synchronized (SingletonClassBestWay.class) {
				if (instance == null)
					instance = new SingletonClassBestWay();
			}

		}
		return instance;
	}
public static void main(String[] args) {
	SingletonClassBestWay st = SingletonClassBestWay.getInstance();
	System.out.println("Object 1 : "+st);
	

	SingletonClassBestWay st2 = SingletonClassBestWay.getInstance();
	System.out.println("Object 2 : "+st2);
}
}
