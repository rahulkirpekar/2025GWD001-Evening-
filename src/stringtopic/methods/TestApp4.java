package stringtopic.methods;

public class TestApp4 
{
	public static void main(String[] args) 
	{
//		String name = "RoYal";
//		name = name.toUpperCase();
//		name = name.toLowerCase();
//		System.out.println("Name : " + name);

			//		   01234567890	
//		String name = "royal technosoft private limited technosoft";
//		System.out.println("name.lastIndexOf(\"technosoft\") : " + name.lastIndexOf("technosoft"));
		
//		System.out.println("name.indexOf(\"technosoft\") : " + name.indexOf("technosoft"));		
//		System.out.println("name.startsWith(\"royal\") : " + name.startsWith("royal"));
//		System.out.println("name.endsWith(\"limited\") : " + name.endsWith("limited"));
		
//		System.out.println("name.contains(\"technosoft\") : " + name.contains("technosoft")); 
		
//		String name = " ";
//		System.out.println("name.isBlank() : " + name.isBlank());
//		System.out.println("name.isEmpty() : " + name.isEmpty());
		
//		String name = " royal technosoft ";
//		System.out.println("name.length() : " + name.length());
//		name = name.trim();
//		System.out.println("name.length() : " + name.length());

		
//		String name = "royal";
//		System.out.println("name : " + name);
//		name = name.repeat(5);
//		System.out.println("name : " + name);
		
//		String name = "royal technosoft private limited technosoft";
//		String words[] = name.split("\\s");
//		for (int i = 0; i < words.length; i++) 
//		{
//			System.out.println("words["+i+"] : " +words[i]);
//			
//		}
//		System.out.println("name : " + name);
//		name = name.replace("technosoft", "techno");
//		System.out.println("name : " + name);

		
//		String firstName = "rahul";
//		String lastName = "Kirpekar";
//		String fullName = firstName.concat(" "+lastName);
//		System.out.println("fullName : " + fullName);
		
		
//		String name = "royal";
//		// String---byte
//		byte b[]= name.getBytes();
//		for (int i = 0; i < b.length; i++) 
//		{
//			System.out.println(name.charAt(i)+"---"+b[i]);
//		}
		
//		char v[] = name.toCharArray();
//		for (int i = 0; i < v.length; i++) 
//		{
//			System.out.println("v["+ i +"] : "  +v[i]);
//		}
		
		// valueOf --- (type values---convert into---String)
		
//		String v1 = String.valueOf(10);
//		System.out.println(v1+1000);// 101000
		
		
		//XXXXX.parseXXX(String value---convert into concened type)
		
		String v1 = "20";
		String v2 = "10";
		
		System.out.println("Addition : " + (v1+v2));
		
		int no1 = Integer.parseInt(v1);
		int no2 = Integer.parseInt(v2);
		
		int ans = no1 + no2;
		
		System.out.println("Addition : " + ans);
	}
}
