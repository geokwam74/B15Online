package day22;

public class ArrayIntro1 {
    public static void main(String[] args) {

        byte [] data = new byte[4];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;

        System.out.println(data [0]);
        System.out.println(data [1]);
        System.out.println(data [2]);
        System.out.println(data [4]);

        data [3] = 127;
        System.out.println();



    }
}
