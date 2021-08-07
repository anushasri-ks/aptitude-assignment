package com.xworkz.aptitudeclass.assignment;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		double temp = findHarmonicSeries(num, 0);
		System.out.println("Harmonic Series of "+num +" = "+temp);
	}
	public static double findHarmonicSeries(double num, double temp) {
		if (num == 0)
			return temp;
		temp += 1/num;
		num--;
		return findHarmonicSeries(num, temp);
	}
}