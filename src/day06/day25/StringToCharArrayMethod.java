package day06.day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {
        String name = "George";

        //how would be store each and every character
        //to an


        char[] nameChar = new char[6]; //[name.length() ];
       /* nameChar[0] = name.charAt(0);
        nameChar[1] = name.charAt(1);
        nameChar[2] = name.charAt(2);
        nameChar[3] = name.charAt(3);
        nameChar[4] = name.charAt(4);
        nameChar[5] = name.charAt(5);

        */

        for (int x = 0; x < nameChar.length; x++) {

            nameChar[x] = name.charAt(x);

        }
        System.out.println("nameChar = " + Arrays.toString(nameChar));

        char[] namesChar2 = name.toCharArray();
        System.out.println("namesChar2 = " + Arrays.toString(namesChar2));
    }
}
