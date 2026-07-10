package oops.thistopic;

public class Student 
{
	int rno;
	String name;
	int std,marks;

	// 1. Default
	Student()
	{
		System.out.println("===== START :: Default Constructor ====="+this);
		
		System.out.println(rno+ " " + name +" " + std + " " + marks);
		
		rno = 1;
		name = "Ankur";
		std = 10;
		marks = 100;

		System.out.println(rno+ " " + name +" " + std + " " + marks);
		
		System.out.println("===== EXIT :: Default Constructor =====");
	}
	
	// 2. Para 
//	Student(int r,String n)
//	{
//		System.out.println("===== START :: PARA-TWO Constructor ====="+this);		
//		
//		rno = r;
//		name = n;
//		
//		System.out.println("===== EXIT :: PARA-TWO Constructor =====");		
//	}
//	
//	Student(int r,String n,int s)
//	{
//		System.out.println("===== START :: PARA-THREE Constructor ====="+this);		
//		
//		rno = r;
//		name = n;
//		std = s;
//		
//		System.out.println("===== EXIT :: PARA-THREE Constructor =====");		
//	}
	
	Student(int rno,String name,int std,int marks)
	{
		System.out.println("===== START :: PARA-FOUR Constructor ====="+this);		
		
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
		
		System.out.println("===== EXIT :: PARA-FOUR Constructor =====");		
	}
	// 3. Copy(para)
	public Student(Student s) 
	{
		System.out.println("===== START :: PARA-COPY Constructor ====="+this);
		
		rno = s.rno;
		name = s.name;
		std = s.std;
		marks = s.marks;
		
		System.out.println("===== EXIT :: PARA-COPY Constructor =====");	
	}
	
	public void dispData() 
	{
		System.out.println(rno+ " " + name +" " + std + " " + marks+"===="+this);
	}
	public static void main(String[] args) 
	{
		System.out.println("===== START :: Main Function =====");

		// Object Create = 1. Memory allocation + 2. JVM Default Const     3. Object Dm's Initialize(Constructor)
		Student s1 = new Student(1,"Ganesh",12,100);
		
		Student s2 = new Student(s1); 
		
		s1.dispData();
		s2.dispData();
		
		
		System.out.println("===== EXIT :: Main Function =====");
	}
}