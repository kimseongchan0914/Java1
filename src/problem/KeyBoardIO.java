package problem;

import java.util.Scanner;

public class KeyBoardIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 ~ 999 사이의 숫자를 입력하세요 : ");
        int n = scanner.nextInt();

        int a = n / 100;
        int b = (n/10) % 10;
        int c = n % 10;

        System.out.print("각 자릿수의 합 = " + (a + b + c));
    }
}
