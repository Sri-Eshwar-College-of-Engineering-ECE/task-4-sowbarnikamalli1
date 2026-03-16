import java.sql.Connection;
import java.sql.PreparedStatement;

public class PaymentService {

    public void sendPayment(int senderId, int receiverId, double amount) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO transactions(sender_id,receiver_id,amount,status) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, senderId);
            ps.setInt(2, receiverId);
            ps.setDouble(3, amount);
            ps.setString(4, "SUCCESS");

            ps.executeUpdate();

            System.out.println("Payment Successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}