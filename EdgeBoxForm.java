package com.xworkz.aptitudeclass.assignment1;

public class EdgeBoxForm {

	public static void main(String[] args) {
		int [][] array = new int [5][5];
		
		for (int i = 1; i <= array.length; i++)
		{
			if(i >= 3)
			{
				for (int j = 1; j <= array.length; j++)
					if(j >= 3 && j <= 5)
						System.out.print(i+""+j+" ");
					else
						System.out.print("   ");
			}
		System.out.println();
		}
	}

}
