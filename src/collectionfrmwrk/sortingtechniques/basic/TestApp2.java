package collectionfrmwrk.sortingtechniques.basic;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("rahul");
		list.add("ankur");
		list.add("ganesh");
		list.add("brijesh");
		list.add("sagar");
		list.add("kunal");
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("list.get("+i+") : " + list.get(i));
		}
		System.out.println("------------------------------------------------");
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println("list.get("+i+") : " + list.get(i));
		}
	}
}
