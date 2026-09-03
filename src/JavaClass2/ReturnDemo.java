package JavaClass2;

public class ReturnDemo {
    public static void main(String[] args) {
        printScore(99);
        printScore(120);
    }

    public static void printScore(int score) {
        if (score <= 0 || score >= 100) {
            System.out.println("잘못된 점수입니다");
            return;
        }
        System.out.println("점수 :" + score);
    }
}
