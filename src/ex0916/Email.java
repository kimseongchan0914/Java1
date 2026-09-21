package ex0916;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이메일을 입력하세요 : ");
        String email = scanner.nextLine();

        int email1 = email.indexOf("@");

        String id = email.substring(0, email1);
        String domain = email.substring(email1+1);


        System.out.println("아이디 :" + id);
        System.out.println("아이디 :" + domain.toUpperCase());


    }
}
