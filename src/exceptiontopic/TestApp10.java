package exceptiontopic;

import java.util.Scanner;

public class TestApp10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans= 0;
		
		// Nested try..catch Block--->Exception Handling concept
		try 
		{

			try 
			{
				// ArithmeticException
				ans = no1 / no2;
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			

			try 
			{
				String value = "1a23";
				int no = Integer.parseInt(value);
				System.out.println("No : " + no);
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			

			try 
			{
				int a[] = new int[5];
				a[5] = 10;// ArrayIndexOutofBoundException
				System.out.println("A[5] : "+a[5]);
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}

			try 
			{
				String name = null;
				System.out.println("name.length() : " + name.length());// NullPointerException
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("Catch Block Handled Exception - Exception");
		}
		System.out.println("Division : " + ans);
	}
}