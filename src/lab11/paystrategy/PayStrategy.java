package lab11.paystrategy;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
