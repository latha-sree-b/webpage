import java.util.*;
class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int amount = sc.nextInt();
        Payment payment;
        if (type.equals("UPI")) {
            payment = new UpiPayment();
        } else {
            payment = new CardPayment();
        }
        payment.process(amount);
    }
}