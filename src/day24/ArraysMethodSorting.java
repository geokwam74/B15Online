package day24;

import day10.Switch;

import java.util.Arrays;

public class ArraysMethodSorting {

    public static void main(String[] args) {

        int[] scores = {99, 44, 66, 23, 19,55};
        System.out.println(Arrays.toString(scores));
        System.out.println("original first item value: " + scores[0]);
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("new first item item value:  " + scores[0]);

        System.out.println("=========================");
        char[] nameChars = {'G', 'A','D','Z','C','A'};
        System.out.println("Before sorting nameChars = " + Arrays.toString(nameChars));
        System.out.println("nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("After sorting nameChars = " + Arrays.toString(nameChars));

        System.out.println("------------String sorting-------------");
        String[] superHeros = {"Superman", "Batman", "Wonder Women","Aquaman", "Cyborg", "Flash", "100","9", "09"};
        System.out.println("Before sorting superHeros = " + Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("after sorting superHeros = " + Arrays.toString(superHeros));

        System.out.println("==========boolean==============");
        boolean[] fiveSwitchOnOff = {true,false,false,true,true};
        System.out.println("fiveSwitchOnOff = " + Arrays.toString(fiveSwitchOnOff) );

        //Arrays.sort (arrObject) does not return a value that we can store
        // it only takes action to reshuffle the index of original array

    }
}
