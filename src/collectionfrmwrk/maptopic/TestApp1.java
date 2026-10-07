package collectionfrmwrk.maptopic;

import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Data -- Key,Value --->Map[HashMap , LinkedHashMap , TreeMap]
		
		// HashMap---Notmaintain Insertion Order
		
		// LinkedHashMap---Maintain Insertion Order
		
		// TreeMap---Sorting--Ascending order
		
//		HashMap<Integer,String> mapObj = new HashMap<Integer,String>();
//		LinkedHashMap<Integer,String> mapObj = new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> mapObj = new TreeMap<Integer,String>();
		
		mapObj.put(11, "rahul");// Entry = [Key,Value]
		mapObj.put(2, "ankur");
		mapObj.put(39, "sagar");
		mapObj.put(14, "ganesh");
		mapObj.put(50, "jayu");
		
		for(	 Map.Entry<Integer, String> e : mapObj.entrySet()) 
		{
			int key = e.getKey();
			String value = e.getValue();
			
			System.out.println(key+"---"+value);
		}
	}
}
