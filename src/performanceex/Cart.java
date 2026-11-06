package performanceex;

import java.lang.reflect.Member;

public class Cart {
    Menu[] items = new Menu[10];
    int count = 0;
    MemberGrade grade = MemberGrade.NOMAL;

    void addMenu(Menu menu) {
        if (count <= items.length) {
            items[count] = menu;
            count++;
        }
        else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }
    int calculateTotal() {
        int sum = 0;
        for (int i =0; i < count; i++) {
            sum += items[i].getPrice();
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
    void setMemberGrade(MemberGrade grade) {
        this.grade = grade;
    }
    int calculateFinalPrice() {
        if (grade == MemberGrade.NOMAL) {
            return calculateTotal();
        }
        else {
            return (int)(calculateTotal() * 0.9);
        }
    }



}
