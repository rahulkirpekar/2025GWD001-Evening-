package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp11 
{
	public static void isValidForVote(int age) throws IOException
	{
		if (age < 18) 
		{
			// raise exception
			//-----------------------
			// 1. checked Exception
			throw new IOException("\nInvalid Age,\n\tPlease netr valid age for Vote.");
			
			// 2. Unchecked Exception
			
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
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("General Statements");
	}
}
