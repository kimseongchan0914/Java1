package ex0909;

public class ExSubway {
    public static void main(String[] args) {
        Subway myOrder = new Subway("이탈리안 비엠티");
        myOrder.selectBread("플랫브레드").selectCheese("슈레드").selectSauce("스위트칠리").print();

    }
}

class Subway {
    String menu;
    String bread;
    String cheese;
    String sauce;

   public Subway selectBread(String bread) {
        this.bread = bread;
        return this;
    }

    public Subway selectCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public Subway selectSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public Subway (String menu) {
       this.menu = menu;
    }

    public void print() {
        System.out.printf(menu + "완성!\n 빵:" + bread + "치즈: " + cheese + "소스: " + sauce);
    }

}

