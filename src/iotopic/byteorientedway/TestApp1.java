package iotopic.byteorientedway;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		/*
			1. Open File Connection 
			
			2. Operation(write/read)
			
			3. File Connection close
		*/
		
		FileOutputStream fout = null;
		
		try 
		{
			// 1. Open File Connection 
			fout = new FileOutputStream("royal01.txt");
			
			// 2. Operation(write/read)
			
			// String Data ---convert into bytetype
			
			byte b[] = name.getBytes();
			
			fout.write(b);
			
			System.out.println("success");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			//3. File Connection close
			try 
			{
				fout.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}