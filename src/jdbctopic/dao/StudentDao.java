package jdbctopic.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

// StudentDao----Student-Table(MySQL)
public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		int rowsAffected = 0;
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES('"+sbean.getName()+"',"+sbean.getStd()+","+sbean.getMarks()+")";
		
		System.out.println("insertQuery : " + insertQuery);
		
		Statement stmt = null;
		// 1. get DB Connection
		Connection conn = DBConnection.getConnection();
		
		// 2. Validate conn object
		if (conn != null) 
		{
			try 
			{
				//3. create statement obj
				stmt = conn.createStatement();
				
								// 4. execute Query
				rowsAffected = stmt.executeUpdate(insertQuery);
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		} 
		else 
		{
			System.out.println("StudentDao- insertStudent() Db not Conneected");
		}
		return rowsAffected;
	}
	public int updateStudent(StudentBean sbean , int rno) 
	{
		String updateQuery = "UPDATE Student SET name='"+sbean.getName()+"',std="+sbean.getStd()+",marks="+sbean.getMarks()+" WHERE rno="+rno;

		System.out.println("updateQuery : " + updateQuery);
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0 ;
		if (conn != null)
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(updateQuery);
			
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} 
		else 
		{
			System.out.println("Db not connected");
		}
		return rowsAffected;
	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = " + rno;
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0 ;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(deleteQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("Dn not connectec");
		}
		return rowsAffected;
	}
	public void getAllRecords() 
	{

	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ener Student Rno Which you want to Update  : ");
		int rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Ener Std : ");
		int std = sc.nextInt();
		System.out.println("Ener Marks : ");
		int marks = sc.nextInt();

		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao studentDao = new StudentDao();
		
		int rowsAffected = studentDao.updateStudent(sbean , rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Updated : " + rowsAffected);
		} 
		else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
		
		
/*				
		System.out.println("Ener Student Rno Which you want to Delete  : ");
		int rno = sc.nextInt();
		
		StudentDao studentDao = new StudentDao();
		
		int rowsAffected = studentDao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Deleted : " + rowsAffected);
		} 
		else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
//  -----------INSERT Student --------------------		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Ener Std : ");
		int std = sc.nextInt();
		System.out.println("Ener Marks : ");
		int marks = sc.nextInt();

//		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentBean sbean = new StudentBean();
		sbean.setName(name);
		sbean.setStd(std);
		sbean.setMarks(marks);
		
		StudentDao studentDao = new StudentDao();
		
		int rowsAffected = studentDao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully inserted : " + rowsAffected);
		} 
		else 
		{
			System.out.println("Student record not inserted : " + rowsAffected);
		}
*/		
	}
}