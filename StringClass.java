package com.app.corejava.interview;

public class StringClass {

	public static void main(String[] args) {
		String s1 = "Rakesh";
		String s2 = "RAKESH";
		System.out.println(s1.equalsIgnoreCase(s2));
	    System.out.println(s1.compareTo(s2));
	    System.out.println(s1.compareToIgnoreCase(s2));
	    System.out.println(s2.compareToIgnoreCase(s1));
	    System.out.println(s1.equals(s2));
	}

}
