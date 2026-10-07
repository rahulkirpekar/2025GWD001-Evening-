package innerclasstopic.mi;

// Outer class--School
public class A 
{
	// Data Member (Dm's)
	private int no = 100;

	// Member Inner class
	class B
	{
		void show() 
		{
			System.out.println("B - show() -- No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		// object of Outer class
		A objA = new A();
		
		// Innerclass Object
		A.B objB = objA.new B();
		
		objB.show();
	}
}