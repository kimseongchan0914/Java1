package problem;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원기둥의 밑면 반지름은? ");
        int a = scanner.nextInt();
        System.out.print("원기둥의 높이는? ");
        int b = scanner.nextInt();

        System.out.println("원기둥의 부피는 " + ((a*a)*b)*3.14);
    }
}
