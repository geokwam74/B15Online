package day24;

import java.sql.Array;
import java.util.Arrays;

public class OfficeHours {

    public static void main(String[] args) {
        String[] cars = { "BMW" , "VW" , "Audi"};

        System.out.println(cars[0]);
        System.out.println(cars[1 ]);
        System.out.println(cars[2]);

        for ( int carsIndex =0; carsIndex <= 2; carsIndex++) {
            System.out.println("Here is your cars = " + cars);
        }

        for ( String carModel : cars) {
            System.out.println("I am done assigning the cars = " + carModel);
            System.out.println("==============================");

        }//
        int[] ages = {23,43,5,7,87};
        System.out.println(ages[2]);

        System.out.println(ages[3] - ages[2]);
        //
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        for (int ageOfStudent : ages ) {
            System.out.println("This student's age is " +  ageOfStudent);
            System.out.println("I am done");

            //
            System.out.println(Arrays.toString(ages));
            System.out.println("Hi George");
        }

    }
}
