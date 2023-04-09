package finals;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Display{
	void display()
	{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select * from joballocate");
        System.out.println("\n");
        System.out.println("Job Vacancies are");
        System.out.println("\n");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n");
        System.out.println("     "+"Job"+"         "+"Salary"+"         "+"Location"+"         "+"Working Hours"+"         "+"Working Shift");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        
        System.out.println("\n");
        int j=1;

    	
        while(rs.next())
        {
        
        	System.out.printf("%-1s %-10s %7s %17s %16s %24s %n",j,rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
        	   System.out.println("\n");
        	j++;
        }
        con.close();
        
        st.close();
        rs.close();
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
	}
	}

}
