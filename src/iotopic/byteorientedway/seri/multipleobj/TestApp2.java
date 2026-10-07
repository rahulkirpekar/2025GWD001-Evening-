package iotopic.byteorientedway.seri.multipleobj;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
			(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2025GWD001(Evening)\\multiplerecords.txt");
				
				ObjectInputStream oin = new ObjectInputStream(fin);
			)
		{
			
			Student s[] = (Student[])oin.readObject();
			
			for (int i = 0; i < s.length; i++) 
			{
				System.out.println(s[i].getRno()+" " + s[i].getName()+" " + s[i].getStd()+" " + s[i].getMarks());
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}