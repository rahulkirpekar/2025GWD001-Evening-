package collectionfrmwrk.listtopic;

import java.util.ArrayList;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> mainList = new ArrayList<Integer>();
		
		mainList.add(5);//0
		mainList.add(4);//1
		mainList.add(10);//2
		mainList.add(65);//3
		
		
		Object obj[] = mainList.toArray();
		
		for (int i = 0; i < obj.length; i++) 
		{
			System.out.println(obj[i]);
		}
		
		boolean  flag = mainList.isEmpty();
		
		System.out.println("flag : " + flag);
		
//		ArrayList<Integer> subList = new ArrayList<Integer>();
		
//		subList.add(89);//0
//		subList.add(29);//1
//		subList.add(2);//2
		
//		for (int i = 0; i < mainList.size(); i++) 
//		{
//			System.out.println(mainList.get(i));
//		}

//		System.out.println("-------------------------");
//		mainList.addAll(subList);
//		mainList.addAll(1, subList);
//		
//		for (int i = 0; i < mainList.size(); i++) 
//		{
//			System.out.println(mainList.get(i));
//		}
		
		
		
//		System.out.println("list.indexOf(29) : " + list.indexOf(229));
//		System.out.println("list.contains(29) : "  +list.contains(29));
		

		
//		for (int i = 0; i < list.size(); i++) 
//		{
//			System.out.println(list.get(i));
//		}
//		list.add(3, 2000);
//		System.out.println("-----------------------");
//		for (int i = 0; i < list.size(); i++) 
//		{
//			System.out.println(list.get(i));
//		}
		
	}
}
