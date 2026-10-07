package collectionfrmwrk.listtopic;

import java.util.ArrayList;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);//0
		list.add(4);//1
		list.add(10);//2
		list.add(65);//3
		list.add(89);//4
		list.add(29);//5
		list.add(2);//6
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
		// Update
//		list.set(2, 200);
		
		// delete By Index
//		list.remove(2);
		
		list.remove(Integer.valueOf(2));
		
		System.out.println("----------------");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------");
		
		list.clear();
		
		System.out.println("list.size() : " + list.size());
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
	}
}
/*

Primitive DataType	  WrapperClass	
     |				|	
1. boolean-------------->  Boolean
2. byte----------------->  Byte
3. char----------------->  Character 
4. short---------------->  Short
5. int------------------>  Integer 
6. long----------------->  Long 
7. float---------------->  Float
8. double--------------->  Double 




	1. insert----add()
	
	2. get(index)--
	
	3. Update Value --	set(index,value)

	4. remove -- by index , by Value

	5. clear---clear objects---empty list








*/
