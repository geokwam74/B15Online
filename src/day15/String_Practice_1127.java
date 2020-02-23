package day15;

import java.util.Scanner;

public class String_Practice_1127 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter my name please");
        String name = scan.next();
        int lengthOfTheName = name.length() ;

        System.out.println(" ");
        if ( lengthOfTheName <4) {
            System.out.println("Short Name");
        }else if (lengthOfTheName >= 4 && lengthOfTheName <= 11) {
            System.out.println("Medium Name");
        }else {
            System.out.println("Longer name");

            if (name.contains(" a") || name.contains("e")) ;
            System.out.println("name contains a or e");

        }




    }


}







