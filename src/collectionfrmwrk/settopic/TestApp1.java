package collectionfrmwrk.settopic;

import java.util.HashSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Notmaintain Insertion Order
		HashSet<String> set = new HashSet<String>();
		
		// Maintain Insertion Order
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		// Sorting--Ascending order
//		TreeSet<String> set = new TreeSet<String>();
		
		set.add("ganesh");
		set.add("ramesh");
		set.add("sagar"); 	
		set.add("rahul");
		set.add("ankur"); 
		set.add("ganesh");
		set.add("ramesh");
		set.add("sagar"); 
		set.add("kunal");
		
		System.out.println("list.size() : " + set.size());
		
		Iterator<String> itr =	set.iterator();
		
		while(itr.hasNext()) 
		{
			String value = itr.next();
			System.out.println(value);
		}
	}
}