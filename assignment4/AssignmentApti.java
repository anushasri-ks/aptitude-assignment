package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class AssignmentApti {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		String confirm;
		do {
			System.out.println("Count number of words = 1");
			System.out.println("Count number of given character = 2");
			System.out.println("replace old char with new = 3");
			System.out.println("remove duplicate characters = 4");
			System.out.println("reverse word/string = 5");
			System.out.println("string palindrome = 6");
			System.out.println("choose an option (1 - 6):");
			int n = sc.nextInt();
			if (n == 1) {
				int count = 0;
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == ' ') {
						count++;
					}
				}
				System.out.println("Count of words in String = " + (count + 1));
			}
			if (n == 2) {
				System.out.println("Enter a character :");
				char c = sc.next().charAt(0);
				int count = 0;
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == c) {
						count++;
					}
				}
				System.out.println("Count of character'" + c + "' in given String\n" + count);
			}
			if (n == 3) {
				char[] charArr = str.toCharArray();
				System.out.println("Enter a character you want to replace :");
				char oldChar = sc.next().charAt(0);
				System.out.println("Enter a character to be replaced with :");
				char newChar = sc.next().charAt(0);
				String s = "";
				for (int i = 0; i < charArr.length; i++) {
					if (charArr[i] == oldChar) {
						charArr[i] = newChar;
					}
					s += charArr[i];
				}
				System.out.print("Replaced '" + oldChar + "' with '" + newChar + "' : " + s);
			}
			if (n == 4) {
				char[] charArr = str.toCharArray();
				for (int i = 0; i < str.length(); i++) {
					for (int j = i + 1; j < str.length(); j++) {
						if (str.charAt(i) == str.charAt(j)) {
							charArr[i] = '0';
						} else
							System.out.print("");
					}
					if (charArr[i] != '0')
						System.out.print(charArr[i]);
				}
				System.out.println();
			}
			if (n == 5) {
				String revWord = "";
				for (int j = str.length() - 1; j >= 0; j--) {
					revWord += str.charAt(j);
				}
				System.out.println("Reversed string : " + revWord);
			}
			if (n == 6) {
				String revWord = "";
				for (int j = str.length() - 1; j >= 0; j--) {
					revWord += str.charAt(j);
				}
				if (str.equals(revWord))
					System.out.println(str + " is a palindrome");
				else
					System.out.println(str + " is not a palindrome");
			}
			System.out.println("Do you want to continue? (y/n) :");
			confirm = sc.next(); 
		}
		while (confirm.toLowerCase().equals("y"));
	}
}
