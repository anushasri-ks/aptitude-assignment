package com.xworkz.aptitudeclass.assignment2;

import java.util.Scanner;

public class LeftsideDownNumberTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter square matrix limit: ");
		int rc = sc.nextInt();

		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r >= c)
					System.out.print(r);
			}
			System.out.println();
		}
	}
}