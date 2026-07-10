package oops.inhtopic.hieinh;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee();
		techEmp.scanData();
		techEmp.dispData();

		System.out.println("-------------------------------------");
		
		NonTechEmployee nonTechEmp = new NonTechEmployee();
		nonTechEmp.scanData();
		nonTechEmp.dispData();
	}
}
