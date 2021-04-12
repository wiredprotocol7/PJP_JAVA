import java.sql.*;

public class A01 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection c = null;
        Statement string = null;
        ResultSet ans;

      
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE"; //"jdbc:mysql://localhost:3306/mysql";
            c = DriverManager.getConnection(url, "system", "admin");
  

        String sql = "SELECT empno, ename FROM emp";
        string = c.createStatement();
        ans = string.executeQuery(sql);

        while (ans.next()) {
            System.out.println("empno: " + ans.getInt(1) + ", ename: " + ans.getString("ename"));
        }

    }
}
