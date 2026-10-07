package Sec04;

public class Drink {
    public static void main(String args[]) {
        Coffee coffee = new Coffee();

        coffee.order();
        coffee.order(3);
        coffee.order(CoffeeSize.LARGE);
    }
    public void order() {
        System.out.println("음료 주문");
    }
}
