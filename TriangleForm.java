package com.xworkz.aptitudeclass.assignment2;

import java.util.Scanner;

public class TriangleForm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter square matrix limit: ");
		int rc = sc.nextInt();
		int mid = (rc / 2) + 1;
		for (int r = 1; r <= rc; r++) {
			for (int c = 1; c <= rc; c++) {
				if (r >= mid && r + c >= rc + 1 && c <= r)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}