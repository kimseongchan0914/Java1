package JavaClass9;

public class sec03 {
    public static void main(String[] args) {
        int[] x = {0};
        System.out.println("호출 전의 x[0] = " + x[0]);

        increment(x);
        System.out.println("호출 후위 x[0] = "+ x[0]);


    }
    public static void increment(int[] n){
        System.out.println("increment() 메서드 안에서");
        System.out.println("n[0] = " + n[0] + " --> ");
        n[0]++;
        System.out.println("n[0] = " + n[0]);
    }
}
