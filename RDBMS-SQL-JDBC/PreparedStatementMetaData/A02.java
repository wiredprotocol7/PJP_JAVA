import java.sql.*;
import java.util.*;
public class A02 {

    public static void main(String[] args) throws SQLException {
        
        BufferReader br= new BufferReader(new InputStreamReader(System.in));
        Connection connection = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");
        PreparedStatement pstmt = null;
        System.out.print("Enter the rollno: ");
        String rollstr = Integer.parseInt(br.readLine());
        int rollno = Integer.parseInt(rollstr);
        String studentName = "";
        System.out.print("Enter name in lowercase and less than 20 in size: ");
        studentName = br.readLine();
        System.out.print("Enter standard: ");
        String standard = "";
        standard = br.readLine();
        System.out.print("Enter D.O.B.: ");
        String dob = br.readLine();
        System.out.print("Enter fees: ");
        Double fees = Double.parseDouble(br.reaLine();;

        String sql = "INSERT INTO student VALUES(?, ?, ?, ?, ?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollno);
            pstmt.setString(2, studentName);
            pstmt.setString(3, standard);
            pstmt.setString(4, dob);
            pstmt.setDouble(5, fees);
            pstmt.executeQuery();
            System.out.println("Student added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error");
            pstmt.close();
            connection.close();
        }


    }

}
