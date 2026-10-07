package JavaClass12;

public class Character {
    public static void main(String[] args) {
        Character c = new Character();
        Wizard w = new Wizard();
        c.attack();
        w.attack();
    }

    public void attack() {
        System.out.println("일반공격, 데미지 10!");
    }
}
