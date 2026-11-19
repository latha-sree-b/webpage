
class UpiPayment extends Payment {
    @Override
    void process(int amount) {
        System.out.println("UPI: " + amount);
    }
}
