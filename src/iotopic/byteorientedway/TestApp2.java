package iotopic.byteorientedway;

import java.io.FileInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		
		FileInputStream fin = null;
		
		try 
		{
			// 1. Open File Connection 
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2025GWD001(Evening)\\src\\iotopic\\byteorientedway\\TestApp1.java");
			
			// 2. File Operation(read/write)
			int temp ;
			
			while(	(temp =  fin.read())	!= -1 )
			{
				sb.append((char)temp);
				
			}
			// 3. File connection close
			fin.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb);
	}
}



