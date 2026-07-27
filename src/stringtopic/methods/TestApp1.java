package stringtopic.methods;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		//			   0123456789012345
		String name = "Royal Technosoft";
		
		System.out.println("name.length() : " + name.length());
		
		for (int i = 0; i < name.length(); i++) 
		{
			System.out.println("name.charAt("+i+") : " + name.charAt(i));	
		}
	}
}
