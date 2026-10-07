package exceptiontopic.methodoverridde;

import java.io.IOException;

/*
Method Overridding With Exception:-
--------------------------------------

If the superclass method does not declare an exception
--------------------------------------------------------------
	===> subclass overridden method cannot declare the checked exception
	     but it can declare unchecked exception.
	  
If the superclass method declares an exception, 
--------------------------------------------------------------
		===> subclass overridden method can declare same, 
		===> subclass exception or 
		===> no exception 
		===> but cannot declare parent exception.   
*/
public class B extends A
{
	public void test() //throws ArithmeticException
	{
		System.out.println("B : test()");
	}
}
