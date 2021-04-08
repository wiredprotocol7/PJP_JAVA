import java.sql.*;

public class A01 {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement string = null;
        ResultSet ans;

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");
  

        String sql = "SELECT empno, ename FROM emp";
        string = connection.createStatement();
        ans = string.executeQuery(sql);

        while (ans.next()) {
            System.out.println("empno: " + ans.getInt(1) + ", ename: " + ans.getString("ename"));
        }

    }
}
