package finals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Emp {
	public void emp() throws Exception
	{
	try
	{
		String namesal;
		int c=0;
        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cons=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        Statement sts=cons.createStatement();
        ResultSet rss=sts.executeQuery("Select * from joballocate");
       
        while(rss.next())
        {
        	/*System.out.println(" ++++++++++++++++ ");*/
        	namesal=rss.getString(1);
        /*	System.out.println(namesal);*/
        	
    		int sal=rss.getInt(2);
    		String place=rss.getString(3);
    		
    		int hour=rss.getInt(4);
    		
    		String shift=rss.getString(5);
    		
    		int avai=rss.getInt(7);
    		/*System.out.println(avai);
    		System.out.println("\n");*/
    		sat(namesal,sal,place,hour,shift,avai,c);
    		
        }
        			
    			
    		
        
	
	}
	catch (Exception ex)
	{
		System.out.println(ex.toString());
	}
	}
	
public static void sat(String namesal,int sal,String place,int hour,String shift,int avai,int c)
{
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("Select * from empl");
    Connection con2=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test","root","");
    Statement stmt2=con2.createStatement();
    Connection con3=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test","root","");
    Statement stmt3=con3.createStatement();
  

	 
	while(rs.next())
	{
		String names=rs.getString(1);
		String jobb=rs.getString(2);
		/*System.out.println(jobb);
		
		System.out.println(names);*/
		
		int sals=rs.getInt(3);
		String loc=rs.getString(4);
		int h=rs.getInt(5);
		int all=rs.getInt(7);
		
		String sh=rs.getString(6);
		/*System.out.println(names);
		System.out.println(jobb);
		System.out.println(h);
		System.out.println(sals);
		System.out.println(loc);
		System.out.println(sh);
		System.out.println(" ");
		System.out.println(all);*/
		
		/*
		
	System.out.println("\n");
	System.out.println("--------------------------------------");*/
	
	
		
		
			if(jobb.equals(namesal) && sal==sals && place.equals(loc) && all==0 && avai==0)
		
				{
		
			System.out.println("Job Allocated For");
			System.out.println(names);
			
			String sql = "UPDATE joballocate SET employee='"+names+"', allocate=1 WHERE JobType='"+jobb+"' AND allocate=0";
			
			 String sqls = "UPDATE empl SET allocate=1 WHERE job='"+namesal+"'";

             PreparedStatement  stmt = con2.prepareStatement(sql);
            PreparedStatement  stmt1 = con3.prepareStatement(sqls);
            

             stmt.executeUpdate(sql);
             stmt1.executeUpdate(sqls);
				}
	}
	}
			catch(Exception i)
			{
				System.out.println("eRRor");
			}
	if(c==0)
		System.out.println("No job allocation");
			
			
			
	

}
}
