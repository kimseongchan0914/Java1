package JavaClass11;

public class SwitchDemo {
    public static void main(String[] args) {
        Gender gender = Gender.여성;

        String s = switch(gender) {
            case 남성 -> "은 병역의무 o";
            case 여성 -> "은 병역의무 x";
        };
        System.out.println(gender + s);
    }
    enum Gender {
        남성, 여성
    }
}
