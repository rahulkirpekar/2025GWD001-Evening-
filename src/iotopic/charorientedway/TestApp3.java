package iotopic.charorientedway;

import java.io.File;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		File file = new File("C:\\Users\\Royal\\eclipse-workspace\\2025GWD001(Evening)");

		
		String fileName[] = file.list();
		
		for (int i = 0; i < fileName.length; i++) 
		{
			System.out.println("fileName["+i+"] : "+fileName[i]);
		}
		
		
		String absolutePath = file.getAbsolutePath();
		
		System.out.println(file.isFile());
		
		System.out.println("absolutePath : " + absolutePath);
	}

}
