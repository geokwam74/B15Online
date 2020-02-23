package day06;

import java.util.Scanner;

class CapturingMultipleleWord {
    public static void main(String[] args) {


        // Task 4
        // use nextLine to ask your bio
        // whats your name
        // which city you live in , including state , Tyson, VA
        // What is your street address

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name ? ");
        String name = scan.next(); //it will only capture first word (separated by space)
        //String anotherWord = scan.next();
        int age = scan.nextInt();
        System.out.println("You have entered " + name);
       // System.out.println("Another word is " + anotherWord);
        System.out.println("You have entered age " + age);
        Scanner blabla = new Scanner(System.in);

        System.out.println("which city you live in , including state ? ");
        String cityAndState = blabla.nextLine();
        System.out.println("You have entered City and State : " + cityAndState);

        System.out.println("What is your street address ? ");
        String streetAddress = blabla.nextLine();
        System.out.println("Your street address : " + streetAddress);




    }
}
