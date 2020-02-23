package day06.day25;

import java.util.Arrays;

public class String_Split_Method {

    public static void main(String[] args) {

        String sentence = "I love Java";
        String[] allwords = sentence.split( "");

        System.out.println("allwords = " + Arrays.toString(allwords));
        System.out.println("HOW MANY WORD DO I HAVE IN THIS SENTENCE" + " = " + allwords.length);

        System.out.println("Last word in this sentence is " + allwords [allwords.length-1 ] );

        String sentence2 = "Evertthing is Awesome";
        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr) );
    }
}
