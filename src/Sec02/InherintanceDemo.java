package Sec02;

public class InherintanceDemo {
    public static void main(String[] args) {
        Circle777 c1 = new Circle777();
        Ball c2 = new Ball("빨간색");

        System.out.println("원 : ");
        c1.findRadius();
        c1.findArea();

        System.out.println("\n공 : ");
        c2.findColor();
        c2.findVolume();

    }
}
