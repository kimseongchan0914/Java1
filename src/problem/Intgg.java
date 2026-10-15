package problem;

import java.util.Scanner;

public class Intgg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 :");
        int n = scanner.nextInt();

        System.out.println(n + "의 제곱은 " + n*n);
    }
}
