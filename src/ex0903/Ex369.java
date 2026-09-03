package ex0903;

public class Ex369 {
    public static void main(String[] args) {
        for (int i = 1; i < 36; i++) {
            int j = i % 10;
            int h = i / 10;


            if (h == 3 || h == 6 || h == 9)
                System.out.println("짝");

            if (j ==3 || j ==6 || j ==9)
                System.out.println("짝짝");

            else
                System.out.println(i);
        }
    }
}
