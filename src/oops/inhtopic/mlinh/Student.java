package oops.inhtopic.mlinh;

public class Student extends Person
{
	int rno,std,marks;
	
	public Student() 
	{
		System.out.println("Student : Default Constructor");
	}
	
	public Student(int rno,String name,int std,int marks) 
	{
		super(name);
		this.rno = rno;
		this.std = std;
		this.marks = marks;
		System.out.println("Student : Para Constructor");
	}
}
