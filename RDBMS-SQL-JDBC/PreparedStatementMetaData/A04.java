import java.sql.*;
import java.util.*;
public class A04 {

    public static void main(String[] args) throws SQLException 
    {
        
        BufferReader br= new BufferReader(new InputStreamReader(System.in));
        Connection connection = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");
        PreparedStatement pstmt = null;
        System.out.print("Enter the rollno: ");
        String rollstr = br.readLine();
        int rollno = Integer.parseInt(rollstr);
        System.out.print("Enter the new fees.")
        double fees = Double.parseDouble(br.readLine());
        sql = "UPDATE student SET fees = ? WHERE rollno = ?";
        pstmt = connection.prepareStatement(sql);
        pstmt.setDouble(1, fees);
        pstmt.setInt(2, rollno);
        System.out.println("Fees of student having rollno = " + rollno + " updated successfully");
 
       

    }

}
