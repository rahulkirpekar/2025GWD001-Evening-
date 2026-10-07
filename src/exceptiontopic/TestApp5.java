package exceptiontopic;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		String value = "1a2a3";
		// java.lang.NumberFormatException
		System.out.println(Integer.parseInt(value) + 200);
	}
}
