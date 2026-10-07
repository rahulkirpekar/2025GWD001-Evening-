package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Java-7 [Auto Closable Resource]
		
		try
			(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2025GWD001(Evening)\\src\\iotopic\\byteorientedway\\TestApp2.java");
				
				FileOutputStream fout = new FileOutputStream("C:\\Users\\Royal\\eclipse-workspace\\2025GWD001(Evening)\\src\\iotopic\\byteorientedway\\DupTestApp2.java");
			) 
		{
			int temp;
			
			while((temp = fin.read()) != -1) 
			{
				System.out.println(temp+"---"+(char)temp);
				
				fout.write(temp);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
