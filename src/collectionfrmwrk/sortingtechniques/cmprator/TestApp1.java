package collectionfrmwrk.sortingtechniques.cmprator;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Rahul", 10, 76);
		Student s2= new Student(2, "Ankur", 11, 90);
		Student s3= new Student(3, "Ganesh", 12, 100);
		Student s4= new Student(4, "Sagar", 11, 98);
		Student s5= new Student(5, "Jayant", 8, 84);
		
		ArrayList<Student> list =new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for (int i = 0; i < list.size(); i++) 
		{
			Student s= list.get(i);
			
			System.out.println(s.getRno()+" "  + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}

		// Data -- list of student objects
		Collections.sort(list, new MarksWiseStudentComparator());
		
		System.out.println("Marsk Wise Student Sorting : ");
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s= list.get(i);
			
			System.out.println(s.getRno()+" "  + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		System.out.println("Std Wise Student Sorting : ");
		
		Collections.sort(list, new StdWiseStudentComparator());
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s= list.get(i);
			
			System.out.println(s.getRno()+" "  + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		
		System.out.println("Name Wise Student Sorting : ");
		
		Collections.sort(list, new NameWiseStudentComparator());
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s= list.get(i);
			
			System.out.println(s.getRno()+" "  + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
	}
}


//Sorting Techniques:-
//--------------------
//
//list--->String Data 
//
//	Collections.sort(list);
//
//
//	1. Comparable(I)---compareTo()
//	2. Comparator(I)---compare

