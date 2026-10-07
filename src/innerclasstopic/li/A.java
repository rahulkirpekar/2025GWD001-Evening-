package innerclasstopic.li;

public class A 
{
	private int no = 200;
	
	void disp() 
	{
		// Define class -- Local Innerclass
		class B
		{
			void show() 
			{
				System.out.println("B : show() No : " + no);
			}
		}

		B obj = new B();
		obj.show();
	}
	public static void main(String[] args) 
	{
		A obj = new A();
		
		obj.disp();
	}
}