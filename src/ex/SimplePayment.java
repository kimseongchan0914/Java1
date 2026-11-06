package ex;

public class SimplePayment extends Payment {
    int point;

    SimplePayment(int point) {
        super("간편 결제");
        this.point = point;

    }
    void pay(int amount) {
        if (amount <= 0) {
            System.out.println("결제가 실패하였습니다.");
        }
        else {
            System.out.println("결제금액은 " + amount + "원 입니다.");
            System.out.println();
            int temp = (int)(amount * 0.05);
            point += temp;
            System.out.println("새롭게 적립된 포인트는 : " + temp + "총 보유 포인트는 : " + point);
        }
    }
}
