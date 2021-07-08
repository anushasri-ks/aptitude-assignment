package com.xworkz.aptitudeclass.assignment1;

public class RevLform {

	public static void main(String[] args) {
//		int [][] array = new int [5][5];
		
		for (int i = 1; i <= 3; i++)
		{
			if(i == 3) 
			{
				for (int j = 1; j <= 3; j++)
					System.out.print(i+""+j+" ");
			}
			else
			{
				System.out.print("      ");
				System.out.print(i+""+3+" ");
			}
		System.out.println();
		}
	}

}
