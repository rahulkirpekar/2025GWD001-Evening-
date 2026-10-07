package collectionfrmwrk.sortingtechniques.basic;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add('r');
		list.add("royal");
		list.add(76.543);
		list.add(27.43f);
		list.add(true);
		
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
