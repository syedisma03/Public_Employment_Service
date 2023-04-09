package finals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Salaryprocess {
	public void salprocess()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	        Statement st=con.createStatement();
	        Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	        ResultSet rs=st.executeQuery("Select * from empl");
	        Statement st2=con.createStatement();
	        while(rs.next())
	        {
	        	String name=rs.getString(1);
	        	int sal=rs.getInt(3);
	        	
	        
	        	int ava=rs.getInt(7);
	        	
	        	if(ava==1)
	        	{
	        		System.out.println(name+" "+sal);
	        	}
	        	
	        }
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
	}

}
