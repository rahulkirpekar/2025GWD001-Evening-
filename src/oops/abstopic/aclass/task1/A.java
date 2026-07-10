package oops.abstopic.aclass.task1;

public abstract class A 
{
//	1. Data Members
	int no1;
	
//	2. constructor
	public A()
	{
		System.out.println("A--Default Constructor");
		no1 = 100;
	}
	
//	3. Member Function
	//------------------
//	1. abstract Methods(Rules , GuideLine)
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	
//	2. non-abstract Methods
	public void test4()
	{
		System.out.println("A : test4()");
	}
	public void test5()
	{
		System.out.println("A : test5()");
	}
}
