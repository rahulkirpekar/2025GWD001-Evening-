package basic;

import java.util.Scanner;

public class TestApp11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Declaration of 2 d Array
//		int a[][] = new int[3][3];

		// Declaration With Initialisation
//		int a[][] = new int[][]
//				{
//					{1,2,3},
//					{4,5,6},
//					{7,8,9},
//				};
				
		int a[][] = 
				{
					{1,2,3},
					{4,5,6},
					{7,8,9},
				};
		
//		for (int i = 0; i < a.length; i++) 
//		{
//			for (int j = 0; j < a[i].length; j++) 
//			{
//				System.out.println("Enter A["+i+"]["+j+"] : ");
//				a[i][j] = sc.nextInt();
//			}
//		}
		int b[] = new int[3];
		int rowSum = 0,colSum=0;
		for (int i = 0; i < a.length; i++) 
		{
			rowSum = 0;
			for (int j = 0; j < a[i].length; j++) 
			{
				colSum = colSum + a[j][i];
				rowSum = rowSum + a[i][j];
				System.out.print(a[i][j]+"\t");
			}
			b[i] = colSum;
			System.out.print(" = "+rowSum);
			System.out.println();
		}
		for (int j = 0; j < a.length; j++) 
		{
			System.out.print("="+b[j]+"\t");
		}
	}
}