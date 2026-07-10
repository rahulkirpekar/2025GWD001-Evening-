package oops.constructortopic.thisconstructortopic;

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
	Student(int r,String n)
	{
		this();
		System.out.println("===== START :: PARA-TWO Constructor ====="+this);		
		
		rno = r;
		name = n;
		
		System.out.println("===== EXIT :: PARA-TWO Constructor =====");		
	}
	
	Student(int r,String n,int s)
	{
		this(r, n);
		System.out.println("===== START :: PARA-THREE Constructor ====="+this);		
		
		std = s;
		
		System.out.println("===== EXIT :: PARA-THREE Constructor =====");		
	}
	
	Student(int r,String n,int s,int m)
	{
		this(r,n,s);

		System.out.println("===== START :: PARA-FOUR Constructor ====="+this);		
		
		marks = m;
		
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

		Student s1 = new Student(1,"Ganesh",12,100);
		
		s1.dispData();
		
		
		System.out.println("===== EXIT :: Main Function =====");
	}
}