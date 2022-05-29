import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String pw = "password";
        try {
            Connection connect = DriverManager.getConnection(url, user, pw);

            Statement stmt = connect.createStatement();
            stmt.executeUpdate("use jdbc");
            stmt.executeUpdate("update abi set name = 'gvm' where id = 1");

            System.out.println("running");
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
