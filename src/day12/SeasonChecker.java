package day12;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please");
        String season = scan.next();

        if (season.equalsIgnoreCase("spring")) {
            System.out.println();
        }
    }
}
