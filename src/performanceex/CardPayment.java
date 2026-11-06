package performanceex;

import javax.smartcardio.Card;

public class CardPayment extends Payment {
    int cardBalance;

    CardPayment(int cardBalance) {
        super("카드 결제");
        this.cardBalance = cardBalance;
    }

    void pay(int amount) {
        if (cardBalance >= amount) {
            cardBalance -= amount;
        } else {
            System.out.println("카드 잔액이 부족합니다.");
        }
    }
}
