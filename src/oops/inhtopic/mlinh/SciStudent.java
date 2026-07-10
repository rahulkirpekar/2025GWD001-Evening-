package oops.inhtopic.mlinh;

public class SciStudent extends Student
{
	String subject;
	
	public SciStudent() 
	{
		System.out.println("SciStudent : Default Constructor");
	}
	
	public SciStudent(int rno,String name,int std,int marks,String subject) 
	{
		super(rno, name, std, marks);
		
		this.subject = subject;
		
		System.out.println("SciStudent : Para Constructor");
	}
	
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks +" " + subject);
	}
	
	public static void main(String[] args) 
	{
		
		SciStudent sciStudent = new SciStudent(1, "Ganehs", 12, 100, "Maths");
		
		sciStudent.dispData();
	}
}
