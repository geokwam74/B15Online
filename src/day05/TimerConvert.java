package day05;

import java.util.Scanner;

public class TimerConvert {
    public static void main(String[] args) {

        /*
    Task 3 :
    *  Create an interactive program to ask user for day count
    *  and generate minute that day have
    * */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many minutes are in a day? ");
        double day = scan.nextDouble();
        double minutes = day * 1440;
        int workDay = scan.nextInt();
        int minute = workDay * 60 * 24;
        System.out.println(day + "days is " + minutes + "minutes");


    }
}
