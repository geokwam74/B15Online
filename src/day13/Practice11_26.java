package day13;

import java.util.Scanner;

public class Practice11_26 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in) ;
        System.out.println("YOU WANT FOOD OR NOT ?");
        String mainOptions = scan.next() ;

        System.out.println("YOU WANT FOOD OR NOT ?");
        String secondaryOptions = scan.next() ;

        if (mainOptions.equalsIgnoreCase("food")) {
            System.out.println( "You have selected food");
            if (secondaryOptions.equalsIgnoreCase("snack")) {
                System.out.println("You have selected snack");
            }else if( secondaryOptions.equalsIgnoreCase("meal")) {
                System.out.println("YOU HAVE SELECTED MEAL");

            }else{
                System.out.println("NO SUCH FOOD OPTION");
            }
        }


    }
}
