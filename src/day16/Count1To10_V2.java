package day16;

public class Count1To10_V2 {
    public static void main(String[] args) {
        int counter = 0;
        while(counter<=10) {
            System.out.println(++counter);
        }

        int count = 0;
        while ( ++count <=10) {
            System.out.println(count);
        }
    }
}
