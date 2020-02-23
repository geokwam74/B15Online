package day06.day25;

import java.util.Arrays;

public class Review {

    public static void main(String[] args) {

        int[] nums = {13,31,8,5,21,2};
        System.out.println("nums = " + Arrays.toString(nums));

        int numItemCount = nums.length;

        int[] numCopy = new int [numItemCount] ;

        for (int x = 0; x <numItemCount; x++ ) {
            numCopy[x] = nums[x];

        }
        System.out.println("Before sort numsCopy = " +Arrays.toString(numCopy) );
        Arrays.sort(numCopy);

        System.out.println("After sort numsCopy = " +Arrays.toString(numCopy) );

        if (Arrays.equals(nums,numCopy)) {
            System.out.println("THIS ARRAYS IS ALREADY SORTED ");
        }else {
            System.out.println(" THIS ARRAYS IS NOT ALREADY SORTED" );
        }

    }
}
