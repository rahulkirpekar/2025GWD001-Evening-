package iotopic.byteorientedway.seri.multipleobj;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		Student s[] = new Student[5];
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println("Enter Rno : ");
			int rno = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Name : ");
			String name = sc.nextLine();

			System.out.println("Enter Std : ");
			int std = sc.nextInt();

			System.out.println("Enter Marks : ");
			int marks = sc.nextInt();
			
			s[i] = new Student(rno, name, std, marks);
		}
		
		// Data -- s---student array object---write--into file
		
		// Auto Closable Resource
		try
			(
				FileOutputStream  fout = new FileOutputStream("multiplerecords.txt");
				
				ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			
			out.writeObject(s);
			
			System.out.println("sucess");
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}		
	}
}




