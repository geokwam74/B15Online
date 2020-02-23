package day06;

import java.util.Scanner;

public class Reminder {
    public static void main(String[] args) {

        //+ - /
        // + - * /
        // % this is another operator along with others
        // it's called modulus or remainder operator
        // it will give you the remaining result after
        // two whole number division

        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5.0 / 2f );
        //5 divided 2 is 2 reminder 1
        System.out.println( 5 % 2 );
        //10*9 + 9 = 99
        System.out.println( 99 % 10);
        //10*10 = 100
        System.out.println( 100 % 10);

        //declare a variable called minutes data type int
        //print the result in x hour y minutes format
        // for example 135 minutes, 2hours 15 minutes
        System.out.println();

        int minutes = 135;
        int hourPart = minutes / 60; //--->2
        int minsPart = 135 * 60;  //--->15
        System.out.println("The minutes" + minutes + "minutes" + hourPart + "hours and " +"minutes");
        System.out.println("===============================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the minute you want to convert ");
        int mins = scan.nextInt();   // 135 ; //60*2+15

        int hPart = minutes / 60;     //135/60 ;  // -->> 2
        int mPart = minutes % 60; // 135%60 ;  // -->> 15

        System.out.println(" The minutes " + minutes + " is "
                + hourPart + " hours and " + mPart + " minutes");






    }
}
