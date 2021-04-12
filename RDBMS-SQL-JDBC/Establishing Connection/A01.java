import java.sql.*;


public class A01 {

    public static void main(String[] args) throws SQLException {
        Connection c = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE"; //"jdbc:mysql://localhost:3306/mysql";
            c = DriverManager.getConnection(url, "system", "admin");
            System.out.println("Connection Established successfully");
        } catch (Exception e) {
            System.out.println("Connection could  not be established");
        } finally {
            if (c != null) c.close();
        }
    }
}
