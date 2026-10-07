package exceptiontopic;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		A obj = new B();
		// java.lang.ClassCastException
		C objC  =(C)obj; 
	}
}
