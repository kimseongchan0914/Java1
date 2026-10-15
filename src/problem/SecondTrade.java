package problem;

import java.util.Scanner;

public class SecondTrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("초 단위 정수를 입력하세요 : ");
        int a = scanner.nextInt();

        int b = a / 3600;
        int c = (a%3600) / 60;
        int d = (a%3600) % 60;

        System.out.println(b + "시간 " + c + "분 " + d + "초");

    }
}
