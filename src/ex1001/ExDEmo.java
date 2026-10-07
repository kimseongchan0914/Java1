package ex1001;

public class ExDEmo {
    static int CountChar(String s, char c) {
        int a = 0;
        for (int i= 0;i < s.length() ;i++) {

            if (s.charAt(i) == c)
                a += 1;


        }
        return a;



    }
    public static void main(String[] args) {
        System.out.println(CountChar("jazz",'z'));
    }
}
