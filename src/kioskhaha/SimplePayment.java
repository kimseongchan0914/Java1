package kioskhaha;

public class SimplePayment extends Payment{
    int point;

    SimplePayment(int point) {
        super("간편 결제");
        this.point = point;
    }
    void pay(int amount){
            int temp = (int)(amount*0.05);
            point += temp;
            System.out.println("새로 적립된 포인트는" + temp + "총 보유 포인트는 " + point);
    }
}
