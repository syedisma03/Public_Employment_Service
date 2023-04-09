package finals;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class HelloJava {
	
    public static void main(String[] args)throws Exception {
    	Scanner sc=new Scanner(System.in);
       System.out.println("Enter Your Choice:\n1.Insert New Job\n2.Job Allocation\n3.Display Available Jobs\n4.Display Employees\n5.Insert New Employee\n6.Salary Processing");
       Hello h1=new Hello();
       Emp h2=new Emp();
       Display h3=new Display();
       Empavai h4=new Empavai();
       Empp h5=new Empp();
       Salaryprocess h6=new Salaryprocess();
       int choice=sc.nextInt();
       switch(choice)
       {
       case 1:
    	   h1.insert_job();
    	   break;
       case 2:
    	   h2.emp();
    	   break;
       case 3:
    	   h3.display();
    	   break;
       case 4:
    	   h4.emp();
    	   break;
       case 5:
    	   h5.insert_emp();
    	   break;
	 case 6:
    	   h6.salprocess();
    	   break;
    	   
       }
    }
    
}

