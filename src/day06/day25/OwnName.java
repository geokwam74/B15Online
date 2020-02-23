package day06.day25;

import java.util.Arrays;

public class OwnName {

    public static void main(String[] args) {

        String name = "Sarpong";

        char[] allCharsInName  = name.toCharArray();

        for ( char eachChar : allCharsInName ) {
            System.out.println("eachChar = " + eachChar);
        }

        // now count how many we have
        int count = 0;
        for (char eachChar : allCharsInName) {
             if (eachChar=='a') {
                 ++count;

             }
        }
        System.out.println("count = " + count);

        Arrays.sort(allCharsInName);
        System.out.println("AFTER SORTING allCharsInName = " + Arrays.toString(allCharsInName));

    }
}
