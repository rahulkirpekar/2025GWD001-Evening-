package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApp6 
{
	public static Object searchEmployeeByName(ArrayList<Employee> list, String searchValue, boolean flag) 
	{
		if(flag) 
		{
			for (int i = 0; i < list.size(); i++) 
			{
				Employee e = list.get(i);
				
				if (searchValue.equals(e.getName())) 
				{
					return true;// index--i
				}
			}
			return -1;	// -1
		}else 
		{
			int searchId = Integer.parseInt(searchValue);
			
			for (int i = 0; i < list.size(); i++) 
			{
				Employee e = list.get(i);
				
				if (searchId == e.getId()) 
				{
					return i;// index--i
				}
			}
			return -1;	// -1
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Employee> listOfEmp = new ArrayList<Employee>();
		
		Scanner sc= new  Scanner(System.in);
		
		int choice = 0;
		
		do 
		{
			System.out.println("Enter below choice for Employee Application : ");
			System.out.println("1. Add Employee--list");
			System.out.println("2. Update Employee By Id");//1
			System.out.println("3. Delete Employee By Id");
			System.out.println("4. Search Employee By Id");
			System.out.println("5. Search a Employees by Name.");//2
			System.out.println("6. Display All Employee Records");
			System.out.println("7. Remove All Employees from list.");//3
			System.out.println("8. Display All Employees Different traversal techniques.[Iterator + ListIterator]");//4
			System.out.println("9. Check whether a Employee is already enrolled.");// 5
			System.out.println("10. Display total enrolled Employees.");// 6
			System.out.println("11. Employee Application Exit");
			choice  = sc.nextInt();
			
			Employee e = null;
			
			switch(choice) 
			{
				case 1: e = new Employee();
						e.scanData();
						
						listOfEmp.add(e);
						System.out.println("Employee record succssfully added Record.");
						break;
						
				case 2:
						break;
				case 3:
						System.out.println("Enter Employee Id which you want to delete : ");
						int id = sc.nextInt();
						
						break;
				case 4:
						System.out.println("Enter Employee Id which you want to Search : ");
						int searchId = sc.nextInt();
						
						Object obj = searchEmployeeByName(listOfEmp, searchId+"", false);
						
						if(obj instanceof Integer) 
						{
							int result = (Integer)obj;
							if (result != -1) 
							{
								Employee e1 = 	listOfEmp.get(result);
								e1.dispData();
							}
							else 
							{
								System.out.println("Employee Id : "+searchId+" not found in Database." );
							}
						}
							break;
						
				case 5:
						sc.nextLine();
						System.out.println("Enter Employee Name which you want to Search : ");
						String searchName  = sc.nextLine();
						
						obj = searchEmployeeByName(listOfEmp, searchName, true);
						
						if(obj instanceof Integer) 
						{
							int result = (Integer)obj;
							if(result != -1) 
							{
								Employee esearchByName = listOfEmp.get(result);
								esearchByName.dispData();
							}else 
							{
								System.out.println("Employee Name : "+searchName+" not found in Database." );
							}				
						}else 
						{
								Boolean flag = (Boolean)obj;
								
								if(flag) 
								{
									System.out.println(searchName+" value of found in Database.");
								}else 
								{
									System.out.println("Employee Name : "+searchName+" not found in Database." );
								}
						}
						break;
				case 6:
						for (int i = 0; i < listOfEmp.size(); i++) 
						{
							e =	listOfEmp.get(i);
							e.dispData();
						}
						break;
				case 7:
						break;
				case 8:
						break;
				default:
						System.out.println("Invalid Choice,\n\t Please enter choice netween 1 to 8.");
			}
			
		}while(choice != 0);
	}
}