import java.sql.*;
import java.util.*;
public class A05 {

    public static void main(String[] args) throws SQLException 
    {
        
        BufferReader br= new BufferReader(new InputStreamReader(System.in));
        Connection connection = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");
        PreparedStatement pstmt = null;
        System.out.print("Enter the rollno: ");
        int rollno=0
      
        try {
         rollno = Integer.parseInt(br.readLine());
        }
         catch (Exception e)
         {
           
         }
      
      		try {			
	
          if (rollno != 0)
            sql = "SELECT * FROM student WHERE no = ?";
          else 
            sql = "SELECT * FROM student";

          pstmt = connection.prepareStatement(sql);
          if (rollno != 0) pstmt.setInt(1, rollno);
          ResultSet ans = pstmt.executeQuery();

          while (ans.next()) {
              int ROLLNO = ans.getInt("no");
              String STUDENTNAME = ans.getString("name");
              String STANDARD = ans.getString("grades");
              String DATE_OF_BIRTH = ans.getString("dob");
              double FEES = ans.getDouble("fees");

            System.out.println(ROLLNO + " " + STUDENTNAME + " " + STANDARD + 
                " " + DATE_OF_BIRTH + " " + FEES);
		      	}
		} 
      catch (SQLException e) 
      {
			e.printStackTrace();
		}

 
       

    }

}
