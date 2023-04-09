package finals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Empavai {
	Scanner sc=new Scanner(System.in);
	public void emp()
	{
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	        Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery("Select * from empl");
	        int j=1;
	        System.out.println("If the valus is 0, employee is available. If the value is 1, employee is not available");
	        while(rs.next())
	        {
	        	String name=rs.getString(1);
	        	int avai=rs.getInt(7);
	        	System.out.println(j+" "+name+" "+avai);
	        	j++;
	        }
		}
		catch(Exception exes)
		{
			
		}
		
	}

}
