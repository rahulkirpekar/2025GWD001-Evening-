package exceptiontopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		// java.lang.ArrayIndexOutOfBoundsException
		a[5] = 10;
		System.out.println("a[5] : " + a[5]);
	}
}
