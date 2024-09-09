import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo_db?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "XXX";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
