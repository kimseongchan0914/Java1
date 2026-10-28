package performance;


public class Menu {
    String name;
    int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void showInfo() {
        System.out.println("메뉴명은" + name + "가격은" + price);
    }
    int GetPrice() {
        return price;
    }
}
