package stringtopic.immutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
/*
		String name1 = "royal";
		String name2 = "royal";
		String name3 = "technosoft";
		String name4 = name3;
		String name5 = "royaltechnosoft";
		String name6 = name1.concat(name3);//royaltechnosoft

		String name7 = name6;
		
//Object Equality:-
//------------------
		System.out.println("2. referenceBased(==)      ");          
		System.out.println("-------------------------     "); 	
		System.out.println("name1==name2 : " + (name1==name2));				
		System.out.println("name1==name3 : " + (name1==name3));	    		
		System.out.println("name1==name4 : " + (name1==name4));	    		
		System.out.println("name1==name5 : " + (name1==name5));	    		
		System.out.println("name1==name6 : " + (name1==name6));	    		
		System.out.println("name1==name7 : " + (name1==name7));	    		
		System.out.println("name2==name3 : " + (name2==name3));	    		
		System.out.println("name2==name4 : " + (name2==name4));	    		
		System.out.println("name2==name5 : " + (name2==name5));	    		
		System.out.println("name2==name6 : " + (name2==name6));	    		
		System.out.println("name2==name7 : " + (name2==name7));      		
		System.out.println("name3==name4 : " + (name3==name4));	    		
		System.out.println("name3==name5 : " + (name3==name5));	    		
		System.out.println("name3==name6 : " + (name3==name6));	    		
		System.out.println("name3==name7 : " + (name3==name7));	    		
		System.out.println("name4==name5 : " + (name4==name5));	    		
		System.out.println("name4==name6 : " + (name4==name6));	    		
		System.out.println("name4==name7 : " + (name4==name7));	    		
		System.out.println("name5==name6 : " + (name5==name6));	    		
		System.out.println("name5==name7 : " + (name5==name7));	    		
		System.out.println("name6==name7 : " + (name6==name7));	    		

		
		
		System.out.println("2. valueBased(.equals())      ");          
		System.out.println("-------------------------     ");          
		System.out.println("name1.equals(name2) : " + name1.equals(name2));	        
		System.out.println("name1.equals(name3) : " + name1.equals(name3));	        
		System.out.println("name1.equals(name4) : " + name1.equals(name4));	        
		System.out.println("name1.equals(name5) : " + name1.equals(name5));	        
		System.out.println("name1.equals(name6) : " + name1.equals(name6));	        
		System.out.println("name1.equals(name7) : " + name1.equals(name7));	        
		System.out.println("name2.equals(name3) : " + name2.equals(name3));	        
		System.out.println("name2.equals(name4) : " + name2.equals(name4));	        
		System.out.println("name2.equals(name5) : " + name2.equals(name5));	        
		System.out.println("name2.equals(name6) : " + name2.equals(name6));	        
		System.out.println("name2.equals(name7) : " + name2.equals(name7));           
		System.out.println("name3.equals(name4) : " + name3.equals(name4));	        
		System.out.println("name3.equals(name5) : " + name3.equals(name5));	        
		System.out.println("name3.equals(name6) : " + name3.equals(name6));	        
		System.out.println("name3.equals(name7) : " + name3.equals(name7));	        
		System.out.println("name4.equals(name5) : " + name4.equals(name5));	        
		System.out.println("name4.equals(name6) : " + name4.equals(name6));	        
		System.out.println("name4.equals(name7) : " + name4.equals(name7));	        
		System.out.println("name5.equals(name6) : " + name5.equals(name6));	        
		System.out.println("name5.equals(name7) : " + name5.equals(name7));	        
		System.out.println("name6.equals(name7) : " + name6.equals(name7));           
				
	*/
//		2. By 'new' keyword way:-
//		----------------------------------------------------------------------------
	 
			String name8 = new String("royal");
			String name9 = new String("royal");
			String name10 = name8;
			String name11 = new String("xyz");

//	Object Equality:-
//	------------------
				System.out.println("1. referenceBased(==) : ");			
				System.out.println("------------------------");			
				System.out.println("name8==name9 : " + (name8==name9));//false		
				System.out.println("name8==name10 : " + (name8==name10));//true	    
				System.out.println("name8==name11 : " + (name8==name11));//false		
				System.out.println("name9==name10 : " + (name9==name10));//false	    
				System.out.println("name9==name11 : " + (name9==name11));//false	    
				System.out.println("name10==name11 : "+ (name10==name11) );//false	    
				
				System.out.println("2. valueBased(.equals()) : ");                         
				System.out.println("----------------------------");                         
				System.out.println("name8.equals(name9) : " +name8.equals(name9));//true	                 
				System.out.println("name8.equals(name10) :  "+name8.equals(name10));//true	               
				System.out.println("name8.equals(name11) :  "+name8.equals(name11));//false	               
				System.out.println("name9.equals(name10) :  "+name9.equals(name10));//true	               
				System.out.println("name9.equals(name11) :  "+name9.equals(name11));//false	              
				System.out.println("name10.equals(name11) : " +name10.equals(name11));//false	             
	}
}
