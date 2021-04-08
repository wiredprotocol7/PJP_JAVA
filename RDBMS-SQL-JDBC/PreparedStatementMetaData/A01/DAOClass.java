import java.sql.*;

public class DAOClass {
    private Connection connection = null;
    PreparedStatement pstatement = null;

    public DAOClass() 
    {
                
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "admin");
         
    }

    public void insert(int no, String name, String grade, String date, int fee) 
    {
        String sql = "INSERT INTO student VALUES(?, ?, ?, ?, ?)";
        pstatement = connection.prepareStatement(sql);
        pstatement.setInt(1, no);
        pstatement.setString(2, name);
        pstatement.setString(3, grade);
        pstatement.setString(4, date);
        pstatement.setInt(5, fee);
        pstatement.executeUpdate();          
        
    }

    public void delete(int rollno) 
    {
            String sql = "DELETE student WHERE rollno = ?";   
            pstatement = connection.prepareStatement(sql);
            pstatement.setInt(1, no);
            pstatement.executeUpdate();

    }

    public void modify(int rno, int fee)
    {
        String sql = "UPDATE student SET fee = ? WHERE rollno = ?";
            pstatement = conn.prepareStatement(sql);
            pstatement.setInt(1, fee);
            pstatement.setInt(2, no);
            pstatement.executeUpdate();
    }

    public boolean display(int rollno) 
    {
            String sql = "SELECT * FROM student WHERE rollno = ?";
            pstatement = connection.prepareStatement(sql);
            pstatement.setInt(1, rollno);
            ResultSet ans = pstatement.executeQuery();
            ResultSetMetaData ansmeta = ans.getMetaData();

            while (ans.next())
            {
                StringBuilder sb = new StringBuilder();

                for (int i = 1; i <= ansmeta.getColumnCount(); i++)
                {
                    String colName = ansmeta.getColumnName(i);

                    sb.append(ans.getObject(colName));
                    if (i != ansmeta.getColumnCount()) sb.append(", ");
                }
                System.out.println(sb);
            }

    }
 
    public boolean display() 
    {
            String sql = "SELECT * FROM stdnt";
            pstatement = connection.prepareStatement(sql);
            pstatement.setInt(1, rollno);
            ResultSet ans = pstatement.executeQuery();
            ResultSetMetaData ansmeta = ans.getMetaData();

            while (ans.next())
            {
                StringBuilder sb = new StringBuilder();

                for (int i = 1; i <= ansmeta.getColumnCount(); i++)
                {
                    String colName = ansmeta.getColumnName(i);

                    sb.append(ans.getObject(colName));
                    if (i != ansmeta.getColumnCount()) sb.append(", ");
                }
                System.out.println(sb);
            }

    }

   
}
