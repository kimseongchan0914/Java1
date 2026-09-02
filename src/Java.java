import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("이름을 입력하세요: ");
       String name = scanner.nextLine();

       System.out.print("당신의 나이를 입력하세요: ");
       int age = scanner.nextInt();


       String city = scanner.nextLine();
       System.out.println("당신의 지역을 적어주세요");

       System.out.println();



    }
}
