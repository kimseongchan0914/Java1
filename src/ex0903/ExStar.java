package ex0903;

public class ExStar {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println();
            for (int j = 4;j > i; j --){
                System.out.print("*");
            }
        }
    }
}
