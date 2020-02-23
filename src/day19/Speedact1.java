package day19;

import java.util.Scanner;

public class Speedact1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter starting speed and ending speed");
        for ( int speedsx = 10; speedsx <=27; speedsx ++) {

            int start = scan.nextInt();
            int end = scan.nextInt();
            System.out.print("you have started at speed  ");
            for (int i = start; i <= end; i++) {

                System.out.print(i + " ");
            }

        }



        }

}
