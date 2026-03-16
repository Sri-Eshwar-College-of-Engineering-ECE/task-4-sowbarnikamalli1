import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            String url = "jdbc:postgresql://localhost:5432/payment_gateway";
            String user = "postgres";
            String password = "password";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}