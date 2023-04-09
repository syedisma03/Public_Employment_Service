package finals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Empp {
	Scanner sc=new Scanner(System.in);
	public void insert_emp() throws Exception
	{
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println("Enter Job salary:");
		int salary=sc.nextInt();
		System.out.println("Enter Job Name:");
		
		String names=sc.next();
		System.out.println("Enter Job Location:");
		String place=sc.next();
		System.out.println("Enter Working Hours:");
		int hour=sc.nextInt();
		System.out.println("Enter Working Shift:");
		String shift=sc.next();
		
		int aloc=0;
		
		
		
		try
		{
			System.out.println(salary);
			System.out.println(names);
			System.out.println(hour);
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		Statement stmt=conn.createStatement();

		stmt.executeUpdate("INSERT INTO empl(job,salary,location,hour,SHIFT,allocate,name)VALUES('"+names+"',"+salary+",'"+place+"',"+hour+",'"+shift+"',"+aloc+",'"+name+"')");
		System.out.println("SUCCEED");
		}
		catch(Exception ex)
		{
			System.out.println("ErRoR");
		}
		
	}

}
