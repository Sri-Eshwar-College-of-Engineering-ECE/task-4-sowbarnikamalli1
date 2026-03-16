import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserService {

    public void registerUser(String name, String email, String password) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(name,email,password) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);

            ps.executeUpdate();

            System.out.println("User Registered Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}