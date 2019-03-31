package com.app.projectclass.questions;

import java.util.Scanner;

/**
 * 
 * @author Rakesh 
 * this class will replace adding string in specific location in word
 */
public class ReplaceStringParticularLocation {

	public static void main(String[] args) {
		
		Scanner  sc2=null,sc3=null;
		StringBuffer blogString = new StringBuffer("I Am Singh");
		System.out.println("Your Blog is : "+blogString);
		System.out.println("--------------------------------------");

		sc2 = new Scanner(System.in);
		System.out.println("Enter Your Input String : ");
		String inputString = sc2.nextLine();
		System.out.println("Your Input String is : "+inputString);
		System.out.println("--------------------------------------");

        sc3 = new Scanner(System.in);
        System.out.println("Enter Position : ");
        int position = sc3.nextInt();
        System.out.println("Entered Position is : "+position);
        
        if(inputString!=null) {
        	blogString = blogString.insert(position, inputString);
        }
        System.out.println("Final Result is : "+blogString);
	}

}
