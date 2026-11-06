package performanceex;

public class SimplePayment extends Payment{
    int point;

    SimplePayment(int point) {
        super("간편 결제");
        this.point = point;
    }
    void pay(int amount) {
        if (amount <= 0) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println("결제 금액은 : " + amount + "원 입니다.");
            System.out.println("결제가 완료되었습니다.");
            int temp = (int)(amount * 0.05);
            System.out.println("새로 적립된 포인트는 : " + temp + "총 보유 포인트는 : " + point);
        }
    }
}
