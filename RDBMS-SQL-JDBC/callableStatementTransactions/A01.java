import java.sql.*;
import java.util.*;
public class A01 {

    public static void main(String[] args) throws SQLException 
    {
        
        BufferReader br= new BufferReader(new InputStreamReader(System.in));
        Connection connection = null;
        Statement stmt = null;
        CallableStatement cstmt = null;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");
   
        sql = "SELECT * FROM emp";

        stmt = connection.createStatement();

        ResultSet ans = stmt.executeQuery(sql);

        while (ans.next()) {
                int empno = ans.getInt("empno");
                String ename = ans.getString("ename");
                double netSalary = 0;

                String sql2 = "{ call calculate_salary(?, ?) }";

                cstmt = connection.prepareCall(sql2);
                cstmt.setInt(1, empno);
                cstmt.registerOutParameter(2, Types.DOUBLE);
                cstmt.executeQuery();

                netSalary = cstmt.getDouble(2);

                System.out.println("empno: " + empno + ", ename: " + ename + ", net salary: " + netSalary);
            }
      
    }
}
