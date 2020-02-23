package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

        //Arrays class a class coming from java.util package

        String[] superHeros = {"Superman", "Batman", "Wonder Women","Aquaman", "Cyborg", "Flash"};
        System.out.println();

        String superHerosAsString  = Arrays.toString(superHeros);

        System.out.println("=============================");

        int[] numbers = {10,44,55,3,78};
        System.out.println("Arrays.toString(numbers) Result: ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("================================");

    }
}
