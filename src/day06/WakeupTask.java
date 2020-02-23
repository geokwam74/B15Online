package day06;


import java.util.Scanner;

public class WakeupTask {
    public static void main(String[] args) {


        //create a program to calculate the final discounted price of an item
        //create 3 double variables called regularPrice , salePrice and discountPackage
        //Ask user question using scanner for regularPrice and discountPercentage
        //And save the result into the variable
        //
        //Calculate sale price using above information
        //For example :  80 regular price , 0.2 for discount  , salePrice —>> 64
        //
        //Print out  : regular price is 80$ , discount is 0.2  and your got deal for 64 $

        Scanner scan = new Scanner(System.in);
        double regularPrice ;
        double salePrice ;
        double discountedPrice ;
        System.out.println("What is the regular price");
        regularPrice = scan.nextDouble() ;


        System.out.println("What is the sale price");
        salePrice = scan.nextDouble();

        System.out.println("What is the discounted rate");
        discountedPrice = scan.nextDouble();
        salePrice = regularPrice - regularPrice * discountedPrice ;
        System.out.println("regular price is " + regularPrice + "$");
        System.out.println("regular price is " + regularPrice + "$ , discounted is " + discountedPrice + "  and your got deal for " + salePrice + "    $");






    }
}
