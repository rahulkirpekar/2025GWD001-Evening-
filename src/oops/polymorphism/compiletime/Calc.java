package oops.polymorphism.compiletime;

// Static Binding
//     |
// Method Overloadding 

public class Calc 
{
	public void addFun(long no1,long no2) 
	{
		System.out.println("addFun(long no1,long no2) : " + (no1+no2));
	}
	public void addFun(double no1,double no2) 
	{
		System.out.println("addFun(double no1,double no2) : " + (no1+no2));
	}
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(int no1,int no2,int no3) : " + (no1+no2+no3));
	}
	public void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4) : " + (no1+no2+no3+no4));
	}

	public static void main(String[] args) 
	{
		Calc c1= new Calc();
		
		c1.addFun(20.5f, 10.65f);
		
	}
}
/*
Method Overloadding Filter:-
------------------------------
	1. argument count
			|
	2. dataType match
			|
	3. Type pramotion Rule
	-------------------------
	
	boolean----X
	
				byte
				  |
				short
				  |
char------------>int  	
				  |
				long
				  |
			    float
				  |
			    double
			    
						
		
		


*/