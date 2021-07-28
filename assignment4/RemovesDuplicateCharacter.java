package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class RemovesDuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(j) != str.charAt(i)) {
				System.out.print(str.charAt(i));
				j++;
			}
			else
				System.out.print("");
		}
	}
}