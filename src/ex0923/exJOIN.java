package ex0923;

public class exJOIN {
    public static void main(String[] args) {
        String[] item = {"키보드", "마우스", "모니터암"};
        int[] price = {89000,35000,45000};
        int total = 0;

        System.out.printf("===영수증===");
        String item1 = String.join(",", item);
        int item2 = item.length;

        for (int i =0; i <= price.length;i++) {
            total += price[i];
        }
        System.out.println("구매품목: " + item1);
        System.out.printf("품목 개수: " + item2);
        System.out.printf("---------");
        System.out.printf("결제 금액: " + total);

    }
}
