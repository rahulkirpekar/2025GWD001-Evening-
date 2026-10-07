package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// Generics--Typesafe--Only One type value in List
		ArrayList<Double>list = new ArrayList<Double>();

		list.add(50.73);// primitive--->Object(Auto Boxing)---Implicit
		list.add(10.543);
		list.add(80.653);
		list.add(460.3);
		list.add(876.543);
		list.add(24.6543);
		
		Iterator<Double> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			double value = itr.next();// Object---primitive(UnBoxing)// Implicit
			
			System.out.println(value);;
		}
	}
}
