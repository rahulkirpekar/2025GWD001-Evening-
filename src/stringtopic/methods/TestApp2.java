package stringtopic.methods;

import java.util.Scanner;

public class TestApp2 
{
	public static boolean isPalindromeStr(String name) 
	{
		for (int i = 0,j = (name.length()-1); i < name.length(); i++,j--) 
		{
			if(name.charAt(i) != name.charAt(j)) 
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();// madam
		
		if (isPalindromeStr(name)) 
		{
			System.out.println(name+" is Palindrome");
		} 
		else 
		{
			System.out.println(name+" is not Palindrome");
		}
	}
}
