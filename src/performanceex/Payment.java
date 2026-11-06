package performanceex;

public class Payment {
    protected String paymentName;

    Payment(String paymentName) {
        this.paymentName = paymentName;
    }
    void pay(int amount) {
        System.out.println("결제 수단은 : " +paymentName + "결제 금액은 : " + amount);
    }
}
