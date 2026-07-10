package oops.abstopic.aclass.task1;

public class B extends A
{
	@Override
	public void test1() 
	{
		System.out.println("B - test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("B - test2()");
	}
	@Override
	public void test3() 
	{
		System.out.println("B - test3()");
	}
	
	public void test6() 
	{
		System.out.println("B - test6()");
	}
	
	
	
	public static void main(String[] args) 
	{
//		A obj = new A();
		A objA = new C();
		
		objA.test1();
		objA.test2();
		objA.test3();
		objA.test4();
		objA.test5();

		if(objA instanceof B) 
		{
			// Downcasting
			B objB = (B)objA;
			objB.test6();
		}
		else if(objA instanceof C)
		{
			// Downcasting
			C objC = (C)objA;
			objC.test7();			
		}
	}
}
