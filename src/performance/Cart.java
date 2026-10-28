package performance;

public class Cart {
    Menu[] items = new Menu[10];
    int count = 0;

    void addMenu(Menu menu) {
        if (count < items.length) {
            items[count] = menu;
            count ++;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }
    int calculateTotal() {
        int sum = 0;
        for (int i =0; i < count; i++) {
            sum = sum + items[i].GetPrice();
        }
        return sum;
    }

    void showCart() {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                items[i].showInfo();
            }System.out.println("주문금액" + calculateTotal());
        } else {
            System.out.println("비어있음");
        }


    }

    public static void main(String[] args) {
        Menu m1 = new Menu("아메리카노", 3500);
        Menu m2 = new Menu("카페라떼" , 4000);
        Menu m3 = new Menu("블루베리스무디", 4500);

        Cart cart = new Cart();

        cart.addMenu(m1);
        cart.addMenu(m1);
        cart.addMenu(m2);
        cart.addMenu(m3);

        cart.showCart();

        System.out.println("총 주문 금액 : " + cart.calculateTotal() + "원");

        for (int i = 0; i < 7; i++) {
            cart.addMenu(m1);
        }

        cart.showCart();
    }
}
