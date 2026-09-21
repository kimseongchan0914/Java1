package ex0916;

import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        String originid = "goldzy";
        String originpassword = "qwer123";


        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");
        String id = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요 : ");
        String pssword = scanner.nextLine();

        System.out.println(originid.equalsIgnoreCase(id));
        System.out.println(originpassword.equals(pssword));
}}
