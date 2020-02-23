package day06;

import java.util.Scanner;

public class Next_Line_MixtureProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is you name ? ");
        String name = scan.nextLine();
        System.out.println("Your name is" + name);
        System.out.println("What is your age? ");
        int age = scan.nextInt();
       // String age = scan.nextLine();
        scan.nextLine();
        System.out.println("Your is your age " + age);

        System.out.println("What is your address ?" );
        String address = scan.nextLine();
        System.out.println("Your address is "+ address);




    }
}
