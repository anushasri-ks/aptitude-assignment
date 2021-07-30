package com.xworkz.aptitudeclass.assignment4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovesDuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
	    Set<Character> set = new LinkedHashSet<>();   
        for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i));    
        for(Character ch : set)   
            System.out.print(ch);
    }  
}