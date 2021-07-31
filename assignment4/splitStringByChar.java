package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class splitStringByChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		System.out.println("Enter a character :");
		char c = sc.next().charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c)
				System.out.print(" ");
			else
				System.out.print(str.charAt(i));
		}
/*		
		String c = sc.next();
		String[] s = str.split(c);
		for (String w : s) {
			System.out.print(w + " ");
		} 
*/
	}
}