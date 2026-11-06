package ex;

public class CardPayment extends Payment {
    int cardBalance;

    CardPayment(int cardBalance) {
        super("카드 결제");
        this.cardBalance = cardBalance;
    }
    void pay(int amount) {
        if ( amount > cardBalance) {
            System.out.println("카드 잔액이 부족합니다.");
        } else {
            cardBalance -= amount;
            System.out.println("결제 완료" + cardBalance);

        }
    }
}
