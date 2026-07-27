package stringtopic.methods;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		// equals---boolean					--> compareTo---int 
		// equalsIgnoreCase-----boolean		--> compareToIgnoreCase---int	

		String name1 = "royal";
		String name2 = "RoYal";
		 
//		if (name1.equals(name2)) 
//		if (name1.compareTo(name2)==0) 
//------------------------------------------------
			
//		if (name1.equalsIgnoreCase(name2)) 
		if (name1.compareToIgnoreCase(name2)==0) 
		{
			System.out.println("Both Strings are same");
		} else 
		{
			System.out.println("Both Strings are not same");
		}
	}
}