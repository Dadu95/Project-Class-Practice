package com.app.corejava.interview;

public class DeadLockProblem {
	public void deadLockMethod1() {
		synchronized (String.class) {
			System.out.println("Locking String Class Object");
			synchronized (Integer.class) {
				System.out.println("Locking Integer Class Object");

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
		DeadLockProblem dP = new DeadLockProblem();
		dP.deadLockMethod1();
		dP.deadLockMethod2();
	}

}
