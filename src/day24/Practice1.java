package day24;


import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Please enter language that you know");

        String l1 = scan.next();
        String l2 = scan.next();
        String l3 = scan.next();

        String[] languages = {l1, l2, l3};

        System.out.println(languages [2]);
        //1. print all values
        System.out.println(Arrays.toString(languages));
        // 2. for each
        for (String lan : languages ){
            System.out.println("Here is the language:  "  + lan);

            //for
        }


    }
}
