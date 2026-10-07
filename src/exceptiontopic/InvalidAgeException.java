package exceptiontopic;

//1. Checked Exception--Custom Exception
//----------------------------------------
//public class InvalidAgeException extends Exception


//2. UnChecked Exception--Custom Exception
//----------------------------------------
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}