package stringtopic.methods;

import java.util.Scanner;

public class TestApp5 
{
	
	public static boolean isAnagramStr(String value1,String value2) 
	{
		boolean flag = true;
		
		if (value1.length() == value2.length()) 
		{
			for (int i = 0; i < value1.length(); i++) 
			{
				flag = true;
				for (int j = 0; j < value2.length(); j++) 
				{
					if(value1.charAt(i)==value2.charAt(j)) 
					{
						System.out.println(value1.charAt(i)+"-----"+value2.charAt(j)+"----"+(value1.charAt(i)==value2.charAt(j)));
						flag = false;
						break;
					}
				}
				if(flag) 
				{
					return false;
//					System.out.println("Both strings are not Anagram.");
//					break;
				}
			}
		} else 
		{
			return false;
//			System.out.println("Both strings are not Anagram.");
		}
		if(!flag) 
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value1 : ");
		String value1=  sc.nextLine();
		System.out.println("Enter value2 : ");
		String value2=  sc.nextLine();
		
		if (isAnagramStr(value1, value2)) 
		{
			System.out.println("Both strings are Anagram.");
		} else 
		{
			System.out.println("Both strings are not Anagram.");
		}
	}
}
