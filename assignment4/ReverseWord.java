package com.xworkz.aptitudeclass.assignment4;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		String words[] = str.split(" ");
        String reversedStr = "";
        
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedStr = reversedStr + reverseWord + " ";
		}
        System.out.print("Reversed string : " + reversedStr);
    }
}