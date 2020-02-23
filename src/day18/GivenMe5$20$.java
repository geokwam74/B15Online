package day18;

import java.util.Scanner;

public class GivenMe5$20$ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println( " please give me 5 or 20!! ");
        int x = scan.nextInt();
        //if (x!=5 || x!=20) {
        while ( ! (x==5) || x==20 ) {


            System.out.println("Not the bill i am looking for");
            System.out.println("Given me 5 or 20");
            x = scan.nextInt();
        }
        System.out.println("THE HAPPY ENDING !! GOT THE MONEY");


    }
}
