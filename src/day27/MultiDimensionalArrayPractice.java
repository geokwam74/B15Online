package day27;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {
        //N dimensional Array MUST contains (N-1) dimensional arrays
        //2 dimesional array MUST contains (2-1) dimensional arrays
        String [][] names = {{"George","Ivy"},{"Christa","Ezra"}};

        System.out.println(names[1][0]);
        names[1][1] ="Ezra";
        System.out.println(names[1][1]);

        System.out.println(Arrays.toString(names[1]));

        //print:{{"George","Ivy"},{"Christa","Ezra"}};
        System.out.println(Arrays.deepToString(names));

        System.out.println("===========================");

        String [][] names1 = {{"George","Ivy"},{"Christa","Ezra"},{"Sarpong", "Bernice"}};
        System.out.println(Arrays.toString(names1[1]));
        System.out.println(Arrays.toString(names1[2]));
        System.out.println(Arrays.toString(names1[0]));
        System.out.println(Arrays.deepToString(names1));

        System.out.println("=====================");

        int [][] numbers = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        for ( int i = 0; i < numbers.length; i++) {
          //  System.out.println(Arrays.toString(numbers[i]));
            for (int j =0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] +" ");

               /* System.out.println("\n======================");
                int[][] ages = {{10},{12,13,14,16,17},{19,20,21,22,23}};
                for (int iy=0;iy <ages.length; iy++ ) {
                    for (int jy=0; jy < ages[jy].length; jy++) {
                        if (ages[iy][jy] % 2 ==0) {
                            System.out.println(ages[iy][jy] +"  ");*/


                        }

                    }
        System.out.println("============================");
        int[] arrD1 = {1,2,3};
        for (int each :arrD1) {
            System.out.println(each+" ");

        }

        System.out.println("===========================");
        int[][] arr2D = {{10,20,30},{40,50,60},{80,90,100}};

        //

        //for (int []each1DArray :arr2D)
                }










}
