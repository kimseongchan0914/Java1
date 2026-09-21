package JavaClass3;


class Air {
    int temp;

    void tempUP() {
        if (temp < 30)
            temp += 1;
            System.out.println("온도 업! 현재 온도 :" + temp);
            if (temp == 30)
                System.out.println("최대온도!");

    }

}

public class Aircon {
    public static void main(String[] args) {
        Air myAir = new Air();
        myAir.temp = 24;
        myAir.tempUP();

    }

}
