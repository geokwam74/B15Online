package day05;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        //ask user for name
        //and capture the result
        //print your name is
        //ask user for birth year
        //and capture the result
        //print the age
        //ask user for height
        //capture the result
        //print the height
        //create scanner object
        //Scanner is class that comes from JDK
        //The import statement must be in between your package
        //declaration and before the beginning of the class
        //

        System.out.println("what is your height:");
        //String name = "George";
        //System.out.println("My name is " + name);
        //String name = scan.next();
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("My name is " + name);
        System.out.println("What is your birth year : ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear ;
        System.out.println("Your age is : " + age);
        System.out.println("What is height ? ");
        double height = scan.nextDouble();
        System.out.println("Your height is : " + height);




    }
}
