package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp12 
{
	public static void isValidForVote(int age) throws ArithmeticException
	{
		if (age < 18) 
		{
			// raise exception
			//-----------------------
			// 1. checked Exception
			
			// 2. Unchecked Exception
			throw new ArithmeticException("\nInvalid Age,\n\tPlease netr valid age for Vote.");
			
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age of Voters : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
		} 
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("General Statements");
	}
}
