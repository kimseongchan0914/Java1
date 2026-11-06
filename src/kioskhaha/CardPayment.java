package kioskhaha;

public class CardPayment extends Payment {
    int cardBalance;

    CardPayment(int cardBalance) {
        super("카드 결제");
        this.cardBalance = cardBalance;
    }
    void pay(int amount) {
        if (cardBalance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            cardBalance -= amount;
            System.out.println("결제 완료! 남은 카드 잔액은 : " + cardBalance);
        }
    }
}
