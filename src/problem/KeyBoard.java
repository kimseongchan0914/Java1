package problem;

import java.util.Scanner;

public class KeyBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int x = scanner.nextInt();

        boolean t = x % 4 == 0 && x % 5 == 0;
        boolean f = x % 4 == 0 || x % 5 == 0;
        boolean d = x % 4 == 0 ^ x % 5 == 0;

        System.out.println(t);
        System.out.println(f);
        System.out.println(d);
    }
}
