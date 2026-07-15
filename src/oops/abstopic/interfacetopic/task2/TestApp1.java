package oops.abstopic.interfacetopic.task2;

import java.util.Scanner;

public class TestApp1 
{
										// Runtime Polymorphism
										// Polymorphic Object
										// Upcasting(Parent Reference = Child Object)
	public static void getBehaveByPlace(Person person) 
	{
		person.getBehave();
		
		if (person instanceof School) 
		{
			// Child--Downcasting
			School student = (School)person;
			student.getResult();
		} 
		else if (person instanceof Org) 
		{
			// Child--Downcasting
			Org org = (Org)person;
			org.getSalary();
		}
		else if (person instanceof PublicPlace) 
		{
			// Child--Downcasting
			PublicPlace obj = (PublicPlace)person;
			obj.getPublicEventInfo();
		}
		else if (person instanceof Home) 
		{
			// Child--Downcasting
			Home home = (Home)person;
			home.getMoviewOnTime();
		}
	}
/*	
	public static void getBehaveByPlace(Home home) 
	{
		home.getBehave();
	}
	public static void getBehaveByPlace(PublicPlace obj) 
	{
		obj.getBehave();
	}
	public static void getBehaveByPlace(Org org) 
	{
		org.getBehave();
	}
*/	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For Home");
		int choice = sc.nextInt();
		
		switch (choice) 
		{
			case 1: 
					School school = new School();
					getBehaveByPlace(school);
					break;
					
			case 2: Org org = new Org();
					getBehaveByPlace(org);
					break;
					
			case 3: PublicPlace obj = new PublicPlace();
					getBehaveByPlace(obj);
					break;
					
			case 4: Home home = new Home();
					getBehaveByPlace(home);
					break;
		}
	}
}
