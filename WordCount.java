package com.app.corejava.interview;

public class WordCount {

	public static void main(String[] args) {
		String myName = "Rakesh Singh Rathour";
		// shortCut
		System.out.println("Number of Word is : " + myName.split(" ").length);

		// without shortCut
		int count = 1;
		for (int i = 0; i < myName.length(); i++) {
			if ((myName.charAt(i) == ' ') && ((myName.charAt(i + 1) != ' '))) {
				count++;

			}
		}
		System.out.println("Number of Word is : " + count);
	}

}
