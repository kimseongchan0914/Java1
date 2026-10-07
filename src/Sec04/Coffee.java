package Sec04;

public class Coffee extends Drink{

    public void order(int count) {
        System.out.println(count + "잔 음료주문");
    }
    @Override
    public void order() {
        System.out.println("커피주문");
    }

    public void order(CoffeeSize size) {
        System.out.println(size + "사이즈 커피 주문");
    }
}
enum CoffeeSize {
    SMALL, LARGE
}
