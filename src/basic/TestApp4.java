package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1  = sc.nextInt();
		
		if (no1 > 0) 
		{
			System.out.println("No is Positive.");
		}
		else if(no1 < 0)
		{
			System.out.println("No is Negative.");
		}
		else if(no1 == 0)
		{
			System.out.println("No is Zero.");
		}
	}
}
