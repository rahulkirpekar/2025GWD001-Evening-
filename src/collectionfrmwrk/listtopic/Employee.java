package collectionfrmwrk.listtopic;

import java.util.Scanner;

public class Employee 
{
	private int id;
	private String name;
	private int salary;
	private String dsgn,orgName;
	
	public Employee() {
	}

	public Employee(int id, String name, int salary, String dsgn, String orgName) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
		this.orgName = orgName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDsgn() {
		return dsgn;
	}

	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void scanData() 
	{
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter Employee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter Employee OrgName : ");
		orgName = sc.nextLine();
	}
	
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " +dsgn+" " + orgName);
	}
}