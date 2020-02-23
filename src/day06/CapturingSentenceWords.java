package day06;

import java.util.Scanner;

public class CapturingSentenceWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name ? " );

        String name = scan.nextLine();
        System.out.println(" You have entered " + name);

        //Task 4
        //Use nextLine to ask your bio
        //What is your name
        //Which city you live in, including state
        //What is your street address
        System.out.println("What is your name ? " );
        System.out.println("Which city and state you live in ?");
        String cityAndState = scan.nextLine();
        System.out.println("You have entered City and State " + cityAndState);
        String streetAdress = scan.nextLine();
        System.out.println("What is your street address ?" + streetAdress);
        System.out.println("Your street adress : " + streetAdress);



    }
}
