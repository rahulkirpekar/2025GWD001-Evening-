package innerclasstopic.ni;

public class A 
{
	private static int no = 10;

	// Innerclass ---> Nested Inner class
	static class B
	{
		void show() 
		{
			System.out.println("No : " + no);
		}
	}
	
	public static void main(String[] args) 
	{
//		A objA = new A();
//		A.B objB = objA.new B();
		
		A.B obj = new A.B();
		
		obj.show();
	}
}
