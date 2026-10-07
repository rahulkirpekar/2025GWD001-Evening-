package iotopic.byteorientedway.seri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Data -- Object
		Student s1= new Student(1, "Rahul", 12, 100);
		
		// Object ---write into File 
		try 
			(
				FileOutputStream fout = new FileOutputStream("records.txt");
				
				ObjectOutputStream out  = new ObjectOutputStream(fout);
			)
		{
			out.writeObject(s1);
			
			System.out.println("Student record successfully write into file.");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
