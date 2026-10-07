package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Typesafe---Generic--Apply
		ArrayList<String>list = new ArrayList<String>();// String
		
		
		list.add("ganesh");//2
		list.add("ramesh");//3
		list.add("sagar");//4
		list.add("rahul");//0 <--itr
		list.add("ankur");//1
		list.add("ganesh");//2
		list.add("ramesh");//3
		list.add("sagar");//4
		list.add("kunal");//5
		
		System.out.println("list.size() : " + list.size());
		
		Iterator<String> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			String value = itr.next();
			System.out.println(value);
		}
	}
}
 