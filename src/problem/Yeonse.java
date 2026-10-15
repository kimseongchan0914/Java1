package problem;

import java.util.Scanner;

public class Yeonse {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("전공 이수 학점 : ");
        int a = scanner.nextInt();
        System.out.println("교양 이수 학점 : ");
        int b = scanner.nextInt();
        System.out.println("일반 이수 학점 : ");
        int c = scanner.nextInt();

        int flag = 0;
        if (a )
        int total = a + b + c;
        if (total >= 140 && a > 70 && b >30 && c > 30  ) {
            System.out.println("졸업 가능");
        }
        else
            System.out.println("졸업 불가");
    }
}
