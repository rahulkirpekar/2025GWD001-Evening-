package exceptiontopic;

import java.util.Scanner;

public class TestApp7 
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
		
			int a[] = new int[5];
			a[5] = 10;// ArrayIndexOutofBoundException
			System.out.println("A[5] : "+a[5]);
			
			String name = null;
			System.out.println("name.length() : " + name.length());// NullPointerException

		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace();
			System.out.println("Catch Block Handled Exception - ArithmeticException");
		}
		catch(NullPointerException e) 
		{
			e.printStackTrace();
			System.out.println("Catch Block Handled Exception - NullPointerException");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
			System.out.println("Catch Block Handled Exception - ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("Catch Block Handled Exception - Exception");
		}
		System.out.println("Division : " + ans);
	}
}