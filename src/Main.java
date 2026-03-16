public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        PaymentService paymentService = new PaymentService();

        // Register user
        userService.registerUser("Alice", "alice@gmail.com", "1234");

        // Send payment
        paymentService.sendPayment(1, 2, 500);

    }
}