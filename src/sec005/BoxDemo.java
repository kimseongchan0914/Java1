package sec005;

class Box {
    public Box() {
        System.out.println("Box호출");
    }
}

class ColoredBox extends Box{
    public ColoredBox() {
        System.out.println("ColoredBox호출");
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        ColoredBox b = new ColoredBox();
    }
}
