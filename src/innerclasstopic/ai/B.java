package innerclasstopic.ai;

public class B extends A
{
	@Override
	void test1() 
	{
		System.out.println("B : test1()");
	}

	public static void main(String[] args) 
	{
		B obj = new B();
		
		obj.test1();
		
	}
}
