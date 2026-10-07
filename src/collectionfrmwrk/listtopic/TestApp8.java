package collectionfrmwrk.listtopic;

import java.util.Iterator;
import java.util.Vector;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(10);
		list.add(56);
		list.add(78);
		list.add(45);
		list.add(78);		
		list.add(34);
		list.add(989);
		
		Iterator<Integer> itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			Integer value = (Integer) itr.next();
			
			System.out.println(value);
		}
	}
}
