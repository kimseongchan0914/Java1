package ex0909;

public class Poketmon {
    public static void main(String[] args) {
        Poketmon2 mypokemon = new Poketmon2("피카츄");
        mypokemon.setType("전기 타입").setLevel(25).learnSkill("백만볼트").attack();

    }
}

class Poketmon2 {
    String name;
    String type;
    int level;
    String skill;


    public Poketmon2 setType(String type) {
        this.type = type;
        return this;
    }

    public Poketmon2 setLevel(int level) {
        this.level = level;
        return this;
    }

    public Poketmon2 learnSkill(String skill) {
        this.skill = skill;
        return this;
    }

    public Poketmon2 (String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("가라," + name + "레벨 " + level+ "," + type );
        System.out.println(name + "의" + skill+ "\n효과는 굉장했다!");}
}