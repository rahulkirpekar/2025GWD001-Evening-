package iotopic.charorientedway;

import java.io.FileReader;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Character Orientedway 
		StringBuilder sb = new StringBuilder();
			
		// AutoClosable Resource
		
		try 
			(
				FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\2025GWD001(Evening)\\record.text");		
			)
		{
			int temp;
			
			while((temp = fr.read()) != -1) 
			{
				sb.append(""+(char)temp);
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb);
	}
}
