package problem;

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("화씨 온도를 입력하시오 : ");
        float F = scanner.nextFloat();

        float C = 5f/9f * (F-32);

        System.out.println("섭씨온도는 " + C);
    }
}
