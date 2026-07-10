package basic;

import java.util.Scanner;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
/*		
	Array Declaration
   -------------------
	
	int a[] = new int[5];

	int[] a = new int[5];
	
	int [] a = new int[5];
	
	int []a = new int[5];
	
	int...a = new int[5];
	
	int a[] = null;
	a = new int[5];
	
	Array Declaration with Initialisation
   -----------------------------------------
   
   int a[] = {10,20,30,40,50};
   
   int a[] = new int[]{10,20,30,40,50};
*/		
		int a[] = new int[5];

		System.out.println(a);
		
		System.out.println("a.length : " + a.length);//5
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			sum = sum + a[i];
			System.out.println("A["+ i +"] : " + a[i]);
		}
		System.out.println("Sum of Array : " + sum);
	}
}
