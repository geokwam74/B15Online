package day29;

import java.util.Arrays;

public class StringPractice {


    private static String[] heroSplit;

    public static void main(String[] args) {
        String hero1 = " Superman-Clark J Kent";

        //task:
        //hero code is Superman and Identity is Clark Kent
        //the initial of the Hero is CK

        //Logic1 : split this String by dash
        //to get 2 piece of String into a String array
        String heroCode = heroSplit[0];
        String fullName = heroSplit[1];


        System.out.println("heroSplitted = " + Arrays.toString(heroSplit));

        System.out.println("Hero code is " + heroCode + " and Identity is " + fullName);

        //Logic 2:

        String[] fullNameSplitted = fullName.split(" ");
        System.out.println("fullNameSplitted = " + Arrays.toString(fullNameSplitted));
        String lastName = fullNameSplitted [fullNameSplitted.length -1];
        System.out.println("lastName = " + lastName);
        System.out.println("Intial of the hero is : " +fullName.charAt(0) + lastName.charAt(0));


    }
}
