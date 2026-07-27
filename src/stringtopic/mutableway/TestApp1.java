package stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Mutable Behaviour
		StringBuilder firstName = new StringBuilder("Haresh");
		StringBuilder lastName = new StringBuilder("Prajapati");
		
		System.out.println("firstName : " + firstName+"---"+firstName.hashCode());
		System.out.println("lastName : " + lastName+"---"+lastName.hashCode());
		
		// Mutable Behaviour
		firstName.append(lastName);
		
		System.out.println("-----------------------");
		
		System.out.println("firstName : " + firstName+"---"+firstName.hashCode());
		System.out.println("lastName : " + lastName+"---"+lastName.hashCode());
		
/*		
		// Immutable Behaviour
		String firstName = "Haresh";
		String lastName = "Prajapati";
		
//		String fullName = firstName.concat(lastName);// HareshPrajapati

		String fullName = firstName + lastName;// HareshPrajapati

		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("fullName : " + fullName);
*/
	}
}
