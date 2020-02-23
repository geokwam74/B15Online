package day17;


import java.util.Scanner;

public class ReverseNameWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        String name = scan.nextLine();
        int lastCharacterIndex = 0 ;
        while (lastCharacterIndex < name.length()) {
            if (lastCharacterIndex%2 == 1)
            System.out.println(name.charAt(lastCharacterIndex) );
        }
        ++lastCharacterIndex;
    }
}
