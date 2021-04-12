import java.sql.*;

public class A02 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Statement string = null;
        ResultSet ans;

        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");
  

        String sql = "SELECT * FROM emp WHERE sal > 1000 AND sal < 2000";
        string = connection.createStatement();
        ans = string.executeQuery(sql);

        while (ans.next()) {
            System.out.println(  ans.getString("ename") + ans.getString("job")+ ans.getDouble("sal")+ ans.getDouble("comm")));
        }
        if (string != null) string.close();
        if (ans != null) conn.close();

    }
}
