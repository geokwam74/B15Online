package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {

    public static void main(String[] args) {

        String sentence = "I Love Java Java Java";
        String[] wordsArray1 = sentence.split(" ", 1);
        String[] wordsArray2 = sentence.split(" ", 2);
        String[] wordsArray3= sentence.split( " ",  3);
        String[] wordsArray4= sentence.split( " ",  4);
        String[] wordsArray5= sentence.split( " ",  5);
        String[] wordsArray6 = sentence.split(" ", 6);

        System.out.println("wordArray1 = " + Arrays.toString(wordsArray1));
        System.out.println("wordArray2 = " + Arrays.toString(wordsArray2));
        System.out.println("wordArray3 = " + Arrays.toString(wordsArray3));
        System.out.println("wordArray4 = " + Arrays.toString(wordsArray4));
        System.out.println("wordArray5 = " + Arrays.toString(wordsArray5));
        System.out.println("wordArray6 = " + Arrays.toString(wordsArray6));
        //System.out.println("wordArray  size = " + wordsArray.length);
    }
}
