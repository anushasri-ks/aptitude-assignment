package com.xworkz.aptitudeclass.assignment2;

import java.util.Scanner;

public class UpsideLeftBorderTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter square matrix limit: ");
		int rc = sc.nextInt();

		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if ((r + c == rc + 1) || r == 1 || c == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}