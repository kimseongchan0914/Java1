package JavaClass3;

class Student {
    String name;
    String major;

    void print() {
        System.out.println("===학생증===");
        System.out.println("이름은 :" + name );
        System.out.println("전공은 :" + major);
    }
}

public class StudentCard {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = " 김성찬";
        student.major = " 백엔드";
        student.print();




    }

}
