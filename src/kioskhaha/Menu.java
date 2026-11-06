package kioskhaha;

public class Menu {
    String name;
    int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
    void showInfo() {
        System.out.println("메뉴명 : " + name + "가격 : " + price);
    }
    int getPrice() {
        return price;
    }
}
