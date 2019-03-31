package com.app.corejava.interview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Rakesh");
		set.add("Prince");
		set.add("Samiran");
		set.add("Dileep");
		set.add("Rakesh");
		set.add("Prince");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
