package oops.inhtopic.hieinh;

import java.util.Scanner;

public class NonTechEmployee extends Employee
{
	String task;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter NonTechEmployee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter NonTechEmployee Name : ");
		name = sc.nextLine();
		System.out.println("Enter NonTechEmployee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter NonTechEmployee Dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter NonTechEmployee Task : ");
		task = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " +dsgn+" " + task);
	}
}