//Using JDBC and HashMap

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.HashMap;


public class TM01P1 {

	 

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		   	 HashMap<String, Integer> DesignationDA = new HashMap<String,Integer>();
		   	 DesignationDA.put("e",20000);
		   	 DesignationDA.put("c", 32000);
		   	 DesignationDA.put("k", 12000);
		   	 DesignationDA.put("r", 15000);
		   	 DesignationDA.put("m", 40000);
	        Connection c = null;
	        Statement string = null;
	        ResultSet ans;
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
	        c = DriverManager.getConnection(url, "system", "admin");
	        System.out.println("Enter the employee ID:\n");
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String empnostring=br.readLine();
	        String sql = "SELECT * FROM employee WHERE EMPNO ="+empnostring;
	        string = c.createStatement();
	        ans = string.executeQuery(sql);
	        if(!ans.isBeforeFirst() )
	        {
	        	System.out.print("There is no employee with id "+ empnostring);
	        }

            while (ans.next()) {
            
                int da=DesignationDA.get(ans.getString("DESIGNATIONCODE").toLowerCase());
            	int sal=ans.getInt("BASIC")+ans.getInt("HRA")-ans.getInt("IT")+da;
            	//System.out.print(ans.getInt("BASIC")+"fdsfs");
                System.out.println(ans.getInt("EMPNO")+"\t"+ans.getString("EMPNAME")+"\t"+ans.getString("DEPARTMENT")+"\t"+Integer.toString(sal));
            }
        
    }
}