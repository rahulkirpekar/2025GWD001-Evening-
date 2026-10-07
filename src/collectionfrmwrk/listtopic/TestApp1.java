package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// ArrayList -- Dynamic Array 
		
		ArrayList list = new ArrayList();
		
		list.add(true);//0-- boolean--Boolean--toString()	
		list.add('R');//1-- char------Character--toString()<==itr
		list.add(12);//2-- int--------Integer--toString()
		list.add(654L);//3--long------Long--toString()
		list.add(56.76543f);//4-- float--Float--toString()
		list.add(654.5432);//5-- double---Double--toString()
		list.add("Royal");//6-- String----String--toString()
		
		Student s1= new Student(1, "Rahul", 12, 90);
		
		list.add(s1);// 7--Student
		
		System.out.println("list.size() : " + list.size());
		
		
		// 4. Traditional way - By ListIterator Way (Forward + Backward Direction Iteration)
		//--------------------------------------------//--------------------------------------
		
		ListIterator itr = 	list.listIterator();
		
		while (itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student) 
			{
				Student s = (Student)obj;
				
				System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
				
			} else 
			{
				System.out.println(obj);
			}
		}
		System.out.println("--------------------------");
		
		while(itr.hasPrevious()) 
		{
			Object obj = itr.previous();
			
			if (obj instanceof Student) 
			{
				Student s = (Student)obj;
				
				System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
				
			} else 
			{
				System.out.println(obj);
			}
		}
		
/*		
	1. Standard for loop
	----------------------
	for(int i = 0 ; i < list.size();i++) 
		{
			Object obj = list.get(i);
			
			if(obj instanceof Student) 
			{
				Student s = (Student)obj;
				System.out.println("list.get("+ i +") : " + s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
			}
			else 
			{
				System.out.println("list.get("+ i +") : " + obj);
			}
		}		

 		2. Enhanced / ForEach / Advanced for loop
		--------------------------------------------
		
		for(Object value : list) 
		{
			if(value instanceof Student) 
			{
				Student s =(Student)value;
				System.out.println(s.getRno()+" " + s.getName()+" " +s.getStd()+" " + s.getMarks());
			}
			else 
			{
				System.out.println(value);// toString()---value
			}
		}

		// 3. Traditional way - By Iterator Way
		--------------------------------------------
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if(obj instanceof Student) 
			{
				Student s = (Student)obj;
				
				System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
			}else 
			{
				System.out.println(obj);
			}
		}
*/		
	}
}