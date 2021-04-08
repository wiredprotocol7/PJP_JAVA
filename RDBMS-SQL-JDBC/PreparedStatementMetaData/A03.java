import java.sql.*;
import java.util.*;
public class A03 {

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
        sql = "INSERT INTO student_log SELECT * FROM student WHERE rollno = ?";
        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, rollno);
        int logged = pstmt.executeUpdate();
        sql = "DELETE FROM student WHERE rollno = ?";
        pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, rollno);
        System.out.println("Student having rollno = " + rollno + " deleted successfully");
       

    }

}
