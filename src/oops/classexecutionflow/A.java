package oops.classexecutionflow;

// Class Execution Flow
//------------------------
public class A 
{
	// 1. static Block
	static
	{
		System.out.println("A : static Block---1.....1");
	}
	static
	{
		System.out.println("A : static Block---2.....2");
	}
	// 2. static Method
	static void test1() 
	{
		System.out.println("A - static method---test1().....4");
	}
	
	// 1. Instance Block
	{
		System.out.println("A : Instance Block---1.....5");
	}
	{
		System.out.println("A : Instance Block---2.....6");
	}
	
	// Default Constructor
	A()
	{
		System.out.println("A : Default Constructor.....7");	
	}
	// PARA Constructor
	A(int no)
	{
		this();
		System.out.println("A : PARA Constructor.....7");	
	}

	// 2. Non-Static Method
	void test2() 
	{
		System.out.println("A - Non-static method---test2().....8");
	}
	public static void main(String[] args) 
	{
		System.out.println("START : Main Function.....3");
		
		A.test1();
		
		A objA = new A(10);
		
		objA.test2();
		
		
		System.out.println("EXIT : Main Function.....9");
	}
}
