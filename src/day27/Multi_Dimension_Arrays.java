package day27;

import java.util.Arrays;

public class Multi_Dimension_Arrays {





    /*single dimensional arrays

     */

    public static void main(String[] args) {
        int[] arrD1 = {1,2,3};
        //2D arrays : is an array that continues single dimensional arrays
        int [][] arr2D = {{1,2,3}, {4,5,6}};
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        //
        System.out.println(arr2D[0][2]);
        System.out.println(arr2D[1][1]);

        System.out.println(Arrays.deepToString(arr2D));

        String [][] names = {};



    }
}
