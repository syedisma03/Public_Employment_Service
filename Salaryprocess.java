package finals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	    	Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
    		Statement stmt1=conn1.createStatement();
    		String sql = "DELETE FROM salary";
    		stmt1.executeUpdate(sql);
	        while(rs.next())
	        {
	        	String names=rs.getString(7);
	        	int sal=rs.getInt(3);
	        	
	        
	        	int ava=rs.getInt(1);
	        	
	        
	        	
	        	if(ava==1)
	        	{
	        		System.out.println(names+" "+sal);
	        		try
	        		{
	        			
	        		Class.forName("com.mysql.cj.jdbc.Driver");
	        		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	        		Statement stmt=conn.createStatement();
	        	
                    
	        		stmt.executeUpdate("INSERT INTO salary(salary,name)VALUES("+sal+",'"+names+"')");
	        		System.out.println("SUCCEED");
	        		System.out.println("\n");
	        		
	        		
	        		
	        		}
	        		catch(Exception ex)
	        		{
	        			System.out.println("ErRoR");
	        		}
	        		
	        	}
	        	
	        }
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
	}

}
