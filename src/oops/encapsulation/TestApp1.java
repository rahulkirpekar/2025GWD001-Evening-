package oops.encapsulation;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e1= new Employee();
		
		e1.setId(1);
		e1.setName("Ganesh");
		e1.setSalary(10000);
		e1.setDsgn("SE");
		e1.setOrgName("ABC");
		
		System.out.println(e1.getId()+" " + e1.getName()+" " + e1.getSalary()+" " + e1.getDsgn()+" " + e1.getOrgName());
	}
}
