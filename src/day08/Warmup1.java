package day08;

import java.util.Scanner;

public class Warmup1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("GUESS MY FAVORITE NUMBER : ");
        int myFavoriteNumber = scan.nextInt();

        if( myFavoriteNumber ==3000) {
            System.out.println("BINGO");
        }else{
            System.out.println("YOU ARE NOT MY FRIEND ,TRY AGAIN");

            int age = 18;
            if ( age >= 18) {
                System.out.println("Go Vote");
            } else{
                System.out.println("wait until you are 18");
            }

        }
    }
}
