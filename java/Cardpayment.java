class CardPayment extends Payment {
    @Override
    void process(int amount) {
        System.out.println("Card: " + amount);
    }
}
