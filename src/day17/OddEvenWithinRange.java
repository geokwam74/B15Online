package day17;

public class OddEvenWithinRange {
    public static void main(String[] args) {

        int count = 0;
        while(count <=50) {
            System.out.print(count + " ");
            count += 2;
        }
        System.out.println("-------------");
        int count2 = 1;
        while (count2 <=50) {
            System.out.println(count2  + " ");
            count2 += 2;
        }

        System.out.println("-------------");
        int cnt3 = 0;
        while (cnt3 <= 50) {
        if( cnt3 %2 ==0) {
            System.out.println(cnt3 + " is even number");
        }else{
            System.out.println(cnt3   + " is odd number");
        }
        ++cnt3;

        }
    }
}
