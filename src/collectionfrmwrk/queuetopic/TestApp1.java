package collectionfrmwrk.queuetopic;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queueObj = new PriorityQueue<String>();
		
		queueObj.add("rahul");
		queueObj.add("ankur");
		queueObj.add("krishna");
		queueObj.add("rakesh");
		queueObj.add("sagar");
		queueObj.add("jayant");
		
		// Natural Ordering
		while(!queueObj.isEmpty()) 
		{
			String name = queueObj.poll();
			
			System.out.println(name);
		}
/*		
		Iterator<String> itr = 	queueObj.iterator();
		while (itr.hasNext()) 
		{
			String value = (String) itr.next();
			System.out.println(value);
		}
*/		
	}
}
