package exceptiontopic;

import java.util.Scanner;

public class TestApp9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans= 0;
		
		// Exception Handling concept
		try 
		{
			// ArithmeticException
			ans = no1 / no2;
			
			String value = "1a23";
			int no = Integer.parseInt(value);
			System.out.println("No : " + no);
		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace();
			System.out.println("Catch Block Handled Exception - " + e.getClass().getName());
		}
		finally 
		{
			System.out.println("Hello I am finally block");
		}
		System.out.println("Division : " + ans);
		
	}
}
