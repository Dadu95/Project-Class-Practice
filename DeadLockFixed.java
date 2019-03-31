package com.app.corejava.interview;

public class DeadLockFixed {
	public void deadLockMethod1() {
		synchronized (Integer.class) {
			System.out.println("Locking Integer Class Object");
			synchronized (String.class) {
				System.out.println("Locking String Class Object");

			}
		}
	}

	public void deadLockMethod2() {
		synchronized (Integer.class) {
			System.out.println("Locking Integer Class Object");
			synchronized (String.class) {
				System.out.println("Locking String Class Object");

			}

		}
	}

	public static void main(String[] args) {
		DeadLockFixed dF = new DeadLockFixed();
		dF.deadLockMethod1();
		dF.deadLockMethod2();
	}

}
